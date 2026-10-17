package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.InsuranceDocumentsPreviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 implements jv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f200083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f200084c;
    public InsuranceDocumentsPreviewScreenContract$InputData d;

    public d0(s sVar, p pVar) {
        this.f200082a = sVar;
        this.f200083b = pVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f200084c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f200084c, ViewController.class);
        vc.s.h(this.d, InsuranceDocumentsPreviewScreenContract$InputData.class);
        return new e0(this.f200082a, this.f200083b, this.d);
    }

    @Override // jv7.a
    public final jv7.a i0(InsuranceDocumentsPreviewScreenContract$InputData insuranceDocumentsPreviewScreenContract$InputData) {
        insuranceDocumentsPreviewScreenContract$InputData.getClass();
        this.d = insuranceDocumentsPreviewScreenContract$InputData;
        return this;
    }
}
