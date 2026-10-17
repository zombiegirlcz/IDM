package ard;

import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProviderKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.models.config.DocumentViewerScreenConfig;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.ConsentsV1PluginFactory$ConsentsV1LaunchInstructions;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureConfig;
import com.revolut.feature.wealth.api.declaration.AddMoneyFeatureDescriptor;
import com.revolut.feature.wealth.api.declaration.WithdrawFeatureDescriptor;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingSelectorInputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceControllerContract$InputData;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashHoldingsSelectorFlowFactory;
import com.revolut.kompot.navigable.ModalTransitionAnimation;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import grl.r2;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.joda.time.Interval;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8689c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f8687a = i;
        this.f8688b = obj2;
        this.f8689c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws IOException {
        aii.e addMoneyFeatureDescriptor;
        switch (this.f8687a) {
            case 0:
                l5i.q analyticsTransactionsInteractor = (l5i.q) this.f8688b;
                s0 transactionsSearchEngine = (s0) this.f8689c;
                CategorisationFilter baseCategorisationFilter = (CategorisationFilter) this.d;
                ZonedDateTime zonedDateTime = (ZonedDateTime) this.e;
                y params = (y) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                e0.Companion.getClass();
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
                Intrinsics.checkNotNullParameter(transactionsSearchEngine, "transactionsSearchEngine");
                Intrinsics.checkNotNullParameter(baseCategorisationFilter, "baseCategorisationFilter");
                Intrinsics.checkNotNullParameter(params, "params");
                Intrinsics.checkNotNullParameter(baseCategorisationFilter, "baseCategorisationFilter");
                CategorisationFilter filter = CategorisationFilter.a(baseCategorisationFilter, null, new Interval(jli.b.h(params.f8684a), jli.b.h(params.f8685b)), null, params.f ? baseCategorisationFilter.f : null, null, 987);
                analyticsTransactionsInteractor.getClass();
                Intrinsics.checkNotNullParameter(filter, "filter");
                return rd0.e.c(new c0(rd0.e.b(((le3.s) analyticsTransactionsInteractor.f192297b).a(filter, zhm.f0.f322471a, Priority.STANDARD.f60263b)), params, zonedDateTime, transactionsSearchEngine, 0), kotlin.coroutines.g.f186406a);
            case 1:
                k4a.x xVar = (k4a.x) this.f8688b;
                k4a.k kVar = (k4a.k) this.f8689c;
                List list = (List) this.d;
                List list2 = (List) this.e;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return new k4a.m(xVar.a(), i2b.a.o(i2b.a.q(n4a.f.a(kVar.d), xVar.d.b(kVar.f180874c, kVar.f, kVar.e)), list), list2);
            case 2:
                it3.d dVar = (it3.d) this.f8688b;
                r2 r2Var = (r2) this.f8689c;
                wi0.b bVar = (wi0.b) this.d;
                String str = (String) this.e;
                DocumentViewerScreenConfig screenConfig = (DocumentViewerScreenConfig) obj2;
                su3.a document = (su3.a) obj3;
                Intrinsics.checkNotNullParameter(screenConfig, "screenConfig");
                Intrinsics.checkNotNullParameter(document, "document");
                PluginPayload.Companion companion = PluginPayload.INSTANCE;
                ConsentsV1PluginFactory$ConsentsV1LaunchInstructions consentsV1PluginFactory$ConsentsV1LaunchInstructions = new ConsentsV1PluginFactory$ConsentsV1LaunchInstructions(document, screenConfig);
                companion.getClass();
                return PluginPayload.Companion.a(dVar, r2Var, bVar, str, consentsV1PluginFactory$ConsentsV1LaunchInstructions);
            case 3:
                mmm.k kVar2 = (mmm.k) this.f8688b;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f8689c;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.d;
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) this.e;
                int iIntValue = ((Integer) obj2).intValue();
                long jLongValue = ((Long) obj3).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    byte b4 = kVar2.readByte();
                    boolean z = (b4 & 1) == 1;
                    boolean z3 = (b4 & 2) == 2;
                    boolean z4 = (b4 & 4) == 4;
                    long j2 = z ? 5L : 1L;
                    if (z3) {
                        j2 += 4;
                    }
                    if (z4) {
                        j2 += 4;
                    }
                    if (jLongValue < j2) {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                    if (z) {
                        ref$ObjectRef.f186409a = Integer.valueOf(kVar2.t9());
                    }
                    if (z3) {
                        ref$ObjectRef2.f186409a = Integer.valueOf(kVar2.t9());
                    }
                    if (z4) {
                        ref$ObjectRef3.f186409a = Integer.valueOf(kVar2.t9());
                    }
                }
                return Unit.f186387a;
            case 4:
                Ref$ObjectRef ref$ObjectRef4 = (Ref$ObjectRef) this.f8688b;
                mmm.l0 l0Var = (mmm.l0) this.f8689c;
                Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) this.d;
                Ref$ObjectRef ref$ObjectRef6 = (Ref$ObjectRef) this.e;
                int iIntValue2 = ((Integer) obj2).intValue();
                long jLongValue2 = ((Long) obj3).longValue();
                if (iIntValue2 == 1) {
                    if (ref$ObjectRef4.f186409a != null) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                    if (jLongValue2 != 24) {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                    }
                    ref$ObjectRef4.f186409a = Long.valueOf(l0Var.g());
                    ref$ObjectRef5.f186409a = Long.valueOf(l0Var.g());
                    ref$ObjectRef6.f186409a = Long.valueOf(l0Var.g());
                }
                return Unit.f186387a;
            case 5:
                return BasicTextContextMenuProviderKt.ProvideBasicTextContextMenu$lambda$4((Modifier) this.f8688b, (MutableState) this.f8689c, (Function2) this.d, (BasicTextContextMenuProvider) this.e, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                com.revolut.feature.wealth.ui.impl.cash_balance.c cVar = (com.revolut.feature.wealth.ui.impl.cash_balance.c) this.f8688b;
                CashHoldingSelectorInputData cashHoldingSelectorInputData = (CashHoldingSelectorInputData) this.f8689c;
                CashBalanceControllerContract$InputData cashBalanceControllerContract$InputData = (CashBalanceControllerContract$InputData) this.d;
                zjh.o oVar = (zjh.o) this.e;
                yki.l FlowCoordinator = (yki.l) obj2;
                CashHoldingsSelectorFlowFactory.Step step = (CashHoldingsSelectorFlowFactory.Step) obj3;
                Intrinsics.checkNotNullParameter(FlowCoordinator, "$this$FlowCoordinator");
                Intrinsics.checkNotNullParameter(step, "step");
                if (Intrinsics.f(step, CashHoldingsSelectorFlowFactory.Step.Initial.f95964a)) {
                    ViewController viewControllerE1 = cVar.e1(new qih.e(cashHoldingSelectorInputData));
                    zf5.n block = new zf5.n(cVar, FlowCoordinator, 11);
                    Intrinsics.checkNotNullParameter(block, "block");
                    viewControllerE1.H = block;
                    return viewControllerE1;
                }
                if (!(step instanceof CashHoldingsSelectorFlowFactory.Step.TransferDestination)) {
                    throw new NoWhenBranchMatchedException();
                }
                kel.b bVar2 = ((CashHoldingsSelectorFlowFactory.Step.TransferDestination) step).f95965a.f95935a;
                String str2 = cashBalanceControllerContract$InputData.f95952b;
                kel.a aVar = bVar2.f183148a;
                TransferSubjectId.CashHolding cashHolding = new TransferSubjectId.CashHolding(str2, aVar.f183145a, aVar.e, bVar2.f183150c);
                WealthAccountType wealthAccountTypeA = ydh.a.a(cashBalanceControllerContract$InputData.f95951a);
                int i = zjh.c0.f322831a[oVar.ordinal()];
                if (i == 1) {
                    addMoneyFeatureDescriptor = new AddMoneyFeatureDescriptor(new AddMoneyFeatureConfig.CompositeAddMoney.InputData.WithTransferSubjectIdAndWealthAccountType(7, 0L, cashHolding, wealthAccountTypeA, (j0h.a) null), ModalTransitionAnimation.Style.POPUP.f98391a);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xi0.a aVar2 = xi0.b.Companion;
                    String str3 = bVar2.f183148a.e;
                    aVar2.getClass();
                    addMoneyFeatureDescriptor = new WithdrawFeatureDescriptor(cashHolding, wealthAccountTypeA, xi0.a.a(str3));
                }
                return cVar.e1(addMoneyFeatureDescriptor);
        }
    }
}
