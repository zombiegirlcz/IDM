package ms1;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f208550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f208551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f208552c;
    public final e4m.e d;
    public final e4m.e e;

    public k(j jVar) {
        this.f208550a = jVar;
        int i = 26;
        this.f208551b = e4m.b.b(new mjl.b(jVar, this, 1, i));
        this.f208552c = e4m.b.b(new mjl.b(jVar, this, 0, i));
        this.d = e4m.b.b(new mjl.b(jVar, this, 3, i));
        this.e = e4m.b.b(new mjl.b(jVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f208552c.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
