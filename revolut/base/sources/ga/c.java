package ga;

import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlowContract$InputData;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import g9g.e0;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavigationHubFlowContract$InputData f141965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f141966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f141967c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c(a aVar, ViewController viewController, NavigationHubFlowContract$InputData navigationHubFlowContract$InputData) {
        this.f141966b = aVar;
        this.f141965a = navigationHubFlowContract$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 14;
        this.e = e4m.b.b(new e0(aVar, this, 1, i));
        this.f = e4m.b.b(new e0(aVar, this, 0, i));
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
