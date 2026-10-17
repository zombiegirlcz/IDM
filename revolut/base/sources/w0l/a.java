package w0l;

import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import rd0.e;
import ty7.b;
import urd.n;
import v0l.d;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends sxk.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f293769l;

    public a(d presentationModel) {
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f293769l = presentationModel;
    }

    @Override // sxk.a
    public final h Z2() {
        h hVar = new h(new b(this, 17), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        return hVar;
    }

    @Override // sxk.a
    public final vkm.d b3() {
        return e.b(e.c(new n(e.b(this.f293769l.f284927a.f200849a.e.f(Unit.f186387a, false)), 27), g.f186406a));
    }
}
