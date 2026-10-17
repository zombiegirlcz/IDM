package afj;

import com.revolut.kompot.navigable.screen.BaseScreen;

/* JADX INFO: loaded from: classes11.dex */
public final class q3 implements sji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BaseScreen f4410c;

    public /* synthetic */ q3(b bVar, Object obj2, int i) {
        this.f4408a = i;
        this.f4409b = bVar;
    }

    @Override // sji.a
    public final Object S(BaseScreen baseScreen) {
        switch (this.f4408a) {
            case 0:
                this.f4410c = baseScreen;
                break;
            case 1:
                this.f4410c = baseScreen;
                break;
            case 2:
                this.f4410c = baseScreen;
                break;
            case 3:
                this.f4410c = baseScreen;
                break;
            case 4:
                this.f4410c = baseScreen;
                break;
            case 5:
                this.f4410c = baseScreen;
                break;
            default:
                this.f4410c = baseScreen;
                break;
        }
        return this;
    }

    @Override // sji.a
    /* JADX INFO: renamed from: build */
    public final sji.b mo3800build() {
        switch (this.f4408a) {
            case 0:
                vc.s.h(this.f4410c, BaseScreen.class);
                r3 r3Var = new r3(0);
                int i = 23;
                b bVar = this.f4409b;
                r3Var.f4426b = e4m.b.b(new p2(bVar, r3Var, 1, i));
                r3Var.f4427c = e4m.b.b(new p2(bVar, r3Var, 0, i));
                return r3Var;
            case 1:
                vc.s.h(this.f4410c, BaseScreen.class);
                r3 r3Var2 = new r3(1);
                int i2 = 24;
                b bVar2 = this.f4409b;
                r3Var2.f4426b = e4m.b.b(new p2(bVar2, r3Var2, 1, i2));
                r3Var2.f4427c = e4m.b.b(new p2(bVar2, r3Var2, 0, i2));
                return r3Var2;
            case 2:
                vc.s.h(this.f4410c, BaseScreen.class);
                r3 r3Var3 = new r3(2);
                int i3 = 25;
                b bVar3 = this.f4409b;
                r3Var3.f4426b = e4m.b.b(new p2(bVar3, r3Var3, 1, i3));
                r3Var3.f4427c = e4m.b.b(new p2(bVar3, r3Var3, 0, i3));
                return r3Var3;
            case 3:
                vc.s.h(this.f4410c, BaseScreen.class);
                r3 r3Var4 = new r3(3);
                int i5 = 26;
                b bVar4 = this.f4409b;
                r3Var4.f4426b = e4m.b.b(new p2(bVar4, r3Var4, 1, i5));
                r3Var4.f4427c = e4m.b.b(new p2(bVar4, r3Var4, 0, i5));
                return r3Var4;
            case 4:
                vc.s.h(this.f4410c, BaseScreen.class);
                r3 r3Var5 = new r3(4);
                int i6 = 27;
                b bVar5 = this.f4409b;
                r3Var5.f4426b = e4m.b.b(new p2(bVar5, r3Var5, 1, i6));
                r3Var5.f4427c = e4m.b.b(new p2(bVar5, r3Var5, 0, i6));
                return r3Var5;
            case 5:
                vc.s.h(this.f4410c, BaseScreen.class);
                r3 r3Var6 = new r3(5);
                int i21 = 28;
                b bVar6 = this.f4409b;
                r3Var6.f4426b = e4m.b.b(new p2(bVar6, r3Var6, 1, i21));
                r3Var6.f4427c = e4m.b.b(new p2(bVar6, r3Var6, 0, i21));
                return r3Var6;
            default:
                vc.s.h(this.f4410c, BaseScreen.class);
                r3 r3Var7 = new r3(6);
                int i22 = 29;
                b bVar7 = this.f4409b;
                r3Var7.f4426b = e4m.b.b(new p2(bVar7, r3Var7, 1, i22));
                r3Var7.f4427c = e4m.b.b(new p2(bVar7, r3Var7, 0, i22));
                return r3Var7;
        }
    }
}
