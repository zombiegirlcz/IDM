package csk;

import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsActivity;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.StockFinancialsStatementsContract$Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ c f108512a = new c();

    private c() {
    }

    public static ActivityNavigateCommand a(String ref2, uqk.l statementType) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        return new ActivityNavigateCommand(new ExplicitActivityDestination(StockFinancialsStatementsActivity.class), new StockFinancialsStatementsContract$Configuration(j6.a.q("TRADING_STOCK_BUY_FLOW", ref2), ref2, statementType), null, null, 0, null, null, null, null, false, 1020);
    }
}
