package un2;

import com.revolut.feature.bank_account_switching.api.BankAccountSwitchingToggles$AccountSwitchFR;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingJointReviewSwitchInDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingReviewSwitchOutDestination;
import com.revolut.feature.bank_account_switching.api.navigation.HowOverstapWorksDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import efm.d0;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import pfm.z;
import rd0.d;
import sri.m;
import toh.h;
import ufm.i;
import wp5.y;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements ln2.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on2.b f281343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f281344b;

    public c(on2.b featureChecker, m navigator) {
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f281343a = featureChecker;
        this.f281344b = navigator;
    }

    public static KompotDestination c(mn2.a aVar, jf0.c cVar) {
        String strE = cVar.e(3);
        String str = cVar.f173629c;
        HashMap map = cVar.d;
        m70.a.c(t0.f186434a);
        if (Intrinsics.f(strE, "")) {
            return new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.RequestList(aVar));
        }
        if (Intrinsics.f(strE, "request")) {
            String str2 = (String) map.get("id");
            if (str2 != null) {
                return new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.RequestStatus(str2, aVar));
            }
            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Deeplink ", str, " for request status doesn't have 'id' param"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return null;
        }
        if (Intrinsics.f(strE, "outbound")) {
            String str3 = (String) map.get("id");
            if (str3 != null) {
                return new BankAccountSwitchingReviewSwitchOutDestination(str3, aVar);
            }
            IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("Deeplink ", str, " for outbound request review doesn't have 'id' param"));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
            d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            return null;
        }
        if (Intrinsics.f(strE, "how-it-works")) {
            if (aVar == mn2.a.OVERSTAP) {
                return HowOverstapWorksDestination.f63892a;
            }
        } else {
            if (Intrinsics.f(strE, "new-request")) {
                return new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.NewRequest(aVar));
            }
            if (Intrinsics.f(strE, "joint-review") && aVar == mn2.a.MOBILITY) {
                String str4 = (String) map.get("id");
                if (str4 != null) {
                    return new BankAccountSwitchingJointReviewSwitchInDestination(str4, aVar);
                }
                IllegalStateException illegalStateException3 = new IllegalStateException(p.a.p("Deeplink ", str, " for inbound joint account request review doesn't have 'id' param"));
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = d.f253311a;
                d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                return null;
            }
        }
        return null;
    }

    public static mn2.a d(String str) {
        wi0.b bVarC = com.bumptech.glide.d.c(str);
        wi0.b.Companion.getClass();
        if (bVarC.equals(wi0.b.h2)) {
            return mn2.a.OVERSTAP;
        }
        if (bVarC.equals(wi0.b.p0)) {
            return mn2.a.CASS;
        }
        if (bVarC.equals(wi0.b.f297760n0)) {
            return mn2.a.MOBILITY;
        }
        return null;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "bank-account-switch");
    }

    public final z b(mn2.a aVar, boolean z) {
        int i = a.f281339a[aVar.ordinal()];
        on2.b bVar = this.f281343a;
        if (i == 1) {
            bVar.getClass();
            return bVar.b(y0.b("NL_OVERSTAP"), null);
        }
        if (i == 2) {
            return bVar.c();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        bVar.getClass();
        return bVar.b(y0.b("FR_MOBILITY"), z ? BankAccountSwitchingToggles$AccountSwitchFR.f63882c : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof un2.b
            if (r0 == 0) goto L13
            r0 = r9
            un2.b r0 = (un2.b) r0
            int r1 = r0.f281342y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f281342y = r1
            goto L1a
        L13:
            un2.b r0 = new un2.b
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.f281340w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f281342y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            mn2.a r8 = r0.v
            jf0.c r0 = r0.u
            yhm.o.b(r9)
            goto L66
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r9)
            r9 = 2
            java.lang.String r9 = r8.e(r9)
            mn2.a r9 = d(r9)
            if (r9 != 0) goto L45
            goto L75
        L45:
            r2 = 3
            java.lang.String r2 = r8.e(r2)
            java.lang.String r5 = "outbound"
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r5)
            r2 = r2 ^ r3
            pfm.z r2 = r7.b(r9, r2)
            r0.u = r8
            r0.v = r9
            r0.f281342y = r3
            java.lang.Object r0 = nim.a.b(r2, r0)
            if (r0 != r1) goto L62
            return r1
        L62:
            r6 = r0
            r0 = r8
            r8 = r9
            r9 = r6
        L66:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6f
            goto L75
        L6f:
            com.revolut.kompot.bridge.navigation.KompotDestination r8 = c(r8, r0)
            if (r8 != 0) goto L76
        L75:
            return r4
        L76:
            q06.h r9 = new q06.h
            r9.<init>(r8, r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: un2.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        mn2.a aVarD = d(deeplink.e(2));
        if (aVarD == null) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        i iVar = new i(b(aVarD, !Intrinsics.f(deeplink.e(3), "outbound")), new uhl.b(new h(this, 25, aVarD, deeplink), 23), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
