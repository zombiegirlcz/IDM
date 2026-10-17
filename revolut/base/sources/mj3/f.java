package mj3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.cms.stories.impl.ui.screen.CmsStoriesScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CmsStoriesScreenContract$InputData f205915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f205916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fj3.f f205917c;
    public final d d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f205918g;

    public f(d dVar, ViewController viewController, CmsStoriesScreenContract$InputData cmsStoriesScreenContract$InputData, fj3.f fVar) {
        this.d = dVar;
        this.f205915a = cmsStoriesScreenContract$InputData;
        this.f205916b = viewController;
        this.f205917c = fVar;
        int i = 29;
        this.e = e4m.b.b(new lzk.b(dVar, this, 2, i));
        this.f = e4m.b.b(new lzk.b(dVar, this, 1, i));
        this.f205918g = e4m.b.b(new lzk.b(dVar, this, 0, i));
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
