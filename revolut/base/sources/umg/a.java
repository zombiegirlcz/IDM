package umg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements tmg.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f281311a;

    public a(e stepItemsProvider, b progressChartProvider) {
        Intrinsics.checkNotNullParameter(stepItemsProvider, "stepItemsProvider");
        Intrinsics.checkNotNullParameter(progressChartProvider, "progressChartProvider");
        this.f281311a = stepItemsProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$c] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, qv0.i] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v9 com.revolut.core.ui_kit.delegates.RowDelegate$Model, still in use, count: 2, list:
          (r4v9 com.revolut.core.ui_kit.delegates.RowDelegate$Model) from 0x020c: MOVE (r48v1 com.revolut.core.ui_kit.delegates.RowDelegate$Model) = (r4v9 com.revolut.core.ui_kit.delegates.RowDelegate$Model)
          (r4v9 com.revolut.core.ui_kit.delegates.RowDelegate$Model) from 0x0201: MOVE (r48v3 com.revolut.core.ui_kit.delegates.RowDelegate$Model) = (r4v9 com.revolut.core.ui_kit.delegates.RowDelegate$Model)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // tmg.b
    public final java.util.List a(fmg.u r48) {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: umg.a.a(fmg.u):java.util.List");
    }
}
