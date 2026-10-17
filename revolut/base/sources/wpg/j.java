package wpg;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpareChangeScreenContract$InputData f299271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f299272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f299273c;

    public j(l lVar, SpareChangeScreenContract$InputData spareChangeScreenContract$InputData) {
        this.f299271a = spareChangeScreenContract$InputData;
        int i = 8;
        this.f299272b = e4m.b.b(new whc.t(lVar, this, 1, i));
        this.f299273c = e4m.b.b(new whc.t(lVar, this, 0, i));
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
