package dff;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jsb.b f113889a;

    public b(jsb.b sharedTransactionCategoriesResourcesProvider) {
        Intrinsics.checkNotNullParameter(sharedTransactionCategoriesResourcesProvider, "sharedTransactionCategoriesResourcesProvider");
        this.f113889a = sharedTransactionCategoriesResourcesProvider;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.revolut.core.ui_kit.delegates.RowDelegate$Model, still in use, count: 2, list:
          (r2v0 com.revolut.core.ui_kit.delegates.RowDelegate$Model) from 0x0071: MOVE (r24v0 com.revolut.core.ui_kit.delegates.RowDelegate$Model) = (r2v0 com.revolut.core.ui_kit.delegates.RowDelegate$Model)
          (r2v0 com.revolut.core.ui_kit.delegates.RowDelegate$Model) from 0x005c: MOVE (r24v3 com.revolut.core.ui_kit.delegates.RowDelegate$Model) = (r2v0 com.revolut.core.ui_kit.delegates.RowDelegate$Model)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.revolut.core.ui_kit.delegates.RowDelegate.Model b(com.revolut.feature.transaction.recogniser.api.domain.models.RecogniserTransaction r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dff.b.b(com.revolut.feature.transaction.recogniser.api.domain.models.RecogniserTransaction, boolean):com.revolut.core.ui_kit.delegates.RowDelegate$Model");
    }
}
