package vmc;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.robo.api.ui.providers.models.RoboTransaction;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yoc.m;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements glc.b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f290559a;

    public e(m roboTransactionResourcesProvider) {
        Intrinsics.checkNotNullParameter(roboTransactionResourcesProvider, "roboTransactionResourcesProvider");
        this.f290559a = roboTransactionResourcesProvider;
    }

    public static CellDetailsDelegate.Model a(RoboTransaction roboTransaction) {
        int i;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_transactions_common_status, null, null, 14);
        int i2 = d.f290558b[roboTransaction.getF85078a().ordinal()];
        if (i2 == 1) {
            i = R$string.wealth_trade_pending_title;
        } else if (i2 == 2) {
            i = R$string.wealth_state_completed;
        } else if (i2 == 3) {
            i = R$string.wealth_state_failed;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_trading_common_cancelled;
        }
        return new CellDetailsDelegate.Model("transaction-status-cell", textLocalisedClause, new TextLocalisedClause(i, null, null, 14), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 glc.j, still in use, count: 4, list:
          (r2v0 glc.j) from 0x019c: MOVE (r28v0 glc.j) = (r2v0 glc.j)
          (r2v0 glc.j) from 0x0180: MOVE (r28v1 glc.j) = (r2v0 glc.j)
          (r2v0 glc.j) from 0x0149: MOVE (r28v4 glc.j) = (r2v0 glc.j)
          (r2v0 glc.j) from 0x0087: MOVE (r28v7 glc.j) = (r2v0 glc.j)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 1170
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vmc.e.invoke(java.lang.Object):java.lang.Object");
    }
}
