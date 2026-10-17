package nng;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.user_declarations.api.navigation.NameControllerDescriptor$InputData;
import vc.s;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements aog.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f217650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewController f217651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public NameControllerDescriptor$InputData f217652c;

    public h(p pVar) {
        this.f217650a = pVar;
    }

    @Override // aog.a
    public final aog.a U(NameControllerDescriptor$InputData nameControllerDescriptor$InputData) {
        nameControllerDescriptor$InputData.getClass();
        this.f217652c = nameControllerDescriptor$InputData;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public final Object mo3808a(ViewController viewController) {
        this.f217651b = viewController;
        return this;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public final xki.e mo3783build() {
        s.h(this.f217651b, ViewController.class);
        s.h(this.f217652c, NameControllerDescriptor$InputData.class);
        return new i(this.f217650a, this.f217652c);
    }
}
