package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.InsuranceDocumentsPreviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements jv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f200095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InsuranceDocumentsPreviewScreenContract$InputData f200096c;

    public f0(s sVar) {
        this.f200094a = sVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f200095b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f200095b, ViewController.class);
        vc.s.h(this.f200096c, InsuranceDocumentsPreviewScreenContract$InputData.class);
        return new e0(this.f200094a, this.f200096c);
    }

    @Override // jv7.a
    public final jv7.a i0(InsuranceDocumentsPreviewScreenContract$InputData insuranceDocumentsPreviewScreenContract$InputData) {
        insuranceDocumentsPreviewScreenContract$InputData.getClass();
        this.f200096c = insuranceDocumentsPreviewScreenContract$InputData;
        return this;
    }
}
