package nsf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transfer_reasons.api.navigation.TransferReasonsFlowInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements xki.c, ysf.a, ctf.a, etf.a, itf.a, otf.a, atf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsFlowInputData f218810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f218811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f218812c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public d(b bVar, ViewController viewController, TransferReasonsFlowInputData transferReasonsFlowInputData) {
        this.f218811b = bVar;
        this.f218810a = transferReasonsFlowInputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 16;
        this.e = e4m.b.b(new nk7.k(bVar, this, 1, i));
        this.f = e4m.b.b(new nk7.k(bVar, this, 0, i));
    }

    @Override // ctf.a
    public final o b() {
        return new o(this.f218811b, this.f218812c, 1);
    }

    @Override // otf.a
    public final s c() {
        return new s(this.f218811b, this.f218812c, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // etf.a
    public final k j() {
        return new k(this.f218811b, this.f218812c, 1);
    }

    @Override // itf.a
    public final q q() {
        return new q(this.f218811b, this.f218812c, 1);
    }

    @Override // ysf.a
    public final i s() {
        return new i(this.f218811b, this.f218812c, 1);
    }

    @Override // atf.a
    public final m y() {
        return new m(this.f218811b, this.f218812c, 1);
    }
}
