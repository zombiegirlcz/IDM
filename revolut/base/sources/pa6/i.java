package pa6;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f234373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f234374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234375c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234376g;

    public i(m mVar, b bVar, BaseScreen baseScreen) {
        this.f234373a = mVar;
        this.f234374b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 2;
        this.f234375c = e4m.b.b(new f(mVar, this, 2, i));
        this.d = e4m.b.b(new f(mVar, this, 1, i));
        this.e = e4m.b.b(new f(mVar, this, 0, i));
        this.f = e4m.b.b(new f(mVar, this, 4, i));
        this.f234376g = e4m.b.b(new f(mVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
