package p8a;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pix.api.navigation.PixTransferNavigation$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 implements rca.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixTransferNavigation$InputData.NewContact f233969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f233970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f233971c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g0(d0 d0Var, u0 u0Var, ViewController viewController, PixTransferNavigation$InputData.NewContact newContact) {
        this.f233969a = newContact;
        this.f233970b = e4m.b.b(e4m.c.a(viewController));
        this.f233971c = e4m.b.b(new f0(d0Var, this, 2));
        this.d = e4m.b.b(new f0(d0Var, this, 1));
        this.e = e4m.b.b(new f0(d0Var, this, 0));
        this.f = e4m.b.b(new f0(d0Var, this, 3));
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
