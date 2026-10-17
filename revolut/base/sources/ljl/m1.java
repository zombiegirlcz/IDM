package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.sso.impl.ui.phone.enter_phone.EnterPhoneScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class m1 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196033a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnterPhoneScreenContract$InputData f196034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f196035c;
    public final e4m.e d;
    public final Object e;

    public m1(q0 q0Var, c cVar, EnterPhoneScreenContract$InputData enterPhoneScreenContract$InputData) {
        this.e = cVar;
        this.f196034b = enterPhoneScreenContract$InputData;
        int i = 14;
        this.f196035c = e4m.b.b(new ld1.q(q0Var, cVar, this, 1, i));
        this.d = e4m.b.b(new ld1.q(q0Var, cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f196033a) {
            case 0:
                return ImmutableSet.of();
            case 1:
                return ImmutableSet.of();
            default:
                return ImmutableSet.of((yji.n) ((c) this.e).Q.get());
        }
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f196033a) {
            case 0:
                return ImmutableSet.of((yji.d) ((w0) this.e).f196132n.get());
            case 1:
                return ImmutableSet.of((yji.d) ((h) this.e).f195963p.get());
            default:
                return ImmutableSet.of((yji.d) ((c) this.e).P.get());
        }
    }

    public m1(q0 q0Var, w0 w0Var, EnterPhoneScreenContract$InputData enterPhoneScreenContract$InputData) {
        this.e = w0Var;
        this.f196034b = enterPhoneScreenContract$InputData;
        int i = 12;
        this.f196035c = e4m.b.b(new ld1.q(q0Var, w0Var, this, 1, i));
        this.d = e4m.b.b(new ld1.q(q0Var, w0Var, this, 0, i));
    }

    public m1(q0 q0Var, h hVar, EnterPhoneScreenContract$InputData enterPhoneScreenContract$InputData) {
        this.e = hVar;
        this.f196034b = enterPhoneScreenContract$InputData;
        int i = 13;
        this.f196035c = e4m.b.b(new ld1.q(q0Var, hVar, this, 1, i));
        this.d = e4m.b.b(new ld1.q(q0Var, hVar, this, 0, i));
    }
}
