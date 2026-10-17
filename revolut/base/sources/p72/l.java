package p72;

import android.os.Parcelable;
import com.revolut.feature.apm.multibanco.impl.ui.apm_ext.MultibancoPendingPaymentExtension$Parcel;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends yji.n implements tak.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zq.a f233533l;

    public l(zq.a interactor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f233533l = interactor;
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
            boolean r0 = r6 instanceof p72.j
            if (r0 == 0) goto L13
            r0 = r6
            p72.j r0 = (p72.j) r0
            int r1 = r0.f233531w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233531w = r1
            goto L18
        L13:
            p72.j r0 = new p72.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233531w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            sak.g r5 = r5.f261440a
            java.lang.Object r5 = r5.i
            h02.c r5 = (h02.c) r5
            r0.f233531w = r3
            zq.a r6 = r4.f233533l
            java.lang.Object r5 = r6.g(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r5 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p72.l.H(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow N(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(new tak.b(7, null), 2);
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
            boolean r0 = r6 instanceof p72.k
            if (r0 == 0) goto L13
            r0 = r6
            p72.k r0 = (p72.k) r0
            int r1 = r0.f233532w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233532w = r1
            goto L18
        L13:
            p72.k r0 = new p72.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233532w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            sak.g r5 = r5.f261440a
            java.lang.Object r5 = r5.i
            h02.c r5 = (h02.c) r5
            r0.f233532w = r3
            zq.a r6 = r4.f233533l
            java.lang.Object r5 = r6.A(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default r5 = com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default.f102412a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p72.l.d0(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow q(Parcelable parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        MultibancoPendingPaymentExtension$Parcel multibancoPendingPaymentExtension$Parcel = parcel instanceof MultibancoPendingPaymentExtension$Parcel ? (MultibancoPendingPaymentExtension$Parcel) parcel : null;
        return new v1(new i(this, multibancoPendingPaymentExtension$Parcel != null ? multibancoPendingPaymentExtension$Parcel.f62574a : null, null));
    }

    @Override // tak.d
    public final Flow u0(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(f0.f322471a, 2);
    }
}
