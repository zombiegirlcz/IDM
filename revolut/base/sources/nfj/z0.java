package nfj;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.esim.impl.network.EsimPlanOffersService;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nfj.x0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class z0 implements v0 {

    @NotNull
    public static final w0 Companion = new w0();
    public static final Type f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimPlanOffersService f215077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f215078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f215079c;
    public final gte.a d;
    public final x4l.c e;

    static {
        Type type = new TypeToken<List<? extends kfj.j2>>() { // from class: com.revolut.retail.feature.esim.impl.repositories.EsimPlanOffersRepositoryImpl$Companion$planOfferDtoType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f = type;
    }

    public z0(EsimPlanOffersService api2, ne0.j memoryCache, ue0.c storage, gte.a featureToggle) {
        Intrinsics.checkNotNullParameter(api2, "api");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(featureToggle, "featureToggle");
        this.f215077a = api2;
        this.f215078b = memoryCache;
        this.f215079c = storage;
        this.d = featureToggle;
        Continuation continuation = null;
        this.e = new x4l.c(new mtj.k(this, continuation, 16), new l(this, 5), new n8i.e(this, 20), new naf.j(this, continuation, 13), new lp6.g(this, continuation, 28));
    }

    public static String a(y0 y0Var) {
        return p.a.p("PLAN_OFFER_KEY_", y0Var.f215073a, y0Var.f215074b instanceof x0.b ? "upsell" : "default");
    }
}
