package l0k;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.marketnews.impl.ui.wealthnews.assettype.WealthAssetTypeNewsScreenContract$InputData;
import java.util.Set;
import vc.s;
import z0h.s1;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191303a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1 f191304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u0k.a f191305c;
    public final WealthAssetTypeNewsScreenContract$InputData d;
    public final c e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f191306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f191307h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f191308j;
    public final Object k;

    public k(c cVar, e eVar, u0k.a aVar, s1 s1Var, WealthAssetTypeNewsScreenContract$InputData wealthAssetTypeNewsScreenContract$InputData) {
        this.e = cVar;
        this.k = eVar;
        this.f191304b = s1Var;
        this.f191305c = aVar;
        this.d = wealthAssetTypeNewsScreenContract$InputData;
        int i = 26;
        this.f = e4m.b.b(new il8.d(cVar, eVar, this, 0, i));
        this.f191306g = e4m.b.b(new il8.d(cVar, eVar, this, 1, i));
        this.f191307h = e4m.b.b(new il8.d(cVar, eVar, this, 4, i));
        this.i = e4m.b.b(new il8.d(cVar, eVar, this, 3, i));
        this.f191308j = e4m.b.b(new il8.d(cVar, eVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f191303a) {
            case 0:
                aah.h hVar = (aah.h) this.f.get();
                a0k.b.m(hVar);
                return ImmutableSet.of(hVar);
            default:
                aah.h hVar2 = (aah.h) this.f.get();
                a0k.b.m(hVar2);
                return ImmutableSet.of(hVar2);
        }
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f191303a) {
            case 0:
                aah.i iVarD = ((u8h.b) this.e.f191264j).d();
                s.j(iVarD);
                return ImmutableSet.of((yji.d) a0k.b.k(iVarD, this.f191304b, (aah.h) this.f.get()), (yji.d) this.f191306g.get());
            default:
                aah.i iVarD2 = ((u8h.b) this.e.f191264j).d();
                s.j(iVarD2);
                return ImmutableSet.of((yji.d) a0k.b.k(iVarD2, this.f191304b, (aah.h) this.f.get()), (yji.d) this.f191306g.get());
        }
    }

    public k(c cVar, i iVar, u0k.a aVar, s1 s1Var, WealthAssetTypeNewsScreenContract$InputData wealthAssetTypeNewsScreenContract$InputData) {
        this.e = cVar;
        this.k = iVar;
        this.f191304b = s1Var;
        this.f191305c = aVar;
        this.d = wealthAssetTypeNewsScreenContract$InputData;
        int i = 25;
        this.f = e4m.b.b(new il8.d(cVar, iVar, this, 0, i));
        this.f191306g = e4m.b.b(new il8.d(cVar, iVar, this, 1, i));
        this.f191307h = e4m.b.b(new il8.d(cVar, iVar, this, 4, i));
        this.i = e4m.b.b(new il8.d(cVar, iVar, this, 3, i));
        this.f191308j = e4m.b.b(new il8.d(cVar, iVar, this, 2, i));
    }
}
