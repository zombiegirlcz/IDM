package c4e;

import com.revolut.feature.stories.StoriesContract$Configuration;
import hqi.i;
import vc.s;
import ypi.h;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f21141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f21142c;
    public i d;
    public StoriesContract$Configuration e;

    public a(c cVar) {
        this.f21140a = cVar;
    }

    @Override // ypi.f
    public final Object b(h hVar) {
        this.f21142c = h.d;
        return this;
    }

    @Override // gsi.g
    public final gsi.h build() {
        s.h(this.f21141b, fsi.g.class);
        s.h(this.f21142c, h.class);
        s.h(this.d, i.class);
        s.h(this.e, StoriesContract$Configuration.class);
        return new b(this.f21140a, this.f21141b, this.f21142c, this.d);
    }

    @Override // c4e.d
    public final d f(StoriesContract$Configuration storiesContract$Configuration) {
        storiesContract$Configuration.getClass();
        this.e = storiesContract$Configuration;
        return this;
    }

    @Override // hqi.g
    public final Object g(i iVar) {
        this.d = iVar;
        return this;
    }

    @Override // gsi.g
    public final Object h(fsi.g gVar) {
        this.f21141b = (xoi.d) gVar;
        return this;
    }
}
