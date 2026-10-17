package lu7;

import com.revolut.feature.insurance_embedded.impl.ui.screen.document.text.SimpleTextDocumentScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements hv7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f200100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f200101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f200102c;
    public SimpleTextDocumentScreenContract$InputData d;
    public final Object e;

    public /* synthetic */ g0(s sVar, Object obj2, int i) {
        this.f200100a = i;
        this.f200101b = sVar;
        this.e = obj2;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f200100a) {
            case 0:
                this.f200102c = viewController;
                break;
            case 1:
                this.f200102c = viewController;
                break;
            default:
                this.f200102c = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f200100a) {
            case 0:
                vc.s.h(this.f200102c, ViewController.class);
                vc.s.h(this.d, SimpleTextDocumentScreenContract$InputData.class);
                return new h0(this.f200101b, (i) this.e, this.d);
            case 1:
                vc.s.h(this.f200102c, ViewController.class);
                vc.s.h(this.d, SimpleTextDocumentScreenContract$InputData.class);
                return new h0(this.f200101b, (m) this.e, this.d);
            default:
                vc.s.h(this.f200102c, ViewController.class);
                vc.s.h(this.d, SimpleTextDocumentScreenContract$InputData.class);
                return new h0(this.f200101b, (k) this.e, this.d);
        }
    }

    @Override // hv7.a
    public final hv7.a c0(SimpleTextDocumentScreenContract$InputData simpleTextDocumentScreenContract$InputData) {
        switch (this.f200100a) {
            case 0:
                simpleTextDocumentScreenContract$InputData.getClass();
                this.d = simpleTextDocumentScreenContract$InputData;
                break;
            case 1:
                simpleTextDocumentScreenContract$InputData.getClass();
                this.d = simpleTextDocumentScreenContract$InputData;
                break;
            default:
                simpleTextDocumentScreenContract$InputData.getClass();
                this.d = simpleTextDocumentScreenContract$InputData;
                break;
        }
        return this;
    }
}
