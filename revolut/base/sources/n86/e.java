package n86;

import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements xki.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f213237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f213238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeviceManagementDestination.Config f213239c;

    public e(d dVar) {
        this.f213237a = dVar;
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        throw null;
    }

    @Override // xki.b
    public final xki.c build() {
        s.h(this.f213238b, ViewController.class);
        s.h(this.f213239c, DeviceManagementDestination.Config.class);
        return new g(this.f213237a, this.f213238b, this.f213239c);
    }
}
