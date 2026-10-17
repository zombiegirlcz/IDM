package l32;

import android.os.Parcelable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.impl.ui.pending_payments.consent.wrapper.ApmConsentPendingPaymentExtension$ConsentId;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentInputNotSupportedError;
import klf.w1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import vkm.y;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends n implements tak.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final oz1.c f191842l;

    public e(oz1.c apmConsentsInteractor) {
        Intrinsics.checkNotNullParameter(apmConsentsInteractor, "apmConsentsInteractor");
        this.f191842l = apmConsentsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(sak.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof l32.c
            if (r0 == 0) goto L13
            r0 = r6
            l32.c r0 = (l32.c) r0
            int r1 = r0.f191840w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191840w = r1
            goto L18
        L13:
            l32.c r0 = new l32.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191840w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            sak.g r5 = r5.f261440a
            java.lang.Object r5 = r5.i
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            r0.f191840w = r3
            oz1.c r6 = r4.f191842l
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r5 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l32.e.H(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow N(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(new tak.b(7, null), 2);
    }

    @Override // tak.d
    public final void T1(tak.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(sak.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof l32.d
            if (r0 == 0) goto L13
            r0 = r6
            l32.d r0 = (l32.d) r0
            int r1 = r0.f191841w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f191841w = r1
            goto L18
        L13:
            l32.d r0 = new l32.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f191841w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            sak.g r5 = r5.f261440a
            java.lang.Object r5 = r5.i
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            java.lang.String r5 = (java.lang.String) r5
            r0.f191841w = r3
            oz1.c r6 = r4.f191842l
            java.lang.Object r5 = r6.c(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r5 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l32.e.d0(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow q(Parcelable parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Continuation continuation = null;
        ApmConsentPendingPaymentExtension$ConsentId apmConsentPendingPaymentExtension$ConsentId = parcel instanceof ApmConsentPendingPaymentExtension$ConsentId ? (ApmConsentPendingPaymentExtension$ConsentId) parcel : null;
        String str = apmConsentPendingPaymentExtension$ConsentId != null ? apmConsentPendingPaymentExtension$ConsentId.f62361a : null;
        if (str == null) {
            return new go.g(new Data(null, PendingPaymentInputNotSupportedError.f102407a, false, 5, null), 2);
        }
        return new y(new w1(2, 4, continuation), new v1(new b(this, str, null)));
    }

    @Override // tak.d
    public final Flow u0(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(f0.f322471a, 2);
    }
}
