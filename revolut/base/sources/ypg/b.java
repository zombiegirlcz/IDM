package ypg;

import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.Subaccount;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ppg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppg.b f315865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f315866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.b f315867c;
    public final y91.b d;
    public final p38.a e;
    public final gte.a f;

    public b(ppg.b vaultsInteractor, c savingsBackgroundInteractor, g6e.b subbaccountBackgroundInteractor, y91.b accountsProductFeatureChecker, p38.a jointAccountsProductFeatureChecker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(savingsBackgroundInteractor, "savingsBackgroundInteractor");
        Intrinsics.checkNotNullParameter(subbaccountBackgroundInteractor, "subbaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(jointAccountsProductFeatureChecker, "jointAccountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f315865a = vaultsInteractor;
        this.f315866b = savingsBackgroundInteractor;
        this.f315867c = subbaccountBackgroundInteractor;
        this.d = accountsProductFeatureChecker;
        this.e = jointAccountsProductFeatureChecker;
        this.f = featureToggleInteractor;
    }

    public static Subaccount d(s sVar) {
        switch (a.f315863a[sVar.e.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 8:
                throw new IllegalStateException(("Vault with " + sVar.e + " cannot be converted to Subaccount").toString());
            case 4:
                return new Subaccount.Group(sVar);
            case 5:
                int i = a.f315864b[sVar.f234889n.ordinal()];
                if (i == 1) {
                    return new Subaccount.Joint(sVar);
                }
                if (i == 2) {
                    return new Subaccount.Junior(sVar);
                }
                if (i == 3) {
                    return new Subaccount.Teen(sVar);
                }
                if (i == 4 || i == 5) {
                    return new Subaccount.Personal(sVar);
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                return new Subaccount.Pro(sVar);
            case 7:
                return new Subaccount.ProTax(sVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final r b(s account) {
        r rVarC;
        Intrinsics.checkNotNullParameter(account, "vault");
        switch (a.f315863a[account.e.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f315866b.getClass();
                Intrinsics.checkNotNullParameter(account, "account");
                rVarC = rd0.e.c(nim.a.v(c.a(u.c(account)), new aed.c(account, 6)), kotlin.coroutines.g.f186406a);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                rVarC = zi0.c.j(((s6e.d) this.f315867c).c(d(account).c()));
                break;
            case 8:
                rVarC = w.h(new Data(null, new IllegalStateException("UNDETERMINED case should not happen"), false, 5, null));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return nim.a.w(rVarC, new aed.c(account, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.r c() {
        /*
            r5 = this;
            y91.b r0 = r5.d
            java.lang.String r1 = "ACCOUNT.pockets"
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L49
            pcd.d r0 = pcd.d.f234853b
            ppg.b r1 = r5.f315865a
            ypg.p r1 = (ypg.p) r1
            w4l.h r2 = w4l.h.f294642c
            efm.r r0 = r1.l(r2, r0)
            p38.a r3 = r5.e
            j48.c r3 = (j48.c) r3
            boolean r3 = r3.c()
            if (r3 != 0) goto L34
            com.revolut.feature.retail.savings.api.SavingsApi$Toggles$JointAccountsSavings r3 = com.revolut.feature.retail.savings.api.SavingsApi$Toggles.JointAccountsSavings.f83075c
            gte.a r4 = r5.f
            jte.d r4 = (jte.d) r4
            boolean r3 = r4.c(r3)
            if (r3 == 0) goto L2d
            goto L34
        L2d:
            zhm.f0 r1 = zhm.f0.f322471a
            efm.r r1 = zi0.c.j(r1)
            goto L3a
        L34:
            pcd.c r3 = pcd.c.f234849b
            efm.r r1 = r1.l(r2, r3)
        L3a:
            efm.r r0 = kli.a.h(r0, r1)
            yo7.p r1 = new yo7.p
            r2 = 5
            r1.<init>(r5, r2)
            efm.r r0 = pd.b.r(r0, r1)
            return r0
        L49:
            zhm.f0 r0 = zhm.f0.f322471a
            efm.r r0 = zi0.c.j(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ypg.b.c():efm.r");
    }
}
