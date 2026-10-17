package zpc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.status.SalarySwitchStatusContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SalarySwitchStatusContract$InputData f324281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f324282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f324283c;

    public p(k kVar, SalarySwitchStatusContract$InputData salarySwitchStatusContract$InputData) {
        this.f324281a = salarySwitchStatusContract$InputData;
        int i = 1;
        this.f324282b = e4m.b.b(new m(kVar, this, 1, i));
        this.f324283c = e4m.b.b(new m(kVar, this, 0, i));
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
