package p7c;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements jdc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f233604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233605b = e4m.b.b(new p12.o(6));

    public e0(r rVar, j jVar) {
        this.f233604a = jVar;
    }

    @Override // jdc.b
    public final idc.e a() {
        return (idc.e) this.f233605b.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f233604a.f233628h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
