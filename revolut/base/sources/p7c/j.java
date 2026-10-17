package p7c;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.api.shared.navigation.PayWithAnyControllerDescriptor$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements xki.c, xdc.c, qdc.c, hdc.c, jdc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayWithAnyControllerDescriptor$InputData f233624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f233625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f233626c = this;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f233627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f233628h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f233629j;

    public j(r rVar, ViewController viewController, PayWithAnyControllerDescriptor$InputData payWithAnyControllerDescriptor$InputData) {
        this.f233625b = rVar;
        this.f233624a = payWithAnyControllerDescriptor$InputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        this.e = e4m.b.b(new p12.f0(rVar, this, 2, i));
        this.f = e4m.b.b(new p12.f0(rVar, this, 1, i));
        this.f233627g = e4m.b.b(new p12.f0(rVar, this, 0, i));
        this.f233628h = e4m.b.b(new p12.f0(rVar, this, 3, i));
        this.i = e4m.b.b(new p12.f0(rVar, this, 4, i));
        this.f233629j = e4m.b.b(new p12.f0(rVar, this, 5, i));
    }

    @Override // qdc.c
    public final qdc.a b() {
        return new h0(this.f233625b, this.f233626c);
    }

    @Override // xdc.c
    public final xdc.a c() {
        return new l0(this.f233625b, this.f233626c);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // hdc.c
    public final hdc.a j() {
        return new z(this.f233625b, this.f233626c, 1);
    }

    @Override // jdc.c
    public final jdc.a q() {
        return new d0(this.f233625b, this.f233626c);
    }
}
