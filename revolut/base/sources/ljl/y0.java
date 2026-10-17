package ljl;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.passcode.PasscodeScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class y0 implements he9.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196143a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PasscodeScreenContract$InputData f196144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BaseScreen f196145c;
    public final q0 d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f196146g;

    public y0(q0 q0Var, h0 h0Var, BaseScreen baseScreen, PasscodeScreenContract$InputData passcodeScreenContract$InputData) {
        this.d = q0Var;
        this.f196144b = passcodeScreenContract$InputData;
        this.f196145c = baseScreen;
        int i = 9;
        this.e = e4m.b.b(new u(q0Var, this, 1, i));
        this.f = e4m.b.b(new u(q0Var, this, 0, i));
        this.f196146g = e4m.g.a(new u(q0Var, this, 2, i));
    }

    @Override // he9.j
    public final de9.n a() {
        switch (this.f196143a) {
        }
        return (de9.n) this.f.get();
    }

    @Override // sji.b
    public final Set f() {
        switch (this.f196143a) {
            case 0:
                fe9.h hVar = new fe9.h(this.d.f.a());
                h7d.a.d(hVar);
                return ImmutableSet.of(hVar);
            case 1:
                fe9.h hVar2 = new fe9.h(this.d.f.a());
                h7d.a.d(hVar2);
                return ImmutableSet.of(hVar2);
            default:
                fe9.h hVar3 = new fe9.h(this.d.f.a());
                h7d.a.d(hVar3);
                return ImmutableSet.of(hVar3);
        }
    }

    @Override // sji.b
    public final Set g() {
        switch (this.f196143a) {
        }
        return ImmutableSet.of(h7d.a.c(j()));
    }

    @Override // he9.j
    public final a61.a h() {
        switch (this.f196143a) {
        }
        return this.d.B.c();
    }

    @Override // he9.j
    public final j70.a i() {
        switch (this.f196143a) {
            case 0:
                j70.a aVarK = this.d.f196062g.k();
                vc.s.j(aVarK);
                return aVarK;
            case 1:
                j70.a aVarK2 = this.d.f196062g.k();
                vc.s.j(aVarK2);
                return aVarK2;
            default:
                j70.a aVarK3 = this.d.f196062g.k();
                vc.s.j(aVarK3);
                return aVarK3;
        }
    }

    @Override // he9.j
    public final fe9.a j() {
        switch (this.f196143a) {
            case 0:
                return h7d.a.b(this.f196145c, (he9.c) this.f196146g.get());
            case 1:
                return h7d.a.b(this.f196145c, (he9.c) this.f196146g.get());
            default:
                return h7d.a.b(this.f196145c, (he9.c) this.f196146g.get());
        }
    }

    @Override // he9.j
    public final de9.b k() {
        switch (this.f196143a) {
        }
        return e2.a();
    }

    public y0(q0 q0Var, q qVar, BaseScreen baseScreen, PasscodeScreenContract$InputData passcodeScreenContract$InputData) {
        this.d = q0Var;
        this.f196144b = passcodeScreenContract$InputData;
        this.f196145c = baseScreen;
        int i = 7;
        this.e = e4m.b.b(new u(q0Var, this, 1, i));
        this.f = e4m.b.b(new u(q0Var, this, 0, i));
        this.f196146g = e4m.g.a(new u(q0Var, this, 2, i));
    }

    public y0(q0 q0Var, g gVar, BaseScreen baseScreen, PasscodeScreenContract$InputData passcodeScreenContract$InputData) {
        this.d = q0Var;
        this.f196144b = passcodeScreenContract$InputData;
        this.f196145c = baseScreen;
        int i = 8;
        this.e = e4m.b.b(new u(q0Var, this, 1, i));
        this.f = e4m.b.b(new u(q0Var, this, 0, i));
        this.f196146g = e4m.g.a(new u(q0Var, this, 2, i));
    }
}
