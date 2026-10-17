package i2j;

import com.revolut.feature.transfer.core.models.CurrencyFilteringPolicy;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.navigation.DualChooserContract$InputData;
import io3.l;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import t1j.e;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DualChooserContract$InputData f157983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f157984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cw9.d f157985c;

    public a(DualChooserContract$InputData inputData, i optionalBalancesFilterInteractor, cw9.d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(optionalBalancesFilterInteractor, "optionalBalancesFilterInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f157983a = inputData;
        this.f157984b = optionalBalancesFilterInteractor;
        this.f157985c = paymentsProductFeatureChecker;
    }

    @Override // t1j.e
    public final String a() {
        return this.f157983a.f99490a;
    }

    @Override // t1j.e
    public final boolean b() {
        return this.f157985c.a() && this.f157983a.f99495j.contains(DualChooserContract$ExtraConfiguration.CountryProfilesEnabled.f99487a);
    }

    @Override // t1j.e
    public final i1j.a c() {
        return (i1j.a) this.f157984b.f224257a;
    }

    @Override // t1j.e
    public final BalancesInteractor$InputData d(String countryProfileId, List additionalConfigs) {
        Intrinsics.checkNotNullParameter(countryProfileId, "countryProfileId");
        Intrinsics.checkNotNullParameter(additionalConfigs, "additionalConfigs");
        BalancesInteractor$InputData.RegisteredIdentity custom = b() ? new BalancesInteractor$InputData.RegisteredIdentity.Custom(countryProfileId) : BalancesInteractor$InputData.RegisteredIdentity.Selected.f99401a;
        DualChooserContract$InputData dualChooserContract$InputData = this.f157983a;
        CurrencyFilteringPolicy currencyFilteringPolicy = dualChooserContract$InputData.f99494h;
        if (currencyFilteringPolicy instanceof CurrencyFilteringPolicy.Exclude) {
            return new BalancesInteractor$InputData(dualChooserContract$InputData.f99492c, dualChooserContract$InputData.d, dualChooserContract$InputData.f, h0.f322473a, ((CurrencyFilteringPolicy.Exclude) currencyFilteringPolicy).f92234a, null, custom, additionalConfigs, 32);
        }
        if (currencyFilteringPolicy instanceof CurrencyFilteringPolicy.IncludeOnly) {
            return new BalancesInteractor$InputData(dualChooserContract$InputData.f99492c, dualChooserContract$InputData.d, dualChooserContract$InputData.f, ((CurrencyFilteringPolicy.IncludeOnly) currencyFilteringPolicy).f92236a, h0.f322473a, null, custom, additionalConfigs, 32);
        }
        if (!Intrinsics.f(currencyFilteringPolicy, CurrencyFilteringPolicy.IncludeAll.f92235a)) {
            throw new NoWhenBranchMatchedException();
        }
        k1j.d dVar = dualChooserContract$InputData.f99492c;
        l lVar = dualChooserContract$InputData.d;
        Set set = dualChooserContract$InputData.f;
        h0 h0Var = h0.f322473a;
        return new BalancesInteractor$InputData(dVar, lVar, set, h0Var, h0Var, null, custom, additionalConfigs, 32);
    }
}
