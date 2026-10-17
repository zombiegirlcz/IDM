package jyc;

import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f179401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f179402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SotFlowContract$Step.Summary f179403c;

    public n(h hVar) {
        this.f179401a = hVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        throw null;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f179402b, ViewController.class);
        s.h(this.f179403c, SotFlowContract$Step.Summary.class);
        return new o(this.f179401a, this.f179403c);
    }
}
