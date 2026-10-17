package rza;

import com.revolut.feature.stories.StoriesContract$Configuration;
import hqi.i;
import vc.s;
import ypi.h;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements c4e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f258559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f258560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f258561c;
    public i d;
    public StoriesContract$Configuration e;

    public c(b bVar) {
        this.f258559a = bVar;
    }

    @Override // ypi.f
    public final Object b(h hVar) {
        this.f258561c = h.d;
        return this;
    }

    @Override // gsi.g
    public final gsi.h build() {
        s.h(this.f258560b, fsi.g.class);
        s.h(this.f258561c, h.class);
        s.h(this.d, i.class);
        s.h(this.e, StoriesContract$Configuration.class);
        return new d(this.f258559a, this.f258560b, this.f258561c, this.d);
    }

    @Override // c4e.d
    public final c4e.d f(StoriesContract$Configuration storiesContract$Configuration) {
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
        this.f258560b = (xoi.d) gVar;
        return this;
    }
}
