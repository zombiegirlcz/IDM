package qi3;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.chooser.c f246649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.j f246650b;

    public n(com.revolut.feature.chooser.c presentationModel) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f246649a = presentationModel;
        this.f246650b = p.a.D("toSerialized(...)");
    }

    @Override // qi3.r
    public final efm.b a() {
        pfm.h hVar = new pfm.h(new oma.r(this, 16), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // qi3.r
    public final efm.b b() {
        com.revolut.feature.chooser.c cVar = this.f246649a;
        return v7.x(new ufm.f(cVar.T0().f(cVar.N2()), new qe0.g(19, new m(this, 1)), 3), "ignoreElement(...)");
    }

    @Override // qi3.r
    public final efm.b c(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        com.revolut.feature.chooser.c cVar = this.f246649a;
        return v7.x(new ufm.f(cVar.a2(id10).f(cVar.d1(id10)), new qe0.g(18, new m(this, 0)), 3), "ignoreElement(...)");
    }

    @Override // qi3.r
    public final efm.r d() {
        return this.f246650b;
    }
}
