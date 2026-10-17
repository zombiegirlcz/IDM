package u7i;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import n7i.j0;
import u45.w0;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyAutomationScreenContract$InputData f277812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f277813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f277814c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f277815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f277816h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f277817j;

    public j(l lVar, h hVar, ViewController viewController, MoveMoneyAutomationScreenContract$InputData moveMoneyAutomationScreenContract$InputData) {
        this.f277813b = lVar;
        this.f277814c = hVar;
        this.f277812a = moveMoneyAutomationScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 4;
        this.e = e4m.b.b(new w0(lVar, this, 1, i));
        this.f = e4m.b.b(new w0(lVar, this, 0, i));
        this.f277815g = e4m.b.b(new w0(lVar, this, 3, i));
        this.f277816h = e4m.b.b(new w0(lVar, this, 2, i));
        this.i = e4m.b.b(new w0(lVar, this, 5, i));
        this.f277817j = e4m.b.b(new w0(lVar, this, 4, i));
    }

    public final r7i.u b() {
        l lVar = this.f277813b;
        w5i.b bVarB = lVar.z.b();
        vc.s.j(bVarB);
        j0 j0Var = new j0(bVarB);
        n8b.a aVarA = lVar.V.a();
        vc.s.j(aVarA);
        return new r7i.u(j0Var, new c8i.n(aVarA, 0));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f277816h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
