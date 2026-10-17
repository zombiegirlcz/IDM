package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.identifier_input.IdentifierInputScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class k1 implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196009a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifierInputScreenContract$InputData f196010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f196011c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f196012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f196013h;
    public final Object i;

    public k1(q0 q0Var, j jVar, IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData) {
        this.i = jVar;
        this.f196010b = identifierInputScreenContract$InputData;
        int i = 11;
        this.f196011c = e4m.b.b(new ld1.q(q0Var, jVar, this, 2, i));
        this.d = e4m.b.b(new ld1.q(q0Var, jVar, this, 1, i));
        this.e = e4m.b.b(new ld1.q(q0Var, jVar, this, 0, i));
        this.f = e4m.b.b(new ld1.q(q0Var, jVar, this, 3, i));
        this.f196012g = e4m.b.b(new ld1.q(q0Var, jVar, this, 5, i));
        this.f196013h = e4m.b.b(new ld1.q(q0Var, jVar, this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f196009a) {
        }
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f196009a) {
            case 0:
                return ImmutableSet.of((yji.d) ((c) this.i).P.get(), (yji.d) this.e.get());
            case 1:
                return ImmutableSet.of((yji.d) ((w0) this.i).f196132n.get(), (yji.d) this.e.get());
            default:
                return ImmutableSet.of((yji.d) ((j) this.i).f195993q.get(), (yji.d) this.e.get());
        }
    }

    public k1(q0 q0Var, c cVar, IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData) {
        this.i = cVar;
        this.f196010b = identifierInputScreenContract$InputData;
        int i = 9;
        this.f196011c = e4m.b.b(new ld1.q(q0Var, cVar, this, 2, i));
        this.d = e4m.b.b(new ld1.q(q0Var, cVar, this, 1, i));
        this.e = e4m.b.b(new ld1.q(q0Var, cVar, this, 0, i));
        this.f = e4m.b.b(new ld1.q(q0Var, cVar, this, 3, i));
        this.f196012g = e4m.b.b(new ld1.q(q0Var, cVar, this, 5, i));
        this.f196013h = e4m.b.b(new ld1.q(q0Var, cVar, this, 4, i));
    }

    public k1(q0 q0Var, w0 w0Var, IdentifierInputScreenContract$InputData identifierInputScreenContract$InputData) {
        this.i = w0Var;
        this.f196010b = identifierInputScreenContract$InputData;
        int i = 10;
        this.f196011c = e4m.b.b(new ld1.q(q0Var, w0Var, this, 2, i));
        this.d = e4m.b.b(new ld1.q(q0Var, w0Var, this, 1, i));
        this.e = e4m.b.b(new ld1.q(q0Var, w0Var, this, 0, i));
        this.f = e4m.b.b(new ld1.q(q0Var, w0Var, this, 3, i));
        this.f196012g = e4m.b.b(new ld1.q(q0Var, w0Var, this, 5, i));
        this.f196013h = e4m.b.b(new ld1.q(q0Var, w0Var, this, 4, i));
    }
}
