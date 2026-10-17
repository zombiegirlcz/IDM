package k7c;

import com.revolut.feature.revolutpay.impl.data.service.RevolutPayService;
import com.revolut.feature.revolutpay.impl.domain.models.pendingcashback.PendingCashbackDetails;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevolutPayService f181987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f181988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w4l.f f181989c;

    public p0(RevolutPayService revolutPayService, ne0.j memoryCache) {
        Intrinsics.checkNotNullParameter(revolutPayService, "revolutPayService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f181987a = revolutPayService;
        this.f181988b = memoryCache;
        final int i = 0;
        final int i2 = 1;
        this.f181989c = new w4l.f(new Function2(this) { // from class: k7c.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f181985b;

            {
                this.f181985b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return te0.w.o0(skm.p0.f264003c, new l0(this.f181985b, null, 1));
                    default:
                        PendingCashbackDetails value = (PendingCashbackDetails) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181985b.f181988b.f("PENDING_CASHBACK_DETAILS", value);
                        return Unit.f186387a;
                }
            }
        }, new k5e.k(this, 10), new Function2(this) { // from class: k7c.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p0 f181985b;

            {
                this.f181985b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return te0.w.o0(skm.p0.f264003c, new l0(this.f181985b, null, 1));
                    default:
                        PendingCashbackDetails value = (PendingCashbackDetails) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(value, "value");
                        this.f181985b.f181988b.f("PENDING_CASHBACK_DETAILS", value);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
