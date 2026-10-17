package n86;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements v86.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeviceManagementDestination.Config f213243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f213244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f213245c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public g(d dVar, ViewController viewController, DeviceManagementDestination.Config config) {
        this.f213243a = config;
        this.f213244b = e4m.b.b(e4m.c.a(viewController));
        this.f213245c = e4m.b.b(new f(dVar, this, 2));
        this.d = e4m.b.b(new f(dVar, this, 1));
        this.e = e4m.b.b(new f(dVar, this, 0));
        this.f = e4m.b.b(new f(dVar, this, 3));
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
