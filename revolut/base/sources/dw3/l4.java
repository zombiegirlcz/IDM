package dw3;

import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes22.dex */
public final class l4 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BaseScreen f119201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f119202c;

    public /* synthetic */ l4(Object obj2, Object obj3, int i) {
        this.f119200a = i;
        this.f119202c = obj2;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f119200a) {
            case 0:
                this.f119201b = baseScreen;
                break;
            case 1:
                this.f119201b = baseScreen;
                break;
            default:
                this.f119201b = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f119200a) {
            case 0:
                vc.s.h(this.f119201b, BaseScreen.class);
                c1 c1Var = (c1) this.f119202c;
                m4 m4Var = new m4(0);
                int i = 18;
                m4Var.f119276b = e4m.b.b(new g3(c1Var, m4Var, 1, i));
                m4Var.f119277c = e4m.b.b(new g3(c1Var, m4Var, 0, i));
                return m4Var;
            case 1:
                vc.s.h(this.f119201b, BaseScreen.class);
                jm4.a3 a3Var = (jm4.a3) this.f119202c;
                m4 m4Var2 = new m4(1);
                int i2 = 24;
                m4Var2.f119276b = e4m.b.b(new jm4.f1(a3Var, m4Var2, 1, i2));
                m4Var2.f119277c = e4m.b.b(new jm4.f1(a3Var, m4Var2, 0, i2));
                return m4Var2;
            default:
                vc.s.h(this.f119201b, BaseScreen.class);
                u45.h hVar = (u45.h) this.f119202c;
                m4 m4Var3 = new m4(2);
                int i3 = 25;
                m4Var3.f119276b = e4m.b.b(new u45.e(hVar, m4Var3, 1, i3));
                m4Var3.f119277c = e4m.b.b(new u45.e(hVar, m4Var3, 0, i3));
                return m4Var3;
        }
    }
}
