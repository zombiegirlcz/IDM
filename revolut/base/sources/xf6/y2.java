package xf6;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class y2 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ni6.c f305179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f305180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2 f305181c = this;
    public final e4m.e d;
    public final e4m.e e;

    public y2(w2 w2Var, ni6.c cVar) {
        this.f305180b = w2Var;
        this.f305179a = cVar;
        int i = 13;
        this.d = e4m.b.b(new t1(w2Var, this, 0, i));
        this.e = e4m.b.b(new t1(w2Var, this, 1, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
