package ina;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.legacy.PickerScreen;
import com.revolut.feature.picker.legacy.PickerScreenContract$InputData;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import com.revolut.feature.statements.api.navigation.DocumentsHubDestination$Path;
import com.revolut.feature.statements.api.navigation.DocumentsHubInitialConfiguration;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k extends yji.n {
    public abstract void Z2(RowDelegate.Model model);

    public final void b3(efm.r rVar, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        yji.n.l2(this, byd.g.a(byd.g.b(rd0.e.b(o70.a.f(rVar)), q2(), dialogModelConfigurationFactory)), null, new hsd.c((Object) this, (Object) coreNetworkConfiguration, false, (Continuation) null, 21), 3);
    }

    public abstract Flow c3(DocumentsPage documentsPage);

    public final void d3(List pocketBalances, Function1 onResult) {
        Intrinsics.checkNotNullParameter(pocketBalances, "pocketBalances");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        M2(new PickerScreen(new PickerScreenContract$InputData(pocketBalances, new TextLocalisedClause(R$string.statement_switcher_select_title, null, null, 14), null, y7a.s.CROSS, false, null, "StatementsCurrencyPickerInteractor", null, null, null, null, false, null, null, null, 134212408)), ModalDestination.Style.POPUP.f98311a, new ijg.c(this, onResult, 16));
    }

    public final void e3(String str) {
        Intrinsics.checkNotNullParameter("account-statements", "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubType$-type$0");
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubProduct$-product$0");
        A2(new DocumentsHubDestination$Path("account-statements", str, DocumentsHubInitialConfiguration.Default.f88256a));
    }

    public final void f3(AccountStatementProduct accountStatementProduct, Collection pockets) {
        Intrinsics.checkNotNullParameter(accountStatementProduct, "accountStatementProduct");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Collection collection = pockets;
        ArrayList arrayList = new ArrayList(zhm.w.t(collection, 10));
        Iterator it8 = collection.iterator();
        while (it8.hasNext()) {
            arrayList.add(z92.f.l((io3.d) it8.next()));
        }
        A2(new AccountsStatementFeatureConfig.AccountsStatementDestination(null, accountStatementProduct, zhm.d0.i1(arrayList), false));
    }

    public final Object g3(String str, boolean z, gim.i iVar) {
        Object objC2 = C2(new f9i.c(new f9i.e(str, z)), iVar);
        return objC2 == fim.a.COROUTINE_SUSPENDED ? objC2 : Unit.f186387a;
    }

    public abstract Object h3(DocumentsPage documentsPage, ge7.f fVar);
}
