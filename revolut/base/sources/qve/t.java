package qve;

import com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements zxe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f249656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f249657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewController f249658c;
    public EditStoredMethodLabelDescriptor$InputData d;

    public t(k kVar, c cVar) {
        this.f249656a = kVar;
        this.f249657b = cVar;
    }

    @Override // zxe.a
    public final zxe.a F(EditStoredMethodLabelDescriptor$InputData editStoredMethodLabelDescriptor$InputData) {
        editStoredMethodLabelDescriptor$InputData.getClass();
        this.d = editStoredMethodLabelDescriptor$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f249658c = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f249658c, ViewController.class);
        vc.s.h(this.d, EditStoredMethodLabelDescriptor$InputData.class);
        return new u(this.f249656a, this.f249657b, this.d);
    }
}
