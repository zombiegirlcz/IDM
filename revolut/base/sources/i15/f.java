package i15;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f157568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f157569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f157570c;

    public f(d dVar) {
        this.f157568a = dVar;
        int i = 21;
        this.f157569b = e4m.b.b(new hjg.b(dVar, this, 1, i));
        this.f157570c = e4m.b.b(new hjg.b(dVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
