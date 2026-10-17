package c4f;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreenContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements t4f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d.b f21196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final avk.j f21197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CollectionScreenContract$Input f21198c;
    public final d d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f21199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f21200h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f21201j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f21202l;

    public c(d dVar, CollectionScreenContract$Input collectionScreenContract$Input, avk.j jVar, o5d.b bVar) {
        this.d = dVar;
        this.f21196a = bVar;
        this.f21197b = jVar;
        this.f21198c = collectionScreenContract$Input;
        int i = 14;
        this.e = e4m.b.b(new bt7.e(dVar, this, 1, i));
        this.f = e4m.b.b(new bt7.e(dVar, this, 0, i));
        this.f21199g = e4m.b.b(new bt7.e(dVar, this, 2, i));
        this.f21200h = e4m.b.b(new bt7.e(dVar, this, 3, i));
        this.i = e4m.b.b(new bt7.e(dVar, this, 4, i));
        this.f21201j = e4m.b.b(new bt7.e(dVar, this, 6, i));
        this.k = e4m.b.b(new bt7.e(dVar, this, 7, i));
        this.f21202l = e4m.b.b(new bt7.e(dVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(3);
        builderBuilderWithExpectedSize.add(this.f21200h.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.i.get());
        aah.h hVar = (aah.h) this.f21199g.get();
        a0k.b.n(hVar);
        builderBuilderWithExpectedSize.add(hVar);
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVar = (yji.d) this.f.get();
        aah.i iVarD = ((u8h.b) this.d.d).d();
        vc.s.j(iVarD);
        return ImmutableSet.of((aah.g) dVar, a0k.b.l(iVarD, this.f21197b, (aah.h) this.f21199g.get()));
    }
}
