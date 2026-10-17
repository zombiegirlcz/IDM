package nij;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f216266a;

    public h(gej.a bytesFormatter) {
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        this.f216266a = bytesFormatter;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v7 com.revolut.core.ui_kit.delegates.RowDelegate$Model, still in use, count: 2, list:
          (r0v7 com.revolut.core.ui_kit.delegates.RowDelegate$Model) from 0x00cc: MOVE (r17v0 com.revolut.core.ui_kit.delegates.RowDelegate$Model) = (r0v7 com.revolut.core.ui_kit.delegates.RowDelegate$Model)
          (r0v7 com.revolut.core.ui_kit.delegates.RowDelegate$Model) from 0x00ba: MOVE (r17v4 com.revolut.core.ui_kit.delegates.RowDelegate$Model) = (r0v7 com.revolut.core.ui_kit.delegates.RowDelegate$Model)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.revolut.core.ui_kit.delegates.SelectableDelegate.Model a(java.lang.String r28, com.revolut.retail.feature.esim.api.model.EsimDataPlan r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nij.h.a(java.lang.String, com.revolut.retail.feature.esim.api.model.EsimDataPlan, boolean, boolean):com.revolut.core.ui_kit.delegates.SelectableDelegate$Model");
    }
}
