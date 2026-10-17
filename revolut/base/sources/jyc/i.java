package jyc;

import com.revolut.feature.selfserve.sot.api.navigation.SotDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements xki.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f179388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f179389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SotDestination.Config f179390c;

    public i(h hVar) {
        this.f179388a = hVar;
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        throw null;
    }

    @Override // xki.b
    public final xki.c build() {
        s.h(this.f179389b, ViewController.class);
        s.h(this.f179390c, SotDestination.Config.class);
        return new k(this.f179388a, this.f179389b, this.f179390c);
    }
}
