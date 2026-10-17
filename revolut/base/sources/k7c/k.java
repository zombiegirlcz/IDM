package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayService f181972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f181973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b80.c f181974c;
    public final w4l.f d;

    public k(RevolutPayService revolutPayService, ne0.j memoryCache, b80.c networkStateRepository) {
        Intrinsics.checkNotNullParameter(revolutPayService, "revolutPayService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        this.f181972a = revolutPayService;
        this.f181973b = memoryCache;
        this.f181974c = networkStateRepository;
        final int i = 0;
        final int i2 = 1;
        this.d = new w4l.f(new Function2(this) { // from class: k7c.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f181965b;

            {
                this.f181965b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String orderToken = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
                        kotlinx.coroutines.d dVar = skm.p0.f264003c;
                        k kVar = this.f181965b;
                        return te0.w.n0(te0.w.o0(dVar, new k3k.q0(kVar, orderToken, null, 21)), kVar.f181974c);
                    default:
                        String orderToken2 = (String) obj2;
                        q6c.h value = (q6c.h) obj3;
                        Intrinsics.checkNotNullParameter(orderToken2, "orderToken");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181965b.f181973b.f("ORDER_DETAILS_MEMORY_PREFIX_" + orderToken2, value);
                        return Unit.f186387a;
                }
            }
        }, new k5e.k(this, 7), new Function2(this) { // from class: k7c.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f181965b;

            {
                this.f181965b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String orderToken = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(orderToken, "orderToken");
                        kotlinx.coroutines.d dVar = skm.p0.f264003c;
                        k kVar = this.f181965b;
                        return te0.w.n0(te0.w.o0(dVar, new k3k.q0(kVar, orderToken, null, 21)), kVar.f181974c);
                    default:
                        String orderToken2 = (String) obj2;
                        q6c.h value = (q6c.h) obj3;
                        Intrinsics.checkNotNullParameter(orderToken2, "orderToken");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181965b.f181973b.f("ORDER_DETAILS_MEMORY_PREFIX_" + orderToken2, value);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
