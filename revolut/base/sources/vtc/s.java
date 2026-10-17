package vtc;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f292054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f292055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f292056c;

    public s(t tVar, u uVar) {
        this.f292054a = tVar;
        int i = 16;
        this.f292055b = e4m.b.b(new vn2.l(tVar, this, 1, i));
        this.f292056c = e4m.b.b(new vn2.l(tVar, this, 0, i));
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
