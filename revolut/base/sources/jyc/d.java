package jyc;

import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import com.revolut.kompot.navigable.vc.ViewController;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements xki.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f179366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f179367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SotFlowContract$Step.EvidenceList f179368c;

    public d(h hVar) {
        this.f179366a = hVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        throw null;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f179367b, ViewController.class);
        s.h(this.f179368c, SotFlowContract$Step.EvidenceList.class);
        return new e(this.f179366a, this.f179367b, this.f179368c);
    }
}
