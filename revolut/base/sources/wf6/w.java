package wf6;

import aw0.x8;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.SecondaryDescription;
import com.revolut.feature.external_accounts.api.model.brazil.payment_confirmation.BrazilPaymentConsentInput;
import com.revolut.feature.external_accounts.api.navigation.OpenBankingBrazilDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.payments.bills_chooser.api.common.BillType;
import com.revolut.feature.payments.bills_chooser.api.model.ItemizedBillData;
import com.revolut.feature.payments.bills_chooser.api.navigation.BillSplitsResult;
import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import com.revolut.feature.retail.legacy.login.impl.signsms.SignSmsStepFragment;
import com.revolut.feature.security_hub.api.SecurityHubStartScreen;
import com.revolut.feature.security_hub.api.navigation.SecurityHubDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import ju0.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import zc0.y2;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f297015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f297016c;

    public /* synthetic */ w(Object obj2, Object obj3, int i) {
        this.f297014a = i;
        this.f297015b = obj2;
        this.f297016c = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List listB;
        String str;
        String str2;
        Object aVar;
        switch (this.f297014a) {
            case 0:
                ((x) this.f297015b).f297017a.c(u0.f(new OpenBankingBrazilDestination(new BrazilPaymentConsentInput.Handoff(((jf0.c) this.f297016c).e(3)))));
                return Boolean.TRUE;
            case 1:
                return (zm3.m) ((Map) this.f297015b).get((String) this.f297016c);
            case 2:
                LoginFragment loginFragment = (LoginFragment) this.f297015b;
                mm0.c cVar = (mm0.c) this.f297016c;
                zm0.b bVar = loginFragment.f82684o0;
                if (bVar != null) {
                    return ((cn0.g) bVar).a(cVar);
                }
                Intrinsics.r("sessionController");
                throw null;
            case 3:
                Map map = (Map) this.f297015b;
                oq9.o owner = (oq9.o) this.f297016c;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    BillType bill = (BillType) entry.getKey();
                    BillSplitsResult billSplitsResult = (BillSplitsResult) entry.getValue();
                    Intrinsics.checkNotNullParameter(bill, "bill");
                    Intrinsics.checkNotNullParameter(owner, "owner");
                    Intrinsics.checkNotNullParameter(billSplitsResult, "billSplitsResult");
                    ArrayList arrayList2 = null;
                    if (billSplitsResult instanceof BillSplitsResult.MoneySplits) {
                        listB = sr9.c.a(owner, ((BillSplitsResult.MoneySplits) billSplitsResult).f79185a);
                        str2 = null;
                        str = null;
                    } else {
                        if (!(billSplitsResult instanceof BillSplitsResult.Itemized)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ItemizedBillData itemizedBillData = ((BillSplitsResult.Itemized) billSplitsResult).f79184a;
                        listB = sr9.b.b(owner, itemizedBillData.f79179a);
                        ArrayList arrayListA = sr9.b.a(itemizedBillData.f79179a);
                        ItemizedBillData.ScanData scanData = itemizedBillData.f79180b;
                        String str3 = scanData != null ? scanData.f79181a : null;
                        str = scanData != null ? scanData.f79182b : null;
                        arrayList2 = arrayListA;
                        str2 = str3;
                    }
                    if (bill instanceof BillType.TransactionBill) {
                        aVar = new qq9.b(((BillType.TransactionBill) bill).f79176a.f272581b, owner, listB, arrayList2, str2, str);
                    } else {
                        if (!(bill instanceof BillType.CustomBill)) {
                            if (bill instanceof BillType.RecurringPaymentBill) {
                                throw new IllegalArgumentException(p.a.p("RecurringPaymentBill(id=", ((BillType.RecurringPaymentBill) bill).f79175a.f249314a.f160150a, ") is not supported!"));
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        BillType.CustomBill customBill = (BillType.CustomBill) bill;
                        List list = listB;
                        oq9.o oVar = owner;
                        aVar = new qq9.a(customBill.f79173a, customBill.f79174b, oVar, list, arrayList2, str2, str);
                        owner = oVar;
                    }
                    arrayList.add(aVar);
                }
                return arrayList;
            case 4:
                ((yke.a) this.f297015b).f314607a.c((CompositeCommand) this.f297016c);
                return Unit.f186387a;
            case 5:
                ((ym.d) this.f297015b).D((ym.b) this.f297016c);
                return Unit.f186387a;
            case 6:
                yw0.f fVar = (yw0.f) this.f297015b;
                x8 x8Var = (x8) this.f297016c;
                ju0.j jVar = fVar.v;
                if (jVar.b()) {
                    return efm.r.just(x8Var);
                }
                efm.r rVarHide = jVar.e.hide();
                Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
                return rVarHide.ofType(a.C1014a.class).take(1L).map(new yua.h(new bu0.b(x8Var, 1), 13));
            case 7:
                SignSmsStepFragment signSmsStepFragment = (SignSmsStepFragment) this.f297015b;
                String str4 = (String) this.f297016c;
                ujg.a aVar2 = signSmsStepFragment.i0;
                if (aVar2 != null) {
                    ((eli.l) aVar2).a(new zm0.d(str4, zm0.e.EXTERNAL, 12));
                    return pfm.m.f235744a;
                }
                Intrinsics.r("twoFaRepository");
                throw null;
            case 8:
                return ((y2) this.f297015b).k.a((SecondaryDescription) this.f297016c);
            case 9:
                return ((y2) this.f297015b).k.c((FormScreen) ((BackendScreen) this.f297016c));
            case 10:
                ((zc3.c) this.f297015b).f321233a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, u0.e(zc3.c.b((jf0.c) this.f297016c)), 2))));
                return Unit.f186387a;
            default:
                ztc.f fVar2 = (ztc.f) this.f297015b;
                jf0.c cVar2 = (jf0.c) this.f297016c;
                SecurityHubStartScreen securityHubStartScreenC = ztc.f.c(cVar2);
                sri.m mVar = fVar2.f325095a;
                SecurityHubDestination securityHubDestinationD = ztc.f.d(cVar2, securityHubStartScreenC);
                mVar.c(Intrinsics.f(cVar2.d.get("presentation_type"), "inline") ? new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) securityHubDestinationD, false, (Integer) null, 0, 61)) : jbb.a.a(ibb.c.f160140a, null, dy0.o.RIGHT, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) securityHubDestinationD, false, (Integer) null, 0, 61)), 2));
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ w(Map map, ryc.a aVar, oq9.o oVar) {
        this.f297014a = 3;
        this.f297015b = map;
        this.f297016c = oVar;
    }
}
