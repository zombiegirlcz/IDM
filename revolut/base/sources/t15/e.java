package t15;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.impl.ui.entry_points.CreditEntryPointsControllerContract$InputData;
import java.util.Set;
import t0b.l;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditEntryPointsControllerContract$InputData f267174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f267175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f267176c;

    public e(d dVar, CreditEntryPointsControllerContract$InputData creditEntryPointsControllerContract$InputData) {
        this.f267174a = creditEntryPointsControllerContract$InputData;
        int i = 2;
        this.f267175b = e4m.b.b(new l(dVar, this, 1, i));
        this.f267176c = e4m.b.b(new l(dVar, this, 0, i));
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
