package mn8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAppAccessControllerContract$InputData f207432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f207433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f207434c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f207435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f207436h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f207437j;

    public h(o oVar, ViewController viewController, JuniorAppAccessControllerContract$InputData juniorAppAccessControllerContract$InputData) {
        this.f207433b = oVar;
        this.f207432a = juniorAppAccessControllerContract$InputData;
        this.f207434c = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        this.d = e4m.b.b(new mjl.b(oVar, this, 2, i));
        this.e = e4m.b.b(new mjl.b(oVar, this, 1, i));
        this.f = e4m.b.b(new mjl.b(oVar, this, 0, i));
        this.f207435g = e4m.b.b(new mjl.b(oVar, this, 3, i));
        this.f207436h = e4m.b.b(new mjl.b(oVar, this, 4, i));
        this.i = e4m.b.b(new mjl.b(oVar, this, 6, i));
        this.f207437j = e4m.b.b(new mjl.b(oVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f207435g.get(), (yji.n) this.f207436h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
