package mjl;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f206116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f206117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f206118c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public o(m mVar, n nVar) {
        this.f206116a = mVar;
        int i = 1;
        this.f206117b = e4m.b.b(new b(mVar, this, 2, i));
        this.f206118c = e4m.b.b(new b(mVar, this, 1, i));
        this.d = e4m.b.b(new b(mVar, this, 0, i));
        this.e = e4m.b.b(new b(mVar, this, 3, i));
        this.f = e4m.b.b(new b(mVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
