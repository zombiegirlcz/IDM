package p48;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.joint.api.data.JointAccountCloseReason;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import g48.t0;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import oxd.m;
import rnb.w;
import yji.n;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AccountId.Joint f232850l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final JointAccountCloseReason f232851m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t0 f232852n;
    public final jt0.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w f232853p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gte.a f232854q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cne.a f232855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.k f232856s;

    public k(AccountId.Joint accountId, JointAccountCloseReason closeReason, t0 pendingTransactionProvider, jt0.b pocketsWithTotalBalanceProvider, w savingsVaultInteractor, gte.a featureToggleInteractor, cne.a stampDutyInteractor, ybl.k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(closeReason, "closeReason");
        Intrinsics.checkNotNullParameter(pendingTransactionProvider, "pendingTransactionProvider");
        Intrinsics.checkNotNullParameter(pocketsWithTotalBalanceProvider, "pocketsWithTotalBalanceProvider");
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(stampDutyInteractor, "stampDutyInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f232850l = accountId;
        this.f232851m = closeReason;
        this.f232852n = pendingTransactionProvider;
        this.o = pocketsWithTotalBalanceProvider;
        this.f232853p = savingsVaultInteractor;
        this.f232854q = featureToggleInteractor;
        this.f232855r = stampDutyInteractor;
        this.f232856s = tradingAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p48.i
            if (r0 == 0) goto L13
            r0 = r8
            p48.i r0 = (p48.i) r0
            int r1 = r0.f232846w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f232846w = r1
            goto L18
        L13:
            p48.i r0 = new p48.i
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f232846w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L52
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L2f:
            yhm.o.b(r8)
            cfl.l r8 = cfl.l.f23745a
            r2 = 2
            ybl.k r4 = r7.f232856s
            w4l.h r5 = w4l.h.f294642c
            r6 = 0
            kotlinx.coroutines.flow.Flow r8 = ybl.k.k(r4, r5, r6, r8, r2)
            ox5.d0 r2 = new ox5.d0
            r4 = 29
            r2.<init>(r4)
            jhi.b r8 = mo3.a.g(r8, r6, r2, r3)
            r0.f232846w = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts r8 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts) r8
            java.util.List r8 = r8.f105278a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r8 = r8.iterator()
        L61:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L73
            java.lang.Object r1 = r8.next()
            boolean r2 = r1 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.GIA
            if (r2 == 0) goto L61
            r0.add(r1)
            goto L61
        L73:
            boolean r8 = r0.isEmpty()
            r1 = 0
            if (r8 == 0) goto L7c
        L7a:
            r3 = r1
            goto L9c
        L7c:
            java.util.Iterator r8 = r0.iterator()
        L80:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r8.next()
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$GIA r0 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.GIA) r0
            boolean r2 = com.revolut.shared.feature.wealth.models.trading_accounts.d.c(r0)
            if (r2 == 0) goto L80
            cfl.b r0 = r0.d
            cfl.b r2 = cfl.b.CREATED
            if (r0 == r2) goto L80
            cfl.b r2 = cfl.b.TERMINATED
            if (r0 == r2) goto L80
        L9c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p48.k.Z2(gim.c):java.lang.Object");
    }

    public final void b3(int i, int i2, int i3) {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(i3, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.JointAccounts;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        N2(new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new m(this, 16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x016c, code lost:
    
        if (r3 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0185, code lost:
    
        if (r3 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0189, code lost:
    
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6 A[PHI: r1 r4 r14 r16
      0x00e6: PHI (r1v23 java.lang.Object) = (r1v21 java.lang.Object), (r1v1 java.lang.Object) binds: [B:34:0x00e3, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r4v3 java.util.List) = (r4v2 java.util.List), (r4v8 java.util.List) binds: [B:34:0x00e3, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r14v2 long) = (r14v1 long), (r14v5 long) binds: [B:34:0x00e3, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r16v3 long) = (r16v1 long), (r16v6 long) binds: [B:34:0x00e3, B:19:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0121 A[PHI: r1 r4 r13 r14 r16
      0x0121: PHI (r1v29 java.lang.Object) = (r1v28 java.lang.Object), (r1v1 java.lang.Object) binds: [B:47:0x011e, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r4v4 java.util.List) = (r4v3 java.util.List), (r4v10 java.util.List) binds: [B:47:0x011e, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r13v3 int) = (r13v1 int), (r13v6 int) binds: [B:47:0x011e, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r14v3 long) = (r14v2 long), (r14v7 long) binds: [B:47:0x011e, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0121: PHI (r16v4 long) = (r16v3 long), (r16v7 long) binds: [B:47:0x011e, B:18:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r19) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p48.k.c3(gim.c):java.lang.Object");
    }
}
