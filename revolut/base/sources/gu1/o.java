package gu1;

import android.os.Parcelable;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.blik.impl.ui.apm_ext.BlikPendingPaymentExtension$BlikTransactionParcel;
import com.revolut.feature.apm.blik.impl.ui.confirmation.InvalidPendingTransactionState;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.sso.api.exceptions.UserFailedSsoException;
import gsh.w;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import retrofit2.HttpException;
import vkm.v1;
import vkm.y;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends yji.n implements tak.d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final eu1.a f146673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w39.b f146674m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final du1.b f146675n;
    public final ju1.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ku1.d f146676p;

    public o(eu1.a blikInteractor, w39.b locationInteractor, du1.b blikErrorProvider, ju1.a codeUsageObserver, ku1.d confirmationObserver) {
        Intrinsics.checkNotNullParameter(blikInteractor, "blikInteractor");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(blikErrorProvider, "blikErrorProvider");
        Intrinsics.checkNotNullParameter(codeUsageObserver, "codeUsageObserver");
        Intrinsics.checkNotNullParameter(confirmationObserver, "confirmationObserver");
        this.f146673l = blikInteractor;
        this.f146674m = locationInteractor;
        this.f146675n = blikErrorProvider;
        this.o = codeUsageObserver;
        this.f146676p = confirmationObserver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(gu1.o r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof gu1.i
            if (r0 == 0) goto L13
            r0 = r7
            gu1.i r0 = (gu1.i) r0
            int r1 = r0.f146667w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146667w = r1
            goto L18
        L13:
            gu1.i r0 = new gu1.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146667w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L7d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            eu1.a r5 = r5.f146673l
            eu1.h r5 = (eu1.h) r5
            xt1.d r5 = r5.f129469a
            com.revolut.feature.apm.blik.impl.data.network.BlikService r5 = r5.f308742a
            efm.d0 r5 = r5.getBlikTransactions()
            xrl.a r7 = new xrl.a
            r2 = 13
            r7.<init>(r2)
            xt1.a r2 = new xt1.a
            r4 = 2
            r2.<init>(r4, r7)
            r5.getClass()
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r5, r2, r4)
            java.lang.String r5 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            ufm.n r7 = te0.w.i0(r7)
            gqh.a r2 = new gqh.a
            r4 = 9
            r2.<init>(r6, r4)
            gqk.b r6 = new gqk.b
            r4 = 18
            r6.<init>(r2, r4)
            ufm.i r2 = new ufm.i
            r4 = 1
            r2.<init>(r7, r6, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            r0.f146667w = r3
            java.lang.Object r7 = nim.a.b(r2, r0)
            if (r7 != r1) goto L7d
            return r1
        L7d:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gu1.o.Z2(gu1.o, java.lang.String, gim.c):java.lang.Object");
    }

    public static TransactionDetailsDestination b3(String str) {
        return new TransactionDetailsDestination(new k71.c(str), (rhf.d) null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D0(sak.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof gu1.m
            if (r0 == 0) goto L13
            r0 = r6
            gu1.m r0 = (gu1.m) r0
            int r1 = r0.f146672w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146672w = r1
            goto L1a
        L13:
            gu1.m r0 = new gu1.m
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146672w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L52
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            sak.g r5 = r5.f261440a
            java.lang.Object r5 = r5.i
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.blik.BlikTransaction"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            c02.j r5 = (c02.j) r5
            c02.a r6 = c02.a.USER_TIMEOUT
            eu1.a r2 = r4.f146673l
            eu1.h r2 = (eu1.h) r2
            ufm.n r5 = r2.c(r5, r6)
            r0.f146672w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            java.lang.String r6 = (java.lang.String) r6
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Navigation r5 = new com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Navigation
            kotlin.jvm.internal.Intrinsics.h(r6)
            com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination r6 = b3(r6)
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: gu1.o.D0(sak.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        ((ku1.b) this.f146676p).D(Boolean.TRUE);
    }

    @Override // yji.n
    public final void E2() {
        ((ku1.b) this.f146676p).D(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(sak.c r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof gu1.j
            if (r0 == 0) goto L13
            r0 = r13
            gu1.j r0 = (gu1.j) r0
            int r1 = r0.f146669x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146669x = r1
            goto L18
        L13:
            gu1.j r0 = new gu1.j
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146669x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            c02.j r12 = r0.u
            yhm.o.b(r13)
            goto L60
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            yhm.o.b(r13)
            java.lang.String r13 = "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.api.models.ApmPendingPaymentData"
            kotlin.jvm.internal.Intrinsics.i(r12, r13)
            sak.g r13 = r12.f261440a
            java.lang.Object r13 = r13.i
            java.lang.String r2 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.blik.BlikTransaction"
            kotlin.jvm.internal.Intrinsics.i(r13, r2)
            c02.j r13 = (c02.j) r13
            sak.a r12 = r12.f261441b
            com.revolut.feature.transfer.core.models.FundingSource r12 = r12.f261435a
            java.lang.String r12 = r12.f92240a
            eu1.a r2 = r11.f146673l
            eu1.h r2 = (eu1.h) r2
            ufm.n r12 = r2.b(r13, r12)
            r0.u = r13
            r0.f146669x = r3
            java.lang.Object r12 = nim.a.b(r12, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            r10 = r13
            r13 = r12
            r12 = r10
        L60:
            java.lang.String r13 = (java.lang.String) r13
            kotlin.jvm.internal.Intrinsics.h(r13)
            com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination r8 = b3(r13)
            c02.e r12 = r12.f20115b
            int[] r13 = gu1.f.f146662a
            int r12 = r12.ordinal()
            r12 = r13[r12]
            r13 = 14
            r0 = 0
            if (r12 == r3) goto L9c
            r1 = 2
            if (r12 == r1) goto L9c
            r1 = 3
            if (r12 == r1) goto L94
            r1 = 4
            if (r12 == r1) goto L8b
            r1 = 5
            if (r12 != r1) goto L85
            goto L8b
        L85:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L8b:
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.apm.blik.api.R$string.blik_transaction_confirmation_status_title_success_refund
            r12.<init>(r1, r0, r0, r13)
        L92:
            r5 = r12
            goto La4
        L94:
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.apm.blik.api.R$string.blik_transaction_confirmation_status_title_success_withdraw
            r12.<init>(r1, r0, r0, r13)
            goto L92
        L9c:
            com.revolut.core.ui_kit.models.TextLocalisedClause r12 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.apm.blik.api.R$string.blik_transaction_confirmation_status_title_success_payment
            r12.<init>(r1, r0, r0, r13)
            goto L92
        La4:
            ju1.a r12 = r11.o
            kotlin.Unit r1 = kotlin.Unit.f186387a
            r12.D(r1)
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ActionsBottomSheet r4 = new com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$ActionsBottomSheet
            com.revolut.core.ui_kit.models.TextLocalisedClause r7 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r12 = com.revolut.retail.feature.pending_payments.api.R$string.pending_payments_result_accept_success_button
            r7.<init>(r12, r0, r0, r13)
            r6 = 0
            r9 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gu1.o.H(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow N(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new go.g(new tak.b(7, null), 2);
    }

    @Override // tak.d
    public final boolean O0(Throwable throwable, sak.c cVar) throws IOException {
        ServerError serverErrorC;
        sak.g gVar;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Continuation continuation = null;
        Object obj2 = (cVar == null || (gVar = cVar.f261440a) == null) ? null : gVar.i;
        c02.j jVar = obj2 instanceof c02.j ? (c02.j) obj2 : null;
        boolean z = throwable instanceof HttpException;
        du1.b bVar = this.f146675n;
        if (z) {
            HttpException exception = (HttpException) throwable;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(exception, "exception");
            serverErrorC = bVar.f117532a.c(exception);
        } else {
            serverErrorC = throwable instanceof ServerErrorException ? ((ServerErrorException) throwable).f : null;
        }
        if (throwable instanceof UserFailedSsoException) {
            if (jVar != null) {
                T2(new gm6.j(this, jVar, continuation, 13), new yi5.b(27));
                return true;
            }
            IllegalStateException illegalStateException = new IllegalStateException("BLIK SSO failure without BlikTransaction");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            c3();
            return true;
        }
        if (serverErrorC != null && serverErrorC.f51362a == 34201) {
            yji.n.j2(this, L2(new y0(null, new z(new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_not_available, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, new l(this, null, 1), 3);
            return true;
        }
        if (throwable instanceof InvalidPendingTransactionState) {
            yji.n.j2(this, L2(new y0(null, new z(new TextLocalisedClause(R$string.blik_transaction_confirmation_status_title_not_available, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, new l(this, null, 0), 3);
            return true;
        }
        if (serverErrorC == null) {
            return false;
        }
        yji.n.l2(this, L2(new y0(null, bVar.a(serverErrorC, jVar), false, 5)), null, new n(this, null), 3);
        return true;
    }

    public final void c3() {
        A2(u0.b(new FinishCommand(null, null, null, 7)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tak.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(sak.c r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof gu1.k
            if (r0 == 0) goto L13
            r0 = r7
            gu1.k r0 = (gu1.k) r0
            int r1 = r0.f146671x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146671x = r1
            goto L18
        L13:
            gu1.k r0 = new gu1.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146671x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            c02.j r6 = r0.u
            yhm.o.b(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            java.lang.String r7 = "null cannot be cast to non-null type com.revolut.retail.feature.pending_payments.api.models.ApmPendingPaymentData"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            sak.g r6 = r6.f261440a
            java.lang.Object r6 = r6.i
            java.lang.String r7 = "null cannot be cast to non-null type com.revolut.feature.apm.core.models.blik.BlikTransaction"
            kotlin.jvm.internal.Intrinsics.i(r6, r7)
            c02.j r6 = (c02.j) r6
            eu1.a r7 = r5.f146673l
            eu1.h r7 = (eu1.h) r7
            ufm.n r7 = r7.c(r6, r4)
            r0.u = r6
            r0.f146671x = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            java.lang.String r7 = (java.lang.String) r7
            kotlin.jvm.internal.Intrinsics.h(r7)
            com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination r7 = b3(r7)
            c02.e r6 = r6.f20115b
            int[] r0 = gu1.f.f146662a
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 14
            if (r6 == r3) goto L92
            r1 = 2
            if (r6 == r1) goto L92
            r1 = 3
            if (r6 == r1) goto L8a
            r1 = 4
            if (r6 == r1) goto L82
            r1 = 5
            if (r6 != r1) goto L7c
            goto L82
        L7c:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L82:
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.apm.blik.api.R$string.blik_transaction_confirmation_status_title_rejected_refund
            r6.<init>(r1, r4, r4, r0)
            goto L99
        L8a:
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.apm.blik.api.R$string.blik_transaction_confirmation_status_title_rejected_withdraw
            r6.<init>(r1, r4, r4, r0)
            goto L99
        L92:
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.apm.blik.api.R$string.blik_transaction_confirmation_status_title_rejected
            r6.<init>(r1, r4, r4, r0)
        L99:
            ju1.a r0 = r5.o
            kotlin.Unit r1 = kotlin.Unit.f186387a
            r0.D(r1)
            com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$StatusDialog r0 = new com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$StatusDialog
            r0.<init>(r6, r4, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gu1.o.d0(sak.c, gim.c):java.lang.Object");
    }

    @Override // tak.d
    public final Flow q(Parcelable parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Continuation continuation = null;
        BlikPendingPaymentExtension$BlikTransactionParcel blikPendingPaymentExtension$BlikTransactionParcel = parcel instanceof BlikPendingPaymentExtension$BlikTransactionParcel ? (BlikPendingPaymentExtension$BlikTransactionParcel) parcel : null;
        return new v1(new w(this, blikPendingPaymentExtension$BlikTransactionParcel != null ? blikPendingPaymentExtension$BlikTransactionParcel.f61657a : null, continuation, 2));
    }

    @Override // tak.d
    public final Flow u0(sak.c paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        return new y(new g2d.c(2, 9, null), new v1(new h(paymentData, this, null)));
    }
}
