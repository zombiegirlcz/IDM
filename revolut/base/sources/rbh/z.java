package rbh;

import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tnb.g0;

/* JADX INFO: loaded from: classes9.dex */
public final class z implements i1j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferSubjectId f253111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f253112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gr6.a f253113c;
    public final b d;
    public final g0 e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f253114g;

    public z(TransferSubjectId transferSubjectId, t transferOperation, gr6.a freelancerAccountDetailsInteractor, b pocketPickerAllowedBalanceTypesProvider, g0 tradingCurrencyCompatibilityInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(transferOperation, "transferOperation");
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(pocketPickerAllowedBalanceTypesProvider, "pocketPickerAllowedBalanceTypesProvider");
        Intrinsics.checkNotNullParameter(tradingCurrencyCompatibilityInteractor, "tradingCurrencyCompatibilityInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f253111a = transferSubjectId;
        this.f253112b = transferOperation;
        this.f253113c = freelancerAccountDetailsInteractor;
        this.d = pocketPickerAllowedBalanceTypesProvider;
        this.e = tradingCurrencyCompatibilityInteractor;
        this.f = featureToggleInteractor;
        k1j.a[] elements = {k1j.a.JOINT_ACCOUNT, k1j.a.JOINT_VAULTS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f253114g = kotlin.collections.d.y0(elements);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c1, code lost:
    
        r14 = true;
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b A[PHI: r14
      0x012b: PHI (r14v7 boolean) = (r14v5 boolean), (r14v5 boolean), (r14v5 boolean), (r14v5 boolean), (r14v5 boolean), (r14v5 boolean), (r14v8 boolean) binds: [B:104:0x01b6, B:102:0x01aa, B:82:0x0175, B:77:0x0166, B:73:0x015f, B:65:0x0148, B:54:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012e A[PHI: r14
      0x012e: PHI (r14v6 boolean) = 
      (r14v5 boolean)
      (r14v5 boolean)
      (r14v5 boolean)
      (r14v5 boolean)
      (r14v5 boolean)
      (r14v5 boolean)
      (r14v5 boolean)
      (r14v5 boolean)
      (r14v5 boolean)
      (r14v5 boolean)
      (r14v8 boolean)
     binds: [B:85:0x017a, B:97:0x01a0, B:98:0x01a2, B:104:0x01b6, B:82:0x0175, B:75:0x0162, B:77:0x0166, B:71:0x015b, B:73:0x015f, B:65:0x0148, B:54:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0101 -> B:52:0x010c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x012b -> B:106:0x01ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x012e -> B:106:0x01ba). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(rbh.z r17, java.util.List r18, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r19, java.util.Set r20, java.util.Set r21, gim.c r22) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rbh.z.c(rbh.z, java.util.List, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, java.util.Set, java.util.Set, gim.c):java.lang.Object");
    }

    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        return nim.a.u(new v(this, balanceGroupList, null), zi0.c.i(balanceGroupList));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(io3.d r5, rbh.t r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof rbh.y
            if (r0 == 0) goto L13
            r0 = r7
            rbh.y r0 = (rbh.y) r0
            int r1 = r0.f253110w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253110w = r1
            goto L18
        L13:
            rbh.y r0 = new rbh.y
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253110w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            xi0.a r7 = xi0.b.Companion
            java.lang.String r2 = r5.f163147c
            boolean r7 = h30.l.D(r7, r2)
            if (r7 == 0) goto L7a
            io3.k r5 = r5.f
            io3.k r7 = io3.k.ACTIVE
            if (r5 != r7) goto L7a
            w4l.j r5 = w4l.j.f294644c
            gr6.a r7 = r4.f253113c
            et6.g r7 = (et6.g) r7
            vkm.d r5 = r7.d(r5)
            zfd.e r5 = zi0.c.w(r5)
            rbh.j r7 = new rbh.j
            r2 = 3
            r7.<init>(r2)
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r7, r3)
            mle.x r7 = new mle.x
            r2 = 19
            r7.<init>(r5, r4, r6, r2)
            r0.f253110w = r3
            java.lang.Object r7 = vkm.q.z(r7, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L74
            boolean r5 = r7.booleanValue()
            goto L75
        L74:
            r5 = 0
        L75:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L7a:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rbh.z.d(io3.d, rbh.t, gim.c):java.lang.Object");
    }
}
