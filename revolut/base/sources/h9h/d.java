package h9h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.impl.ui.screens.instruments_collection.see_all.InstrumentsCollectionFiltersSeeAllControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentsCollectionFiltersSeeAllControllerContract$InputData f150295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f150296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f150297c;
    public final e4m.e d;

    public d(a aVar, ViewController viewController, InstrumentsCollectionFiltersSeeAllControllerContract$InputData instrumentsCollectionFiltersSeeAllControllerContract$InputData) {
        this.f150295a = instrumentsCollectionFiltersSeeAllControllerContract$InputData;
        this.f150296b = viewController;
        int i = 12;
        this.f150297c = e4m.b.b(new gff.a(this, 1, i));
        this.d = e4m.b.b(new gff.a(this, 0, i));
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
