package hc2;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f150820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f150821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f150822c;

    public p(m mVar, q qVar) {
        this.f150820a = mVar;
        int i = 19;
        this.f150821b = e4m.b.b(new h08.e(mVar, this, 1, i));
        this.f150822c = e4m.b.b(new h08.e(mVar, this, 0, i));
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
