package sm1;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final in1.h f264306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f264307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f264308c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c(d dVar, i iVar, in1.h hVar) {
        this.f264307b = dVar;
        this.f264306a = hVar;
        int i = 23;
        this.f264308c = e4m.b.b(new ryc.d(dVar, this, 3, i));
        this.d = e4m.b.b(new ryc.d(dVar, this, 2, i));
        this.e = e4m.b.b(new ryc.d(dVar, this, 1, i));
        this.f = e4m.b.b(new ryc.d(dVar, this, 0, i));
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
