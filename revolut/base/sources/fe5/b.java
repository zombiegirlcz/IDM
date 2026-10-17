package fe5;

import com.google.common.collect.ImmutableSet;
import fa0.q;
import java.util.Set;
import je5.h;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f134447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f134448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f134449c;
    public final e4m.e d;

    public b(a aVar, h hVar) {
        this.f134447a = hVar;
        int i = 10;
        this.f134448b = e4m.b.b(new q(aVar, this, 1, i));
        this.f134449c = e4m.b.b(new q(aVar, this, 2, i));
        this.d = e4m.b.b(new q(aVar, this, 0, i));
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
