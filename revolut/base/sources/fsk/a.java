package fsk;

import com.revolut.retail.core.navigation.FragmentDestination;
import com.revolut.retail.core.navigation.FragmentNavigateCommand;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.StockFinancialsStatementContract$Configuration;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.StockFinancialsStatementFragment;
import kotlin.jvm.internal.Intrinsics;
import uqk.l;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f137717a = new a();

    private a() {
    }

    public static FragmentNavigateCommand a(String ref2, l statementType, uqk.e selectedPeriod, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(statementType, "statementType");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        return new FragmentNavigateCommand(new FragmentDestination(StockFinancialsStatementFragment.class), new StockFinancialsStatementContract$Configuration(ref2, statementType, selectedPeriod, num, num2), false, 2044);
    }
}
