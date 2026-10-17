package nng;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$InputData;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements tng.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f217638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f217639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DateOfBirthControllerDescriptor$InputData f217640c;

    public d(p pVar) {
        this.f217638a = pVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f217639b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f217639b, ViewController.class);
        s.h(this.f217640c, DateOfBirthControllerDescriptor$InputData.class);
        return new e(this.f217638a, this.f217640c);
    }

    @Override // tng.a
    public final tng.a z(DateOfBirthControllerDescriptor$InputData dateOfBirthControllerDescriptor$InputData) {
        dateOfBirthControllerDescriptor$InputData.getClass();
        this.f217640c = dateOfBirthControllerDescriptor$InputData;
        return this;
    }
}
