package lu7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help.GetHelpScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetHelpScreenContract$InputData f200115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f200117c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f200118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f200119h;

    public j(s sVar, ViewController viewController, GetHelpScreenContract$InputData getHelpScreenContract$InputData) {
        this.f200116b = sVar;
        this.f200115a = getHelpScreenContract$InputData;
        int i = 12;
        this.f200117c = e4m.b.b(new lti.l(sVar, this, 1, i));
        this.d = e4m.b.b(new lti.l(sVar, this, 0, i));
        this.e = e4m.b.b(new lti.l(sVar, this, 3, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i2 = 12;
        this.f200118g = e4m.b.b(new lti.l(sVar, this, 4, i2));
        this.f200119h = e4m.b.b(new lti.l(sVar, this, 2, i2));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
