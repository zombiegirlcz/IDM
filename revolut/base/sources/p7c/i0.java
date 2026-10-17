package p7c;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 implements qdc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f233622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233623b = e4m.b.b(new p12.o(8));

    public i0(r rVar, j jVar) {
        this.f233622a = jVar;
    }

    @Override // qdc.b
    public final pdc.f a() {
        return (pdc.f) this.f233623b.get();
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f233622a.f233628h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
