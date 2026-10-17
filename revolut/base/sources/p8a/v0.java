package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.screens.transfer_input_key.PixTransferInputKeyScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class v0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixTransferInputKeyScreenContract$InputData f234103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234105c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234106g;

    public v0(d0 d0Var, ViewController viewController, PixTransferInputKeyScreenContract$InputData pixTransferInputKeyScreenContract$InputData) {
        this.f234104b = d0Var;
        this.f234103a = pixTransferInputKeyScreenContract$InputData;
        this.f234105c = e4m.b.b(e4m.c.a(viewController));
        int i = 17;
        this.d = e4m.b.b(new m(d0Var, this, 2, i));
        this.e = e4m.b.b(new m(d0Var, this, 1, i));
        this.f = e4m.b.b(new m(d0Var, this, 0, i));
        this.f234106g = e4m.b.b(new m(d0Var, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
