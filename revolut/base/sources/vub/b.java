package vub;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.buying.impl.ui.screen.main.RevPointsBuyingControllerScreenContract$InputData;
import java.util.Set;
import vn2.l;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsBuyingControllerScreenContract$InputData f292288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f292289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f292290c;

    public b(a aVar, RevPointsBuyingControllerScreenContract$InputData revPointsBuyingControllerScreenContract$InputData) {
        this.f292288a = revPointsBuyingControllerScreenContract$InputData;
        int i = 23;
        this.f292289b = e4m.b.b(new l(aVar, this, 1, i));
        this.f292290c = e4m.b.b(new l(aVar, this, 0, i));
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
