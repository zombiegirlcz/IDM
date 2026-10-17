package hei;

import b80.c;
import com.revolut.feature_tiles_impl.repository.TilesService;
import l70.e;
import mei.g;
import nj0.d;
import vc.s;

/* JADX INFO: loaded from: classes13.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f151710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f151711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nj0.a f151712c;
    public final ee0.a d;
    public final u06.a e;

    public a(b bVar, ee0.a aVar, u06.a aVar2, nj0.a aVar3, e eVar) {
        this.f151710a = eVar;
        this.f151711b = bVar;
        this.f151712c = aVar3;
        this.d = aVar;
        this.e = aVar2;
    }

    public final jei.b a() {
        c cVarP = this.f151710a.p();
        s.j(cVarP);
        TilesService tilesServiceW = h7d.a.w(this.f151711b, ((d) this.f151712c).f());
        ne0.d dVar = new ne0.d();
        ze0.a aVarA = this.d.a();
        s.j(aVarA);
        g gVar = new g(cVarP, tilesServiceW, dVar, aVarA);
        q06.d dVarA = this.e.a();
        s.j(dVarA);
        return new jei.b(gVar, dVarA);
    }
}
