package qh6;

import aii.r;
import aii.u;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.external_accounts.impl.navigation.CrossBorderLinkAccountDestination;
import com.revolut.feature.external_accounts.impl.navigation.LinkAccountDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.push_to_card.api.data.CardOwner;
import com.revolut.feature.push_to_card.api.navigation.PushToCardTransferInputData;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import dn6.g;
import gm6.e;
import gm6.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jli.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f246485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f246486c;

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f246484a = i;
        this.f246485b = obj2;
        this.f246486c = obj3;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperModel) {
        CompositeCommand compositeCommandE;
        int i = this.f246484a;
        Object obj2 = this.f246486c;
        Object obj3 = this.f246485b;
        switch (i) {
            case 0:
                u uVar = (u) obj3;
                d dVar = (d) obj2;
                do6.b bVar = dVar.f246489b;
                f result = (f) rVar;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(wrapperModel, "wrapperModel");
                if (result instanceof gm6.d) {
                    NaviCommand naviCommand = ((CrossBorderLinkAccountDestination) uVar).f72481a.e;
                    if (naviCommand == null) {
                        bVar.a();
                    } else {
                        bVar.c(naviCommand);
                    }
                    knm.b.j(wrapperModel.l1(), new BridgeDestination(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, ((f80.b) dVar.f246488a).f(((gm6.d) result).f144772a), 14), null, null, null, 0, null, null, null, null, false, 1022)));
                    return;
                }
                if (result instanceof e) {
                    NaviCommand naviCommand2 = ((CrossBorderLinkAccountDestination) uVar).f72481a.e;
                    if (naviCommand2 == null) {
                        bVar.a();
                    } else {
                        bVar.c(naviCommand2);
                    }
                    knm.b.j(wrapperModel.l1(), new BridgeDestination(new FeatureCommand(new ExternalAccountsFeatureConfig.LinkSuccess(((e) result).f144773a, true))));
                    return;
                }
                if (!(result instanceof gm6.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list = ((CrossBorderLinkAccountDestination) uVar).f72481a.f72861c.f;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.Result result2 = (ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.Result) it8.next();
                            int i2 = result2.f72296a;
                            gm6.c cVar = (gm6.c) result;
                            int i3 = cVar.f144771b;
                            if (i2 == cVar.f144770a && result2.f72297b == i3) {
                                knm.b.j(wrapperModel.l1(), new BridgeDestination(new FinishCommand(Integer.valueOf(i3), null, null, 6)));
                            }
                        }
                    }
                }
                Unit unit = Unit.f186387a;
                return;
            case 1:
                u uVar2 = (u) obj3;
                d dVar2 = (d) obj2;
                do6.b bVar2 = dVar2.f246489b;
                g result3 = (g) rVar;
                Intrinsics.checkNotNullParameter(result3, "result");
                Intrinsics.checkNotNullParameter(wrapperModel, "wrapperModel");
                if (result3 instanceof dn6.e) {
                    NaviCommand naviCommand3 = ((LinkAccountDestination) uVar2).f72483a.f72993g;
                    if (naviCommand3 == null) {
                        bVar2.a();
                    } else {
                        bVar2.c(naviCommand3);
                    }
                    knm.b.j(wrapperModel.l1(), new BridgeDestination(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, ((f80.b) dVar2.f246488a).f(((dn6.e) result3).f116221a), 14), null, null, null, 0, null, null, null, null, false, 1022)));
                    return;
                }
                if (result3 instanceof dn6.f) {
                    NaviCommand naviCommand4 = ((LinkAccountDestination) uVar2).f72483a.f72993g;
                    if (naviCommand4 == null) {
                        bVar2.a();
                    } else {
                        bVar2.c(naviCommand4);
                    }
                    knm.b.j(wrapperModel.l1(), new BridgeDestination(new FeatureCommand(new ExternalAccountsFeatureConfig.LinkSuccess(((dn6.f) result3).f116222a, true))));
                    return;
                }
                if (!(result3 instanceof dn6.d)) {
                    if (!(result3 instanceof dn6.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = h.f175850a;
                    return;
                }
                List<ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.Result> list2 = ((LinkAccountDestination) uVar2).f72483a.e.f;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return;
                }
                for (ExternalAccountsFeatureConfig.Configuration.ExternalInstitutionsConfiguration.Result result4 : list2) {
                    int i6 = result4.f72296a;
                    dn6.d dVar3 = (dn6.d) result3;
                    int i21 = dVar3.f116220b;
                    if (i6 == dVar3.f116219a && result4.f72297b == i21) {
                        knm.b.j(wrapperModel.l1(), new BridgeDestination(new FinishCommand(Integer.valueOf(i21), null, null, 6)));
                        return;
                    }
                }
                return;
            default:
                nra.a aVar = (nra.a) obj3;
                PushToCardTransferInputData pushToCardTransferInputData = (PushToCardTransferInputData) obj2;
                cqa.e output = (cqa.e) rVar;
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(wrapperModel, "wrapperFlowModel");
                if (output instanceof cqa.b) {
                    wrapperModel.J2();
                    return;
                }
                if (!(output instanceof cqa.c)) {
                    if (!(output instanceof cqa.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    r6.b.D("SuccessWithAnimation is not supported by push-to-card DEFAULT flow");
                    return;
                }
                msa.d dVar4 = aVar.f218597a;
                CardOwner recipient = pushToCardTransferInputData.getF81536a();
                cqa.c output2 = (cqa.c) output;
                String str = output2.f108062a;
                b3a.a aVar2 = dVar4.f208641a;
                Intrinsics.checkNotNullParameter(recipient, "recipient");
                Intrinsics.checkNotNullParameter(output2, "output");
                ChatTransferRecipient.CardRecipient cardRecipient = new ChatTransferRecipient.CardRecipient(recipient);
                if (recipient.f == wpa.a.LINKED) {
                    k71.c data = new k71.c(str);
                    Intrinsics.checkNotNullParameter(data, "data");
                    compositeCommandE = com.revolut.retail.core.navigation.a.c(gc0.c.f(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6))), new FeatureCommand(new TransactionsFeatureConfig.Details(data, null, null, null, 122)));
                } else {
                    compositeCommandE = ((v3a.b) aVar2).e(qk.d.e(6, str, null, null), cardRecipient);
                }
                knm.b.j(wrapperModel.l1(), new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), compositeCommandE)));
                return;
        }
    }
}
