package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 implements hv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f200113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SimpleTextDocumentScreenContract$InputData f200114c;

    public i0(s sVar) {
        this.f200112a = sVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f200113b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f200113b, ViewController.class);
        vc.s.h(this.f200114c, SimpleTextDocumentScreenContract$InputData.class);
        return new h0(this.f200112a, this.f200114c);
    }

    @Override // hv7.a
    public final hv7.a c0(SimpleTextDocumentScreenContract$InputData simpleTextDocumentScreenContract$InputData) {
        simpleTextDocumentScreenContract$InputData.getClass();
        this.f200114c = simpleTextDocumentScreenContract$InputData;
        return this;
    }
}
