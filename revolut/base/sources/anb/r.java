package anb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData f6691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f6692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f6693c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f6694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f6695h;

    public r(n nVar, BaseScreen baseScreen, SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData savingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData) {
        this.f6691a = savingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;
        this.f6692b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 13;
        this.f6693c = e4m.b.b(new ak5.f(nVar, this, 2, i));
        this.d = e4m.b.b(new ak5.f(nVar, this, 1, i));
        this.e = e4m.b.b(new ak5.f(nVar, this, 0, i));
        this.f = e4m.b.b(new ak5.f(nVar, this, 4, i));
        this.f6694g = e4m.b.b(new ak5.f(nVar, this, 5, i));
        this.f6695h = e4m.b.b(new ak5.f(nVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
