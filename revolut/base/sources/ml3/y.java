package ml3;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.u;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.model.search.boleto.BillSearchBoletoResult;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.card.impl.ui.additional_cards.flow.AdditionalCardsFlowContract$Step;
import com.revolut.feature.crypto.tfr.validation.api.model.MeshEvent;
import com.revolut.feature.crypto.withdraw.api.models.CryptoWithdrawFeesBreakdown;
import com.revolut.feature.pay_with_photo.impl.ui.preview.PayWithPhotoPreviewController;
import com.revolut.feature.retail.savings.impl.ui.product_migration.flow.ProductMigrationFlowContract$Step;
import com.revolut.feature.spending_analytics.api.AnalyticsFeatureApi$Toggles;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.IncomeSorterDestinationCrossSell$PersonalJisaAccount;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.AddDeclarationFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.AddDeclarationFlowContract$Step;
import com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow.TaxResidencyDeclarationFlowContract$UseCase;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.revolut.sso.impl.ui.combined_authentication.flow.CombinedAuthenticationFlowContract$State;
import ft3.a1;
import gkl.e0;
import grl.r2;
import ip0.cs;
import ip0.gu;
import ip0.nf0;
import ip0.of0;
import ip0.pb0;
import ip0.sr;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mlk.i0;
import mll.c0;
import nii.k1;
import nii.y0;
import ood.u0;
import ood.v0;
import ood.w0;
import ood.x0;
import qll.b0;
import qlm.n1;
import qlm.v1;
import retrofit2.HttpException;
import skm.p0;
import vkm.j2;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f206628b;

    public /* synthetic */ y(Object obj2, int i) {
        this.f206627a = i;
        this.f206628b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, olm.a] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v4, types: [zhm.f0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        SerialDescriptor descriptor;
        Object u0Var;
        Object objB;
        boolean z;
        Object next;
        IncomeSorterDestinationCrossSell$PersonalJisaAccount available;
        zel.f fVar;
        int i = this.f206627a;
        int i2 = 2;
        boolean z3 = true;
        boolean z4 = true;
        ?? annotations = 0;
        Object obj3 = null;
        Object obj4 = null;
        annotations = 0;
        Object obj5 = this.f206628b;
        switch (i) {
            case 0:
                z zVar = (z) obj5;
                zVar.getClass();
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM virtual_contacts");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "point");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "type");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "transactionsCount");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        String text = sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow);
                        String value = sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2);
                        zVar.f206631c.getClass();
                        Intrinsics.checkNotNullParameter(value, "value");
                        arrayList.add(new u(text, v.valueOf(value), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow3), sQLiteStatementPrepare.getLong(columnIndexOrThrow4)));
                        break;
                    }
                    return arrayList;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 1:
                final PayWithPhotoPreviewController payWithPhotoPreviewController = (PayWithPhotoPreviewController) obj5;
                final Context context = (Context) obj2;
                KProperty[] kPropertyArr = PayWithPhotoPreviewController.R;
                Intrinsics.checkNotNullParameter(context, "context");
                return new LinearLayoutManager(context) { // from class: com.revolut.feature.pay_with_photo.impl.ui.preview.PayWithPhotoPreviewController$modelBinding$2$1$1
                    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                    public final boolean canScrollVertically() {
                        return payWithPhotoPreviewController.P;
                    }
                };
            case 2:
                mli.e eVar = (mli.e) obj5;
                mli.b args = (mli.b) obj2;
                Intrinsics.checkNotNullParameter(args, "args");
                if (args.f206961a) {
                    return pd.b.n(p0.f264003c, new mci.e(eVar, annotations, 8));
                }
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                if (((mlk.v) obj5).f207030g) {
                    return mlk.f.b();
                }
                gu guVar = new gu("ID_OFFERS_SUBHEADER_ITEM", 0, 0, 30);
                of0 of0Var = of0.ACCENT;
                nf0 nf0Var = new nf0("loading_benefit_item_1", of0Var);
                yp0.b.l(nf0Var, 0, 0, 0, 0, null, false, 63);
                nf0 nf0Var2 = new nf0("loading_benefit_item_2", of0Var);
                yp0.b.l(nf0Var2, 0, 0, 0, 0, null, false, 63);
                List listP = i2b.a.p(zhm.v.k(guVar, slk.b.a(zhm.v.k(nf0Var, nf0Var2))), new gu("BENEFITS_SUB_HEADER_ID", 0, 0, 30));
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(intRangeO, 10));
                vim.f it8 = intRangeO.iterator();
                while (it8.f289625c) {
                    arrayList2.add(new pb0(a0.d.n("LOADING_BENEFIT_CELL_ID_", it8.nextInt())));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return i2b.a.o(listP, arrayList2);
            case 4:
                CombinedAuthenticationFlowContract$State update = (CombinedAuthenticationFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return CombinedAuthenticationFlowContract$State.a(update, null, null, null, ((e0) obj5).f144443a, 7);
            case 5:
                return CombinedAuthenticationFlowContract$State.a((CombinedAuthenticationFlowContract$State) obj2, null, ((qll.z) ((b0) obj5)).f247608a, null, null, 13);
            case 6:
                ?? buildSerialDescriptor = (olm.a) obj2;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
                KSerializer kSerializer = ((mlm.a) obj5).f207087b;
                if (kSerializer != null && (descriptor = kSerializer.getDescriptor()) != null) {
                    annotations = descriptor.getAnnotations();
                }
                if (annotations == 0) {
                    annotations = f0.f322471a;
                }
                buildSerialDescriptor.c(annotations);
                return Unit.f186387a;
            case 7:
                mlm.d dVar = (mlm.d) obj5;
                olm.a buildSerialDescriptor2 = (olm.a) obj2;
                Intrinsics.checkNotNullParameter(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                nlm.a.d(t0.f186434a);
                n1 n1Var = v1.f247719b;
                f0 f0Var = f0.f322471a;
                buildSerialDescriptor2.a("type", n1Var, f0Var, false);
                buildSerialDescriptor2.a("value", com.bumptech.glide.c.e("kotlinx.serialization.Polymorphic<" + dVar.f207089a.m() + '>', olm.i.f226485b, new SerialDescriptor[0], new okk.d(13)), f0Var, false);
                buildSerialDescriptor2.c(dVar.f207090b);
                return Unit.f186387a;
            case 8:
                lk0.g it9 = (lk0.g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                pfm.h hVar = new pfm.h(new la8.j((mm1.c) obj5, it9, 16), i2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 9:
                mm1.d dVar2 = (mm1.d) obj5;
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                List list = (List) data.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                return new lk0.e(list, dVar2, data.getLoading(), null, data.getError(), 8);
            case 10:
                mm5.o oVar = (mm5.o) obj5;
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (error instanceof HttpException) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "ActionRequiredScreenModel", null, error, h0Var);
                    oVar.X1(new y0(null, new nii.z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 11:
                ArrayList meshEvents = d0.F0((MeshEvent) obj5, ((mm5.e) obj2).f207146a);
                Intrinsics.checkNotNullParameter(meshEvents, "meshEvents");
                return new mm5.e(meshEvents);
            case 12:
                return mn1.h.a((mn1.h) obj2, (BillSearchBoletoResult) obj5, null, null, null, null, null, null, 126);
            case 13:
                mn1.b0 b0Var = (mn1.b0) obj5;
                h1j.b bVar = (h1j.b) obj2;
                if (bVar instanceof h1j.d) {
                    b0Var.l2(new c0(b0Var, (h1j.d) bVar, (Continuation) annotations, i2), new yi5.b(26));
                }
                return Unit.f186387a;
            case 14:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var2);
                oki.h.D2(((com.revolut.feature.retail.savings.impl.ui.add_money.b) obj5).f83359t);
                return Boolean.TRUE;
            case 15:
                List allTrips = (List) obj2;
                Intrinsics.checkNotNullParameter(allTrips, "it");
                x0 x0Var = ((mod.l) obj5).f207623b;
                x0Var.getClass();
                Intrinsics.checkNotNullParameter(allTrips, "allTrips");
                j2 j2Var = x0Var.f227093a;
                w0 w0Var = (w0) j2Var.getValue();
                if (w0Var instanceof ood.t0) {
                    objB = ood.t0.b((ood.t0) w0Var, allTrips, null, 2);
                } else {
                    if (w0Var instanceof v0) {
                        wi0.b code = ((v0) w0Var).f227088a;
                        Intrinsics.checkNotNullParameter(code, "code");
                        Intrinsics.checkNotNullParameter(allTrips, "allTrips");
                        u0Var = new v0(allTrips, code);
                    } else {
                        if (!(w0Var instanceof u0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        u0 u0Var2 = (u0) w0Var;
                        String tripId = u0Var2.f227084a;
                        wi0.b code2 = u0Var2.f227085b;
                        Intrinsics.checkNotNullParameter(tripId, "tripId");
                        Intrinsics.checkNotNullParameter(code2, "code");
                        Intrinsics.checkNotNullParameter(allTrips, "allTrips");
                        u0Var = new u0(tripId, allTrips, code2);
                    }
                    objB = u0Var;
                }
                j2Var.g(null, objB);
                return Unit.f186387a;
            case 16:
                com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a aVar = (com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) obj5;
                god.b result = (god.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                aVar.l2(new mhd.p0(aVar, result, annotations, 25), new yi5.b(26));
                return Unit.f186387a;
            case 17:
                com.revolut.feature.credit.card.impl.ui.additional_cards.flow.a aVar2 = (com.revolut.feature.credit.card.impl.ui.additional_cards.flow.a) obj5;
                pp4.m it10 = (pp4.m) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                if (Intrinsics.f(it10, pp4.k.f238262a)) {
                    aVar2.B2();
                } else if (it10 instanceof pp4.l) {
                    pp4.l lVar = (pp4.l) it10;
                    oki.h.t2(aVar2, aVar2.f69024p, new AdditionalCardsFlowContract$Step.CardholderDetails(lVar.f238263a, lVar.f238264b), true, null, false, 12);
                } else {
                    if (!Intrinsics.f(it10, pp4.j.f238261a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C1(new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(new a1(r2.HOME, null, null, null, null, 30), new ft3.r(aVar2.o.f69020a), null, null, null, null, null, null, null, null, 2044))));
                }
                return Unit.f186387a;
            case 18:
                sr inputStyle = (sr) obj5;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                Intrinsics.checkNotNullParameter(inputStyle, "inputStyle");
                ip0.c0 c0Var = new ip0.c0("FEEDBACK_EXTENSION_ACTIONS_LIST_ID", new u.a(0, 3), 0, R$attr.uikit_dp8, 52);
                m70.a.c(t0.f186434a);
                return zhm.v.k(c0Var, mp6.a.f("", new TextLocalisedClause(com.revolut.feature.feedback.impl.R$string.cx_feedback_feedback_bottom_sheet_input_placeholder, null, null, 14), inputStyle, false), new cs("FEEDBACK_EXTENSION_BUTTON_LIST_ID"));
            case 19:
                Throwable it11 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.b(rd0.c.ERROR, null, "request failed", it11, null, 18);
                ((com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a) obj5).X1(com.revolut.feature.insurance_car.impl.ui.screen.onboarding.proof_of_driving_number.driver_number_input.a.I2());
                return Boolean.TRUE;
            case 20:
                mp7.h hVar2 = (mp7.h) obj2;
                Iterable<kl7.r> iterable = ((kl7.v) obj5).f185395b;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList3 = new ArrayList();
                for (kl7.r rVar : iterable) {
                    String str = rVar.f185381c;
                    Pair pair = str != null ? new Pair(rVar.f185379a, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)) : null;
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                return mp7.h.a(hVar2, null, null, r0.t(arrayList3), null, 11);
            case 21:
                com.revolut.feature.retail.savings.impl.ui.product_migration.flow.a aVar3 = (com.revolut.feature.retail.savings.impl.ui.product_migration.flow.a) obj5;
                yki.a aVar4 = aVar3.f83386q;
                kpb.h output = (kpb.h) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof kpb.e) {
                    oki.h.t2(aVar3, aVar3.f83386q, new ProductMigrationFlowContract$Step.Documents(((kpb.e) output).f188215a), true, null, false, 12);
                } else if (output instanceof kpb.f) {
                    oki.h.w2(aVar4, new ProductMigrationFlowContract$Step.EligibilityWorkflow(((kpb.f) output).f188216a), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
                } else {
                    if (!Intrinsics.f(output, kpb.g.f188217a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar4);
                }
                return Unit.f186387a;
            case 22:
                mpd.c cVar = (mpd.c) obj5;
                mpd.a update2 = (mpd.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                mpd.b bVar2 = update2.f207787g;
                if (bVar2 == null) {
                    return update2;
                }
                LocalDate localDate = bVar2.f207788a;
                if (bVar2.f) {
                    return update2;
                }
                int i3 = mpd.o.f207803a[cVar.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    LocalDate localDate2 = bVar2.f207789b;
                    if (localDate2 != null) {
                        localDate = localDate2;
                    }
                }
                mpd.c cVar2 = bVar2.f207790c == cVar ? null : cVar;
                if (localDate == null) {
                    localDate = bVar2.e;
                }
                return mpd.a.a(update2, null, null, null, false, mpd.b.a(bVar2, null, null, cVar2, localDate, null, false, 51), 63);
            case 23:
                com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.a aVar5 = (com.revolut.feature.tax_residency.impl.v2.ui.add_declaration_flow.a) obj5;
                wi0.b selectedCountry = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
                AddDeclarationFlowContract$InputData addDeclarationFlowContract$InputData = aVar5.o;
                yki.a aVar6 = aVar5.f90202q;
                Iterator it12 = addDeclarationFlowContract$InputData.f90194c.iterator();
                while (true) {
                    if (it12.hasNext()) {
                        Object next2 = it12.next();
                        DeclaredTaxResidency declaredTaxResidency = (DeclaredTaxResidency) next2;
                        if (Intrinsics.f(declaredTaxResidency.f90159a, selectedCountry) && Intrinsics.f(declaredTaxResidency.f90160b, Boolean.TRUE)) {
                            obj4 = next2;
                        }
                    }
                }
                DeclaredTaxResidency declaredTaxResidency2 = (DeclaredTaxResidency) obj4;
                CountryRule countryRule = (CountryRule) addDeclarationFlowContract$InputData.d.get(selectedCountry);
                if (countryRule == null) {
                    aVar5.C2(new mpe.d(p.a.p("Unable to declare tax residency for ", selectedCountry.f297794a, ". CountryRule is missing.")));
                    return Unit.f186387a;
                }
                if (declaredTaxResidency2 != null) {
                    boolean z6 = declaredTaxResidency2.f;
                    String str2 = declaredTaxResidency2.f90163h;
                    if (z6 && countryRule.f90154a) {
                        oki.h.t2(aVar5, aVar6, new AddDeclarationFlowContract$Step.TaxResidencyDeclaration(selectedCountry, countryRule, new TaxResidencyDeclarationFlowContract$UseCase.Edit(str2 != null ? str2 : "", declaredTaxResidency2.f90162g)), false, null, false, 14);
                    } else {
                        aVar5.C2(new mpe.c(selectedCountry, str2));
                    }
                } else {
                    oki.h.t2(aVar5, aVar6, new AddDeclarationFlowContract$Step.TaxResidencyDeclaration(selectedCountry, countryRule, new TaxResidencyDeclarationFlowContract$UseCase.Add(hx7.q.o(addDeclarationFlowContract$InputData.f90194c, selectedCountry))), false, null, false, 14);
                }
                return Unit.f186387a;
            case 24:
                mpi.d dVar3 = (mpi.d) obj5;
                nii.n1 result2 = (nii.n1) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof k1) {
                    dVar3.O();
                }
                return Unit.f186387a;
            case 25:
                return mq5.c.a((mq5.c) obj2, new Data((CryptoWithdrawFeesBreakdown) obj5, null, false, 6, null));
            case 26:
                String submissionId = (String) obj2;
                Intrinsics.checkNotNullParameter(submissionId, "submissionId");
                return (bqc.j) ((mqc.k) obj5).f207963c.get(submissionId);
            case 27:
                com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.a aVar7 = (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.providers.a) obj5;
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                TradingAccounts tradingAccounts = (TradingAccounts) pair2.f186385a;
                TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) pair2.f186386b;
                aim.e eVarB = zhm.u.b();
                List list2 = tradingAccounts.f105279b;
                List list3 = tradingAccounts.f105278a;
                List list4 = list2;
                boolean z11 = list4 instanceof Collection;
                TradingAccountType.Gia gia = TradingAccountType.Gia.f105270a;
                if (z11 && list4.isEmpty()) {
                    z = false;
                } else {
                    Iterator it13 = list4.iterator();
                    while (it13.hasNext()) {
                        if (Intrinsics.f(((TradingAccountAvailableToOnboard) it13.next()).d, gia)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                List<TradingAccount> list5 = list3;
                if ((list5 instanceof Collection) && list5.isEmpty()) {
                    z4 = false;
                } else {
                    for (TradingAccount tradingAccount : list5) {
                        if (!Intrinsics.f(tradingAccount.W(), gia) || tradingAccount.getD() != cfl.b.CREATED) {
                        }
                    }
                    z4 = false;
                }
                if (z || z4) {
                    eVarB.add(new mqd.a(tradingLegalEntityInformation.f105106a));
                }
                if (((jte.d) aVar7.f87832c).c(AnalyticsFeatureApi$Toggles.TeenJisaIncomeSorter.f87399c)) {
                    Iterator it14 = tradingAccounts.f105279b.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            next = it14.next();
                            if (com.revolut.shared.feature.wealth.models.trading_accounts.b.h((TradingAccountAvailableToOnboard) next)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = (TradingAccountAvailableToOnboard) next;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : list5) {
                        if (obj6 instanceof TradingAccount.TaxAdvantage.JIsa.Personal) {
                            arrayList4.add(obj6);
                        }
                    }
                    Iterator it15 = arrayList4.iterator();
                    while (true) {
                        if (it15.hasNext()) {
                            Object next3 = it15.next();
                            if (((TradingAccount.TaxAdvantage.JIsa.Personal) next3).e == cfl.b.CREATED) {
                                obj3 = next3;
                            }
                        }
                    }
                    TradingAccount.TaxAdvantage.JIsa.Personal personal = (TradingAccount.TaxAdvantage.JIsa.Personal) obj3;
                    if (tradingAccountAvailableToOnboard != null || personal != null) {
                        hel.b bVar3 = tradingLegalEntityInformation.f105106a;
                        if (personal != null) {
                            available = new IncomeSorterDestinationCrossSell$PersonalJisaAccount.Created(personal);
                        } else {
                            if (tradingAccountAvailableToOnboard == null) {
                                throw new IllegalStateException("Personal JISA account is missing");
                            }
                            available = new IncomeSorterDestinationCrossSell$PersonalJisaAccount.Available(tradingAccountAvailableToOnboard);
                        }
                        eVarB.add(new mqd.e(bVar3, available));
                    }
                }
                return zhm.u.a(eVarB);
            case 28:
                mqg.e eVar2 = (mqg.e) obj5;
                pcd.s vault = (pcd.s) obj2;
                Intrinsics.checkNotNullParameter(vault, "vault");
                if (vault.f234889n == pcd.b.PERSONAL_JOINT) {
                    return zi0.c.j(zbb.d.f320867b);
                }
                switch (mqg.c.f207997a[vault.e.ordinal()]) {
                    case 1:
                        return rd0.e.c(nim.a.v(ijb.a.b(eVar2.e, vault.i().f234842b), new mqg.b(z3 ? 1 : 0)), p0.f264003c);
                    case 2:
                    case 3:
                        return zi0.c.j(zbb.c.f320866b);
                    case 4:
                    case 5:
                        return zi0.c.j(zbb.e.f320868b);
                    case 6:
                    case 7:
                    case 8:
                        return zi0.c.j(zbb.b.f320865b);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            default:
                t1 t1Var = (t1) obj5;
                Set<xnh.a> products = (Set) obj2;
                Intrinsics.checkNotNullParameter(products, "products");
                ArrayList arrayList5 = new ArrayList();
                for (xnh.a aVar8 : products) {
                    t1Var.getClass();
                    switch (mqh.a.f208002a[aVar8.ordinal()]) {
                        case 1:
                            fVar = zel.f.STOCKS;
                            break;
                        case 2:
                            fVar = zel.f.ETP;
                            break;
                        case 3:
                            fVar = zel.f.BOND;
                            break;
                        case 4:
                            fVar = zel.f.CFD;
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            fVar = null;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (fVar != null) {
                        arrayList5.add(fVar);
                    }
                }
                return d0.P0(arrayList5, new mqh.b());
        }
    }

    public /* synthetic */ y(mlk.v vVar, i0 i0Var) {
        this.f206627a = 3;
        this.f206628b = vVar;
    }

    public /* synthetic */ y(mp6.a aVar, sr srVar) {
        this.f206627a = 18;
        this.f206628b = srVar;
    }
}
