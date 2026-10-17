package oai;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements aog.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f223764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f223765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NameControllerDescriptor$InputData f223766c;
    public final Object d;
    public final Object e;

    public /* synthetic */ r(Object obj2, Object obj3, int i) {
        this.f223764a = i;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // aog.a
    public final aog.a U(NameControllerDescriptor$InputData nameControllerDescriptor$InputData) {
        switch (this.f223764a) {
            case 0:
                nameControllerDescriptor$InputData.getClass();
                this.f223766c = nameControllerDescriptor$InputData;
                break;
            case 1:
                nameControllerDescriptor$InputData.getClass();
                this.f223766c = nameControllerDescriptor$InputData;
                break;
            default:
                nameControllerDescriptor$InputData.getClass();
                this.f223766c = nameControllerDescriptor$InputData;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        switch (this.f223764a) {
            case 0:
                this.f223765b = viewController;
                break;
            case 1:
                this.f223765b = viewController;
                break;
            default:
                this.f223765b = viewController;
                break;
        }
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        switch (this.f223764a) {
            case 0:
                vc.s.h(this.f223765b, ViewController.class);
                vc.s.h(this.f223766c, NameControllerDescriptor$InputData.class);
                return new nng.i((i0) this.d, (q) this.e, this.f223766c);
            case 1:
                vc.s.h(this.f223765b, ViewController.class);
                vc.s.h(this.f223766c, NameControllerDescriptor$InputData.class);
                return new nng.i((sja.a) this.d, (sja.b) this.e, this.f223766c);
            default:
                vc.s.h(this.f223765b, ViewController.class);
                vc.s.h(this.f223766c, NameControllerDescriptor$InputData.class);
                return new nng.i((ta9.m) this.d, (ta9.o) this.e, this.f223766c);
        }
    }
}
