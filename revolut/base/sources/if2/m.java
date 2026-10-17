package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.impl.flow.screen.amount.UpiTransferAmountScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiTransferAmountScreenContract$InputData f160885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f160886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f160887c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f160888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f160889h;
    public final e4m.e i;

    public m(f fVar, n nVar, ViewController viewController, UpiTransferAmountScreenContract$InputData upiTransferAmountScreenContract$InputData) {
        this.f160886b = fVar;
        this.f160885a = upiTransferAmountScreenContract$InputData;
        this.f160887c = e4m.b.b(e4m.c.a(viewController));
        int i = 7;
        this.d = e4m.b.b(new i9e.l(fVar, this, 1, i));
        this.e = e4m.b.b(new i9e.l(fVar, this, 0, i));
        this.f = e4m.b.b(new i9e.l(fVar, this, 5, i));
        this.f160888g = e4m.b.b(new i9e.l(fVar, this, 4, i));
        this.f160889h = e4m.b.b(new i9e.l(fVar, this, 3, i));
        this.i = e4m.b.b(new i9e.l(fVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
