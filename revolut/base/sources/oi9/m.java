package oi9;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class m implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f225538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f225539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f225540c;

    public m(f fVar) {
        this.f225538a = fVar;
        this.f225539b = e4m.b.b(new a(fVar, this, 1, 7));
        this.f225540c = e4m.b.b(new a(fVar, this, 0, 7));
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
