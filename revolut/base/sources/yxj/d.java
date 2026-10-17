package yxj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.junior_upgrade.impl.ui_kompot.screen.JuniorUpgradeScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorUpgradeScreenContract$InputData f317712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f317713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f317714c;

    public d(a aVar, b bVar, JuniorUpgradeScreenContract$InputData juniorUpgradeScreenContract$InputData) {
        this.f317712a = juniorUpgradeScreenContract$InputData;
        int i = 0;
        this.f317713b = e4m.b.b(new c(this, 1, i));
        this.f317714c = e4m.b.b(new c(this, 0, i));
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
