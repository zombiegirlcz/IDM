package q97;

import com.revolut.feature.bank_account_switching.api.BankAccountSwitchingToggles$AccountSwitchFR;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingDestination;
import com.revolut.feature.bank_account_switching.api.navigation.BankAccountSwitchingFlowInputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k1 implements p97.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on2.b f243723a;

    public k1(t97.c productCellProvider, on2.b featureChecker) {
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.f243723a = featureChecker;
    }

    public static ufm.b d(mn2.a aVar) {
        ufm.b bVarM = efm.d0.m(new o97.l(zh9.u0.f(new BankAccountSwitchingDestination(new BankAccountSwitchingFlowInputData.RequestList(aVar)))));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // p97.c
    public final boolean a(p97.b id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        t97.d[] elements = {t97.d.ACCOUNT_SWITCH_NL, t97.d.ACCOUNT_SWITCH_GB, t97.d.ACCOUNT_SWITCH_FR};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return zhm.d0.T(kotlin.collections.d.y0(elements), id10);
    }

    @Override // p97.c
    public final efm.r b() {
        on2.b bVar = this.f243723a;
        efm.r rVarX = efm.d0.C(bVar.b(zhm.y0.b("NL_OVERSTAP"), null), bVar.c(), bVar.b(zhm.y0.b("FR_MOBILITY"), BankAccountSwitchingToggles$AccountSwitchFR.f63882c), new j0(new pv7.t(this, 17), 26)).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        return rVarX;
    }

    @Override // p97.c
    public final efm.d0 c(p97.a productCell) {
        Intrinsics.checkNotNullParameter(productCell, "productCell");
        p97.b bVar = productCell.f234280a;
        if (bVar == t97.d.ACCOUNT_SWITCH_NL) {
            return d(mn2.a.OVERSTAP);
        }
        if (bVar == t97.d.ACCOUNT_SWITCH_GB) {
            return d(mn2.a.CASS);
        }
        if (bVar == t97.d.ACCOUNT_SWITCH_FR) {
            return d(mn2.a.MOBILITY);
        }
        throw new IllegalArgumentException(prk.o.q("Unsupported: ", productCell.f234280a));
    }
}
