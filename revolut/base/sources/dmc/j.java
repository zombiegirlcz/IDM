package dmc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.robo.impl.ui.screen.widgets.projection_chart.pen_contribution.PenContributionScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PenContributionScreenContract$InputData f115971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f115972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115973c;
    public final e4m.e d;
    public final e4m.e e;

    public j(r rVar, PenContributionScreenContract$InputData penContributionScreenContract$InputData) {
        this.f115972b = rVar;
        this.f115971a = penContributionScreenContract$InputData;
        int i = 18;
        this.f115973c = e4m.b.b(new db1.f(rVar, this, 2, i));
        this.d = e4m.b.b(new db1.f(rVar, this, 1, i));
        this.e = e4m.b.b(new db1.f(rVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
