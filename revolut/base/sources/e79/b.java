package e79;

import com.google.common.collect.ImmutableSet;
import dw3.v7;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f123109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f123110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f123111c;

    public b(c cVar) {
        this.f123109a = cVar;
        int i = 19;
        this.f123110b = e4m.b.b(new v7(cVar, this, 1, i));
        this.f123111c = e4m.b.b(new v7(cVar, this, 0, i));
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
