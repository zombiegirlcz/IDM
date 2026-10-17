package v20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public interface o extends od0.e {
    static efm.r L(o oVar) {
        v30.c0 feedType = v30.c0.SUPPORT;
        f0 f0Var = (f0) oVar;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        efm.r rVarA0 = te0.w.a0(f0Var.e.a(false), new r10.c(feedType, 7));
        Object value = f0Var.f285397w.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        efm.r rVarMergeWith = f0Var.f285391n.e(feedType, w4l.i.f294643c).mergeWith(f0Var.o(rVarA0, te0.w.a0((efm.r) value, new r10.c(feedType, 8))).switchMapCompletable(new t(new r(f0Var, feedType, 1), 1)));
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        return rVarMergeWith;
    }
}
