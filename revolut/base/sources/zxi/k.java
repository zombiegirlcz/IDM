package zxi;

import cli.n;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.filters.AirportLoungesPassActivityFiltersScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements n {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesPassActivityFiltersScreenContract$InputData f326345a;

    public k(AirportLoungesPassActivityFiltersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f326345a = inputData;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v0 com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model, still in use, count: 2, list:
          (r6v0 com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model) from 0x0071: MOVE (r16v1 com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model) = (r6v0 com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model)
          (r6v0 com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model) from 0x004e: MOVE (r16v5 com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model) = (r6v0 com.revolut.core.ui_kit.delegates.ListSubheaderDelegate$Model)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r24) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zxi.k.c(cli.j):cli.o");
    }
}
