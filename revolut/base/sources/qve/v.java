package qve;

import com.revolut.feature.topup_screen.api.descriptor.EditStoredMethodLabelDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;

/* JADX INFO: loaded from: classes8.dex */
public final class v implements zxe.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f249662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f249663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditStoredMethodLabelDescriptor$InputData f249664c;

    public v(k kVar) {
        this.f249662a = kVar;
    }

    @Override // zxe.a
    public final zxe.a F(EditStoredMethodLabelDescriptor$InputData editStoredMethodLabelDescriptor$InputData) {
        editStoredMethodLabelDescriptor$InputData.getClass();
        this.f249664c = editStoredMethodLabelDescriptor$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f249663b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        vc.s.h(this.f249663b, ViewController.class);
        vc.s.h(this.f249664c, EditStoredMethodLabelDescriptor$InputData.class);
        return new u(this.f249662a, this.f249664c);
    }
}
