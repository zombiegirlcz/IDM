package o70;

import efm.b;
import efm.d0;
import efm.k;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ufm.n;
import y4l.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        return f(w.f0(rVar));
    }

    public static final n b(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        return i(w.i0(d0Var));
    }

    public static final r c(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        e.Companion.getClass();
        r rVarSubscribeOn = rVar.subscribeOn(e.a.a());
        Intrinsics.checkNotNullExpressionValue(rVarSubscribeOn, "subscribeOn(...)");
        return rVarSubscribeOn;
    }

    public static final pfm.r d(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        e.Companion.getClass();
        pfm.r rVarY = bVar.y(e.a.a());
        Intrinsics.checkNotNullExpressionValue(rVarY, "subscribeOn(...)");
        return rVarY;
    }

    public static final n e(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        e.Companion.getClass();
        n nVarS = d0Var.s(e.a.a());
        Intrinsics.checkNotNullExpressionValue(nVarS, "subscribeOn(...)");
        return nVarS;
    }

    public static final r f(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        e.Companion.getClass();
        r rVarObserveOn = rVar.observeOn(e.a.a());
        Intrinsics.checkNotNullExpressionValue(rVarObserveOn, "observeOn(...)");
        return rVarObserveOn;
    }

    public static final pfm.r g(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        e.Companion.getClass();
        pfm.r rVarT = bVar.t(e.a.a());
        Intrinsics.checkNotNullExpressionValue(rVarT, "observeOn(...)");
        return rVarT;
    }

    public static final rfm.w h(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        e.Companion.getClass();
        rfm.w wVarH = kVar.h(e.a.a());
        Intrinsics.checkNotNullExpressionValue(wVarH, "observeOn(...)");
        return wVarH;
    }

    public static final n i(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        e.Companion.getClass();
        n nVarN = d0Var.n(e.a.a());
        Intrinsics.checkNotNullExpressionValue(nVarN, "observeOn(...)");
        return nVarN;
    }
}
