package ea2;

import com.google.common.collect.ImmutableSet;
import dw3.f6;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa2.f f124054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f124055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f124056c;

    public b(h hVar, f fVar, oa2.f fVar2) {
        this.f124054a = fVar2;
        int i = 16;
        this.f124055b = e4m.b.b(new f6(this, 1, i));
        this.f124056c = e4m.b.b(new f6(this, 0, i));
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
