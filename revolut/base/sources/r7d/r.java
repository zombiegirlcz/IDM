package r7d;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f252167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f252168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252169c;

    public r(l lVar, m mVar) {
        this.f252167a = mVar;
        int i = 1;
        this.f252168b = e4m.b.b(new o(lVar, this, 1, i));
        this.f252169c = e4m.b.b(new o(lVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        m mVar = this.f252167a;
        return ImmutableSet.of((yji.n) mVar.f252140g.get(), (yji.n) mVar.e.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
