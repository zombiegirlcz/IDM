package hwc;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f156128a;

    public g(c transactionLimitsItemMapper) {
        Intrinsics.checkNotNullParameter(transactionLimitsItemMapper, "transactionLimitsItemMapper");
        this.f156128a = transactionLimitsItemMapper;
    }

    public final void a(aim.e eVar, List list, TransactionsLimitsScreenContract$LimitFlowType.SepaExtended sepaExtended, ListSubheaderDelegate.Model model) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        eVar.addAll(yp0.b.g(b(list, sepaExtended), model, null, 0, 0, 126));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList b(java.util.List r37, com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType r38) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hwc.g.b(java.util.List, com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType):java.util.ArrayList");
    }
}
