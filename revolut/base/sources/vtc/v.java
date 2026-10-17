package vtc;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.security_hub.impl.ui.security_hub.SecurityHubScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.g f292084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SecurityHubScreenContract$InputData f292085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f292086c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f292087g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f292088h;
    public final e4m.e i;

    public v(t tVar, u uVar, ViewController viewController, SecurityHubScreenContract$InputData securityHubScreenContract$InputData, mkd.g gVar) {
        this.f292086c = tVar;
        this.f292084a = gVar;
        this.f292085b = securityHubScreenContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.e = e4m.b.b(new r7d.w(tVar, uVar, this, 2, i));
        this.f = e4m.b.b(new r7d.w(tVar, uVar, this, 1, i));
        this.f292087g = e4m.b.b(new r7d.w(tVar, uVar, this, 0, i));
        this.f292088h = e4m.b.b(new r7d.w(tVar, uVar, this, 3, i));
        this.i = e4m.b.b(new r7d.w(tVar, uVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f292088h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f292087g.get());
    }
}
