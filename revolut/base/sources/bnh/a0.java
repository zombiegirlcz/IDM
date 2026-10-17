package bnh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f17171c;
    public final o d;

    public a0(c0 controllerModelExtension, o delegates) {
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f17171c = controllerModelExtension;
        this.d = delegates;
    }

    @Override // yji.d
    public final void M() {
        o oVar = this.d;
        yji.d.H(this, new bk6.c(rd0.e.b(oVar.f17206b.f51589c.f121375b), 6), new bf5.a(this, null, 19), 3);
        yji.d.H(this, rd0.e.b(oVar.f17207c.f53218h), new y(this, null), 3);
        yji.d.H(this, new bk6.c(rd0.e.b(oVar.d.d), 7), new z(this, null), 3);
    }
}
