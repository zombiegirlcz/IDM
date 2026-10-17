package mb3;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc3.f f204108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f204109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f204110c;
    public final e4m.e d;

    public v(p pVar, u uVar, qc3.f fVar) {
        this.f204109b = pVar;
        this.f204108a = fVar;
        int i = 27;
        this.f204110c = e4m.b.b(new lzk.b(pVar, this, 1, i));
        this.d = e4m.b.b(new lzk.b(pVar, this, 0, i));
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
