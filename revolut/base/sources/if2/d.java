package if2;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f160845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f160846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f160847c;

    public d(f fVar, h hVar) {
        this.f160845a = fVar;
        int i = 4;
        this.f160846b = e4m.b.b(new i9e.l(fVar, this, 1, i));
        this.f160847c = e4m.b.b(new i9e.l(fVar, this, 0, i));
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
