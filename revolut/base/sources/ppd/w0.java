package ppd;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class w0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f238568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f238569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f238570c;
    public final e4m.e d;

    public w0(n nVar) {
        this.f238568a = nVar;
        int i = 3;
        this.f238569b = e4m.b.b(new i0(nVar, this, 1, i));
        this.f238570c = e4m.b.b(new i0(nVar, this, 2, i));
        this.d = e4m.b.b(new i0(nVar, this, 0, i));
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
