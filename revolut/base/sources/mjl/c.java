package mjl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.revolut_id.connected_apps.connected_app_details.ConnectedAppDetailsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectedAppDetailsFlowContract$InputData f206071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f206072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f206073c;
    public final c d = this;
    public final e4m.e e;
    public final e4m.e f;

    public c(m mVar, ViewController viewController, ConnectedAppDetailsFlowContract$InputData connectedAppDetailsFlowContract$InputData) {
        this.f206073c = mVar;
        this.f206071a = connectedAppDetailsFlowContract$InputData;
        this.f206072b = viewController;
        int i = 0;
        this.e = e4m.b.b(new b(mVar, this, 1, i));
        this.f = e4m.b.b(new b(mVar, this, 0, i));
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
