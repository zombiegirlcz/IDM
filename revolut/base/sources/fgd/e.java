package fgd;

import com.revolut.feature.shared_separate_favourites.api.converter.navigation.SharedConverterDestination;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f135045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f135046b;

    public e(d dVar, f fVar) {
        this.f135045a = dVar;
        this.f135046b = fVar;
    }

    @Override // phm.a
    public final Object get() {
        SharedConverterDestination.InputData inputData = this.f135046b.f135047a;
        d dVar = this.f135045a;
        d3d.g gVar = (d3d.g) ((c3d.c) dVar.f135042a).f20934c.get();
        s.j(gVar);
        z2d.c cVar = (z2d.c) dVar.f135043b.f310627g.get();
        s.j(cVar);
        return new com.revolut.feature.shared_separate_favourites.converter.ui.flow.b(inputData, gVar, cVar);
    }
}
