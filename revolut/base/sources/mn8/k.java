package mn8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_settings.impl.ui_kompot.security_and_privacy.JuniorSecurityAndPrivacyControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorSecurityAndPrivacyControllerContract$InputData f207442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f207443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f207444c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f207445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f207446h;

    public k(o oVar, ViewController viewController, JuniorSecurityAndPrivacyControllerContract$InputData juniorSecurityAndPrivacyControllerContract$InputData) {
        this.f207443b = oVar;
        this.f207442a = juniorSecurityAndPrivacyControllerContract$InputData;
        this.f207444c = e4m.b.b(e4m.c.a(viewController));
        int i = 21;
        this.d = e4m.b.b(new mjl.b(oVar, this, 2, i));
        this.e = e4m.b.b(new mjl.b(oVar, this, 1, i));
        this.f = e4m.b.b(new mjl.b(oVar, this, 0, i));
        this.f207445g = e4m.b.b(new mjl.b(oVar, this, 4, i));
        this.f207446h = e4m.b.b(new mjl.b(oVar, this, 3, i));
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
