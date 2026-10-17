package p1j;

import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements t1j.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BalanceSelector$InputData f231946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1j.a f231947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw9.d f231948c;

    public e(BalanceSelector$InputData balanceSelectorInputData, i1j.a balancesFilterInteractor, cw9.d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(balanceSelectorInputData, "balanceSelectorInputData");
        Intrinsics.checkNotNullParameter(balancesFilterInteractor, "balancesFilterInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f231946a = balanceSelectorInputData;
        this.f231947b = balancesFilterInteractor;
        this.f231948c = paymentsProductFeatureChecker;
    }

    @Override // t1j.e
    public final String a() {
        return this.f231946a.f99383h;
    }

    @Override // t1j.e
    public final boolean b() {
        return this.f231948c.a() && this.f231946a.i.contains(BalanceSelector$ExtraConfiguration.CountryProfilesEnabled.f99372a);
    }

    @Override // t1j.e
    public final i1j.a c() {
        return this.f231947b;
    }

    @Override // t1j.e
    public final BalancesInteractor$InputData d(String countryProfileId, List additionalConfigs) {
        Intrinsics.checkNotNullParameter(countryProfileId, "countryProfileId");
        Intrinsics.checkNotNullParameter(additionalConfigs, "additionalConfigs");
        BalanceSelector$InputData balanceSelector$InputData = this.f231946a;
        k1j.d dVar = balanceSelector$InputData.f99380b;
        io3.l lVar = balanceSelector$InputData.f99381c;
        Set set = balanceSelector$InputData.f99379a;
        Set set2 = balanceSelector$InputData.f;
        if (set2 == null) {
            set2 = h0.f322473a;
        }
        Set set3 = balanceSelector$InputData.e;
        if (set3 == null) {
            set3 = h0.f322473a;
        }
        return new BalancesInteractor$InputData(dVar, lVar, set, set2, set3, balanceSelector$InputData.f99382g, b() ? new BalancesInteractor$InputData.RegisteredIdentity.Custom(countryProfileId) : BalancesInteractor$InputData.RegisteredIdentity.Selected.f99401a, additionalConfigs);
    }
}
