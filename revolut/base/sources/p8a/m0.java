package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount.PixQrRequestAddAmountScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixQrRequestAddAmountScreenContract$InputData f234024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f234025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234026c;
    public final e4m.e d;

    public m0(d0 d0Var, o0 o0Var, PixQrRequestAddAmountScreenContract$InputData pixQrRequestAddAmountScreenContract$InputData) {
        this.f234025b = d0Var;
        this.f234024a = pixQrRequestAddAmountScreenContract$InputData;
        this.f234026c = e4m.b.b(new m(d0Var, this, 1, 11));
        this.d = e4m.b.b(new m(d0Var, this, 0, 11));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
