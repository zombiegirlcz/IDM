package wbk;

import com.google.gson.reflect.TypeToken;
import com.revolut.retail.feature.plan_gifting.impl.network.PlanGiftingReceiverService;
import java.lang.reflect.Type;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th6.p;
import vvc.s;
import w3c.n;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements f {

    @NotNull
    public static final g Companion = new g();
    public static final Type e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanGiftingReceiverService f296245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.d f296246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f296247c;
    public final x4l.c d;

    static {
        Type type = new TypeToken<vbk.f>() { // from class: com.revolut.retail.feature.plan_gifting.impl.repository.PlanGiftingReceiverRepositoryImpl$Companion$introType$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        e = type;
    }

    public h(PlanGiftingReceiverService service, ne0.d memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f296245a = service;
        this.f296246b = memoryCache;
        this.f296247c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new p(this, continuation, 25), new n(this, 27), new s(this, 29), new w50.g(this, continuation, 16), new sne.e(this, continuation, 26));
    }
}
