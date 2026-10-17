package uc0;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import zc0.g;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d {
    public static final r a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        r rVarFlatMapMaybe = gVar.w0().flatMapMaybe(new ubj.c(3, new u8c.c(25)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapMaybe, "flatMapMaybe(...)");
        return rVarFlatMapMaybe;
    }

    public static final r b(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.w0().flatMapMaybe(new ubj.c(6, new u8c.c(22))).distinctUntilChanged();
    }

    public static final r c(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        r rVarDistinctUntilChanged = gVar.w0().switchMapMaybe(new ubj.c(7, new u8c.c(23))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public static final r d(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.w0().flatMapMaybe(new ubj.c(5, new u8c.c(21))).distinctUntilChanged();
    }
}
