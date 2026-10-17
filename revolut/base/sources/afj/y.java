package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanMyNumbersScreenContract$InputData f4525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4527c;
    public final e4m.e d;

    public y(b bVar, k0 k0Var, EsimMobilePlanMyNumbersScreenContract$InputData esimMobilePlanMyNumbersScreenContract$InputData) {
        this.f4526b = bVar;
        this.f4525a = esimMobilePlanMyNumbersScreenContract$InputData;
        int i = 19;
        this.f4527c = e4m.b.b(new a1e.c(bVar, this, 1, i));
        this.d = e4m.b.b(new a1e.c(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
