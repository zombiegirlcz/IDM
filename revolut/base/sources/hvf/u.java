package hvf;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class u implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f155965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f155966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f155967c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public u(q qVar, BaseScreen baseScreen) {
        this.f155965a = qVar;
        this.f155966b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 12;
        this.f155967c = e4m.b.b(new hjg.b(qVar, this, 1, i));
        this.d = e4m.b.b(new hjg.b(qVar, this, 0, i));
        this.e = e4m.b.b(new hjg.b(qVar, this, 3, i));
        this.f = e4m.b.b(new hjg.b(qVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f155965a.f155949n.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
