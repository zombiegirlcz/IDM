package up5;

import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.withdraw.api.CryptoWithdrawApi$Toggles;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingPreCheckInput;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.review.FiatCryptoWithdrawLimits;
import com.revolut.feature.transfer.core.models.FundingSource;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f281903b;

    public /* synthetic */ l(a0 a0Var, int i) {
        this.f281902a = i;
        this.f281903b = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Long lValueOf;
        String str;
        switch (this.f281902a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                CryptoAddress cryptoAddress = (CryptoAddress) pair.f186385a;
                List list = (List) pair.f186386b;
                od0.h hVar = od0.i.Companion;
                FiatCryptoWithdrawLimits fiatCryptoWithdrawLimitsC = this.f281903b.f281859n.c(cryptoAddress.f71060b, cryptoAddress.f71067n, list);
                hVar.getClass();
                return od0.h.a(fiatCryptoWithdrawLimitsC);
            case 1:
                ko5.g cryptoWithdrawFees = (ko5.g) obj2;
                Intrinsics.checkNotNullParameter(cryptoWithdrawFees, "cryptoWithdrawFees");
                ((e) this.f281903b.f281852b).y0().set(cryptoWithdrawFees.f186227a);
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 2:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return this.f281903b.f281853c.b(new CryptoAddressHostingPreCheckInput((String) rVar.f314202b, (dj0.d) rVar.f314201a, (wk5.a) rVar.f314203c));
            case 3:
                CryptoAddressCounterparty it8 = (CryptoAddressCounterparty) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return te0.w.A0(((e) this.f281903b.f281852b).x0(), it8).D(it8);
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                Object obj3 = pair2.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                eq5.q qVar = (eq5.q) obj3;
                Object obj4 = pair2.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                FundingSource fundingSource = (FundingSource) obj4;
                a0 a0Var = this.f281903b;
                e eVar = (e) a0Var.f281852b;
                if (!((od0.i) eVar.w0().get()).d()) {
                    return pfm.m.f235744a;
                }
                mm.d dVar = a0Var.e;
                String str2 = (String) ((od0.i) eVar.w0().get()).c();
                wk5.a aVar = (wk5.a) ((od0.i) eVar.C0().get()).c();
                dj0.d dVarA = qVar.a();
                String str3 = (String) eVar.z0().get();
                if (((CryptoWithdrawFeesBreakdown) eVar.y0().get()).f71090b != null) {
                    dj0.d dVar2 = ((CryptoWithdrawFeesBreakdown) eVar.y0().get()).f71089a;
                    lValueOf = dVar2 != null ? Long.valueOf(dVar2.f115082a) : null;
                } else {
                    lValueOf = null;
                }
                dj0.d dVar3 = ((CryptoWithdrawFeesBreakdown) eVar.y0().get()).f71090b;
                Long lValueOf2 = dVar3 != null ? Long.valueOf(dVar3.f115082a) : null;
                dj0.d dVar4 = ((CryptoWithdrawFeesBreakdown) eVar.y0().get()).f71091c;
                Long lValueOf3 = dVar4 != null ? Long.valueOf(dVar4.f115082a) : null;
                long j2 = ((CryptoWithdrawFeesBreakdown) eVar.y0().get()).e.f115082a;
                boolean zB = qVar.b();
                String strH = x5d.b.h(fundingSource);
                CryptoAddressCounterparty cryptoAddressCounterparty = (CryptoAddressCounterparty) ((od0.i) eVar.x0().get()).f224257a;
                String str4 = cryptoAddressCounterparty != null ? cryptoAddressCounterparty.f70977a : null;
                if (((jte.d) a0Var.k).c(CryptoWithdrawApi$Toggles.CryptoWithdrawFeesUsingToken.f71058c)) {
                    ko5.l lVar = (ko5.l) ((od0.i) eVar.G0().get()).f224257a;
                    str = lVar != null ? lVar.f186238a : null;
                } else {
                    str = null;
                }
                return dVar.c0(new qp5.d(str2, aVar, dVarA, str3, lValueOf, lValueOf2, lValueOf3, j2, zB, strH, str4, str));
        }
    }
}
