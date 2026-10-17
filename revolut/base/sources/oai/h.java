package oai;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$InputData;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements tng.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f223692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DateOfBirthControllerDescriptor$InputData f223693c;
    public final Object d;
    public final Object e;

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f223691a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f223691a) {
            case 0:
                this.f223692b = viewController;
                break;
            case 1:
                this.f223692b = viewController;
                break;
            default:
                this.f223692b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f223691a) {
            case 0:
                vc.s.h(this.f223692b, ViewController.class);
                vc.s.h(this.f223693c, DateOfBirthControllerDescriptor$InputData.class);
                return new nng.e((i0) this.d, (q) this.e, this.f223693c);
            case 1:
                vc.s.h(this.f223692b, ViewController.class);
                vc.s.h(this.f223693c, DateOfBirthControllerDescriptor$InputData.class);
                return new nng.e((sja.a) this.d, (sja.b) this.e, this.f223693c);
            default:
                vc.s.h(this.f223692b, ViewController.class);
                vc.s.h(this.f223693c, DateOfBirthControllerDescriptor$InputData.class);
                return new nng.e((ta9.m) this.d, (ta9.o) this.e, this.f223693c);
        }
    }

    @Override // tng.a
    public final tng.a z(DateOfBirthControllerDescriptor$InputData dateOfBirthControllerDescriptor$InputData) {
        switch (this.f223691a) {
            case 0:
                dateOfBirthControllerDescriptor$InputData.getClass();
                this.f223693c = dateOfBirthControllerDescriptor$InputData;
                break;
            case 1:
                dateOfBirthControllerDescriptor$InputData.getClass();
                this.f223693c = dateOfBirthControllerDescriptor$InputData;
                break;
            default:
                dateOfBirthControllerDescriptor$InputData.getClass();
                this.f223693c = dateOfBirthControllerDescriptor$InputData;
                break;
        }
        return this;
    }
}
