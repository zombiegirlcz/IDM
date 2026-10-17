package n86;

import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f213225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f213226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DeviceManagementDestination.Config.DeviceDetails f213227c;

    public a(d dVar) {
        this.f213225a = dVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        throw null;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f213226b, ViewController.class);
        s.h(this.f213227c, DeviceManagementDestination.Config.DeviceDetails.class);
        return new b(this.f213225a, this.f213227c);
    }
}
