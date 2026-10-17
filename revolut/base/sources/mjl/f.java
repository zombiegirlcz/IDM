package mjl;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.sso.impl.ui.revolut_id.connected_clients.connected_client_details.ConnectedClientDetailsFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectedClientDetailsFlowContract$InputData f206078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f206079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f206080c;
    public final f d = this;
    public final e4m.e e = e4m.b.b(new m69.a(this, 9));

    public f(m mVar, ViewController viewController, ConnectedClientDetailsFlowContract$InputData connectedClientDetailsFlowContract$InputData) {
        this.f206080c = mVar;
        this.f206078a = connectedClientDetailsFlowContract$InputData;
        this.f206079b = viewController;
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
