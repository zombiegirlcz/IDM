package nfj;

import com.revolut.retail.feature.esim.api.model.EsimSubscriptionStatement;
import com.revolut.retail.feature.esim.impl.network.EsimStatementsService;
import kfj.s4;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes11.dex */
public final class v1 {

    @NotNull
    public static final q1 Companion = new q1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimStatementsService f215060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kg.o f215061b;

    public v1(EsimStatementsService statementsService, kg.o gson) {
        Intrinsics.checkNotNullParameter(statementsService, "statementsService");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f215060a = statementsService;
        this.f215061b = gson;
    }

    public static final EsimSubscriptionStatement a(v1 v1Var, Response response) {
        kg.o oVar = v1Var.f215061b;
        Object objBody = response.body();
        if (objBody == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object objC = oVar.c(((ResponseBody) objBody).string(), s4.class);
        Intrinsics.checkNotNullExpressionValue(objC, "fromJson(...)");
        s4 s4Var = (s4) objC;
        Intrinsics.checkNotNullParameter(s4Var, "<this>");
        return new EsimSubscriptionStatement(s4Var.getContent());
    }
}
