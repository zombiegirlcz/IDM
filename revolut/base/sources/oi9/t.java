package oi9;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f225565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225566c;

    public t(f fVar, String str) {
        this.f225564a = str;
        this.f225565b = e4m.b.b(new a(fVar, this, 1, 12));
        this.f225566c = e4m.b.b(new a(fVar, this, 0, 12));
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
