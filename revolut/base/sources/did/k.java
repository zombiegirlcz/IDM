package did;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shops.impl.ui.bid_screen.ShopsItemsBidScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ShopsItemsBidScreenContract$InputData f115033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f115034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f115035c;
    public final e4m.e d;

    public k(d dVar, ShopsItemsBidScreenContract$InputData shopsItemsBidScreenContract$InputData) {
        this.f115034b = dVar;
        this.f115033a = shopsItemsBidScreenContract$InputData;
        int i = 9;
        this.f115035c = e4m.b.b(new db1.f(dVar, this, 1, i));
        this.d = e4m.b.b(new db1.f(dVar, this, 0, i));
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
