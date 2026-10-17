package us6;

import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class t1 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f282758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f282759c;

    public /* synthetic */ t1(Object obj2, Object obj3, int i) {
        this.f282757a = i;
        this.f282758b = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f282757a) {
            case 0:
                this.f282759c = baseScreen;
                break;
            case 1:
                this.f282759c = baseScreen;
                break;
            default:
                this.f282759c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f282757a) {
            case 0:
                vc.s.h(this.f282759c, BaseScreen.class);
                q qVar = (q) this.f282758b;
                BaseScreen baseScreen = this.f282759c;
                u1 u1Var = new u1(0);
                u1Var.f282766b = e4m.b.b(e4m.c.a(baseScreen));
                int i = 15;
                u1Var.f282767c = e4m.b.b(new q0(qVar, u1Var, 2, i));
                u1Var.d = e4m.b.b(new q0(qVar, u1Var, 1, i));
                u1Var.e = e4m.b.b(new q0(qVar, u1Var, 0, i));
                u1Var.f = e4m.b.b(new q0(qVar, u1Var, 4, i));
                u1Var.f282768g = e4m.b.b(new q0(qVar, u1Var, 3, i));
                return u1Var;
            case 1:
                vc.s.h(this.f282759c, BaseScreen.class);
                q qVar2 = (q) this.f282758b;
                BaseScreen baseScreen2 = this.f282759c;
                u1 u1Var2 = new u1(1);
                u1Var2.f282766b = e4m.b.b(e4m.c.a(baseScreen2));
                int i2 = 16;
                u1Var2.f282767c = e4m.b.b(new q0(qVar2, u1Var2, 2, i2));
                u1Var2.d = e4m.b.b(new q0(qVar2, u1Var2, 1, i2));
                u1Var2.e = e4m.b.b(new q0(qVar2, u1Var2, 0, i2));
                u1Var2.f = e4m.b.b(new q0(qVar2, u1Var2, 4, i2));
                u1Var2.f282768g = e4m.b.b(new q0(qVar2, u1Var2, 3, i2));
                return u1Var2;
            default:
                vc.s.h(this.f282759c, BaseScreen.class);
                g2 g2Var = (g2) this.f282758b;
                BaseScreen baseScreen3 = this.f282759c;
                int i3 = 2;
                u1 u1Var3 = new u1(i3);
                u1Var3.f282766b = e4m.b.b(e4m.c.a(baseScreen3));
                int i5 = 25;
                u1Var3.f282767c = e4m.b.b(new q0(g2Var, u1Var3, i3, i5));
                u1Var3.d = e4m.b.b(new q0(g2Var, u1Var3, 1, i5));
                u1Var3.e = e4m.b.b(new q0(g2Var, u1Var3, 0, i5));
                u1Var3.f = e4m.b.b(new q0(g2Var, u1Var3, 4, i5));
                u1Var3.f282768g = e4m.b.b(new q0(g2Var, u1Var3, 3, i5));
                return u1Var3;
        }
    }
}
