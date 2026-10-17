package xsl;

import com.google.common.collect.ImmutableSet;
import com.revolut.trading.orders.ui.invest.placement.tutorial.TutorialScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TutorialScreenContract$InputData f308712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f308713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f308714c;
    public final e4m.e d;

    public r(p pVar, TutorialScreenContract$InputData tutorialScreenContract$InputData) {
        this.f308712a = tutorialScreenContract$InputData;
        this.f308713b = e4m.b.b(new q(pVar, this, 2, 0));
        this.f308714c = e4m.b.b(new q(pVar, this, 1, 0));
        this.d = e4m.b.b(new q(pVar, this, 0, 0));
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
