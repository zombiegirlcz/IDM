package if2;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg2.e f160842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f160843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f160844c;
    public final e4m.e d;
    public final e4m.e e;

    public c(f fVar, kg2.e eVar) {
        this.f160843b = fVar;
        this.f160842a = eVar;
        int i = 3;
        this.f160844c = e4m.b.b(new i9e.l(fVar, this, 1, i));
        this.d = e4m.b.b(new i9e.l(fVar, this, 2, i));
        this.e = e4m.b.b(new i9e.l(fVar, this, 0, i));
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
