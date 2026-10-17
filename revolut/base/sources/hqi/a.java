package hqi;

import efm.r;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.b f154697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f154698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.b f154699c;
    public final ihm.f d;
    public final ihm.b e;
    public final ihm.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f154700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f154701h;
    public final ihm.j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ihm.b f154702j;

    public a() {
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        ihm.b bVar = new ihm.b();
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        this.f154697a = bVar;
        this.f154698b = j6.a.h("create(...)");
        this.f154699c = j6.a.h("create(...)");
        this.d = v0.a.d("create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        ihm.b bVar2 = new ihm.b();
        Intrinsics.checkNotNullExpressionValue(bVar2, "create(...)");
        this.e = bVar2;
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        ihm.b bVar3 = new ihm.b();
        Intrinsics.checkNotNullExpressionValue(bVar3, "create(...)");
        this.f = bVar3;
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        ihm.f fVar = new ihm.f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.f154700g = fVar;
        this.f154701h = j6.a.h("create(...)");
        ihm.j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.i = jVarD;
        Intrinsics.checkNotNullExpressionValue(new ihm.b().d(), "toSerialized(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.f().d(), "toSerialized(...)");
        ihm.b bVar4 = new ihm.b();
        Intrinsics.checkNotNullExpressionValue(bVar4, "create(...)");
        this.f154702j = bVar4;
        Intrinsics.checkNotNullExpressionValue(new ihm.b().d(), "toSerialized(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b().d(), "toSerialized(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
        Intrinsics.checkNotNullExpressionValue(ihm.b.e(Boolean.FALSE), "createDefault(...)");
        Intrinsics.checkNotNullExpressionValue(new ihm.b(), "create(...)");
    }

    @Override // hqi.l
    public final void A(int i, int i2) {
        this.f154701h.onNext(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    @Override // hqi.l
    public final void F(int i) {
        this.f154698b.onNext(Integer.valueOf(i));
    }

    @Override // hqi.l
    public final r b() {
        return this.f154700g;
    }

    @Override // hqi.l
    public final void h(boolean z) {
        this.f154699c.onNext(Boolean.valueOf(z));
    }

    @Override // hqi.l
    public final r i() {
        return this.d;
    }

    @Override // hqi.l
    public final r j() {
        r rVarHide = this.i.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // hqi.l
    public final void k(int i) {
        this.f.onNext(Integer.valueOf(i));
    }

    @Override // hqi.l
    public final void l(String hint) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f154702j.onNext(hint);
    }

    @Override // hqi.l
    public final void n(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f154697a.onNext(title);
    }

    @Override // hqi.l
    public final void q(boolean z) {
        this.e.onNext(Boolean.valueOf(z));
    }
}
