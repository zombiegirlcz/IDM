package zu8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.kyc.impl.screens.chrome_portal.ChromePortalScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChromePortalScreenContract$InputData f325255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f325256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f325257c;
    public final e4m.e d;

    public d(c0 c0Var, n nVar, ViewController viewController, ChromePortalScreenContract$InputData chromePortalScreenContract$InputData) {
        this.f325255a = chromePortalScreenContract$InputData;
        this.f325256b = viewController;
        int i = 8;
        this.f325257c = e4m.b.b(new zpc.m(c0Var, this, 1, i));
        this.d = e4m.b.b(new zpc.m(c0Var, this, 0, i));
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
