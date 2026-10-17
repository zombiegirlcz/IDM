package g1g;

import efm.b;
import efm.r;
import java.util.List;
import java.util.Stack;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import rp0.y;
import yji.d;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends d implements j60.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j60.a f139592c;
    public final Stack d;
    public boolean e;

    public a(j60.a dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f139592c = dialog;
        this.d = new Stack();
    }

    @Override // j60.a
    public final void A(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f139592c.A(model);
    }

    @Override // j60.a
    public final r C() {
        return this.f139592c.C();
    }

    @Override // j60.a
    public final r E() {
        return this.f139592c.E();
    }

    @Override // j60.a
    public final r F() {
        return this.f139592c.F();
    }

    @Override // j60.a
    public final b G(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return this.f139592c.G(model);
    }

    @Override // yji.d
    public final void M() {
        d.H(this, e.b(this.f139592c.E()), new ft.d(this, null, 16), 3);
    }

    @Override // yji.d
    public final void N() {
        this.d.clear();
    }

    @Override // j60.a
    public final void d(List adapterDelegates) {
        Intrinsics.checkNotNullParameter(adapterDelegates, "adapterDelegates");
        this.f139592c.d(adapterDelegates);
    }

    @Override // j60.a
    public final void i(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f139592c.i(model);
    }

    @Override // j60.a
    public final boolean j() {
        return this.f139592c.j();
    }

    @Override // j60.a
    public final void l(boolean z, Function0 doOnHide) {
        Intrinsics.checkNotNullParameter(doOnHide, "doOnHide");
        this.f139592c.l(z, doOnHide);
    }

    @Override // j60.a
    public final r t() {
        return this.f139592c.t();
    }

    @Override // j60.a
    public final void x(y model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Stack stack = this.d;
        boolean zIsEmpty = stack.isEmpty();
        j60.a aVar = this.f139592c;
        if (zIsEmpty) {
            Object objPush = stack.push(model);
            Intrinsics.checkNotNullExpressionValue(objPush, "push(...)");
            aVar.x((y) objPush);
        } else {
            fx5.a aVar2 = new fx5.a(this, model, 4);
            this.e = true;
            aVar.l(true, aVar2);
        }
    }
}
