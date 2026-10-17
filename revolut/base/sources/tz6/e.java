package tz6;

import android.content.IntentSender;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.gallery_picker.PersonalisationGalleryTileModel;
import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.TransferLinkDetails;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocument;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDocuments;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.impl.ui.rev10.documents.list.LoanDocumentsController;
import com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.CeFiToDeFiAssetPickerScreen;
import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreen;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.SplitBillQrScreen;
import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gallery.TransferPersonalisationGallerySelector;
import com.revolut.feature.payments.transfers.personalisation.models.P2pPersonalisation;
import com.revolut.feature.retail.cfd.impl.screens.maintenance_margin.CfdMaintenanceMarginController;
import com.revolut.feature.shared.help_centre.impl.faq.FaqFlow;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.feature.statements.impl.ui.crypto_statement.screen.CryptoStatementScreen;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreen;
import com.revolut.feature_move_money.impl.amount.order_options.OrderOptionsScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.country_chooser.PaymentsCountryChooserScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsContract$ModalStep;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsScreen;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import ip0.y;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.n1;
import pcd.s;
import s1l.z0;
import tjf.p0;
import twb.b0;
import u4i.t;
import u7k.g0;
import vkm.j2;
import yhm.r;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f275872w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f275872w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e((FreelancerPerksDetailsScreen) this.f275872w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e((o) this.f275872w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e((CryptoStatementScreen) this.f275872w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e((tzh.i) this.f275872w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e((u07.l) this.f275872w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e((SplitBillQrScreen) this.f275872w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            case 6:
                e eVar7 = new e((u1a.l) this.f275872w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
            case 7:
                e eVar8 = new e((PaymentOptionsVaultWithdrawalScreen) this.f275872w, continuation, 7);
                eVar8.v = obj2;
                return eVar8;
            case 8:
                e eVar9 = new e((u1k.j) this.f275872w, continuation, 8);
                eVar9.v = obj2;
                return eVar9;
            case 9:
                return new e((u1k.j) this.v, (dj0.d) this.f275872w, continuation);
            case 10:
                e eVar10 = new e((u1l.e) this.f275872w, continuation, 10);
                eVar10.v = obj2;
                return eVar10;
            case 11:
                e eVar11 = new e((u29.o) this.f275872w, continuation, 11);
                eVar11.v = obj2;
                return eVar11;
            case 12:
                e eVar12 = new e((TransferPersonalisationGallerySelector) this.f275872w, continuation, 12);
                eVar12.v = obj2;
                return eVar12;
            case 13:
                e eVar13 = new e((u2a.g) this.f275872w, continuation, 13);
                eVar13.v = obj2;
                return eVar13;
            case 14:
                e eVar14 = new e((CeFiToDeFiAssetPickerScreen) this.f275872w, continuation, 14);
                eVar14.v = obj2;
                return eVar14;
            case 15:
                e eVar15 = new e((com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a) this.f275872w, continuation, 15);
                eVar15.v = obj2;
                return eVar15;
            case 16:
                e eVar16 = new e((CfdMaintenanceMarginController) this.f275872w, continuation, 16);
                eVar16.v = obj2;
                return eVar16;
            case 17:
                e eVar17 = new e((u3b.g) this.f275872w, continuation, 17);
                eVar17.v = obj2;
                return eVar17;
            case 18:
                e eVar18 = new e((PaymentsCountryChooserScreen) this.f275872w, continuation, 18);
                eVar18.v = obj2;
                return eVar18;
            case 19:
                e eVar19 = new e((u3k.h) this.f275872w, continuation, 19);
                eVar19.v = obj2;
                return eVar19;
            case 20:
                e eVar20 = new e((u4c.e) this.f275872w, continuation, 20);
                eVar20.v = obj2;
                return eVar20;
            case 21:
                e eVar21 = new e((FeeBreakdownScreen) this.f275872w, continuation, 21);
                eVar21.v = obj2;
                return eVar21;
            case 22:
                e eVar22 = new e((t) this.f275872w, continuation, 22);
                eVar22.v = obj2;
                return eVar22;
            case 23:
                e eVar23 = new e((LoanDocumentsController) this.f275872w, continuation, 23);
                eVar23.v = obj2;
                return eVar23;
            case 24:
                e eVar24 = new e((u65.i) this.f275872w, continuation, 24);
                eVar24.v = obj2;
                return eVar24;
            case 25:
                e eVar25 = new e((u66.b) this.f275872w, continuation, 25);
                eVar25.v = obj2;
                return eVar25;
            case 26:
                e eVar26 = new e((u6b.l) this.f275872w, continuation, 26);
                eVar26.v = obj2;
                return eVar26;
            case 27:
                e eVar27 = new e((OrderOptionsScreen) this.f275872w, continuation, 27);
                eVar27.v = obj2;
                return eVar27;
            case 28:
                e eVar28 = new e((FaqFlow) this.f275872w, continuation, 28);
                eVar28.v = obj2;
                return eVar28;
            default:
                e eVar29 = new e((PaymentLinkDetailsScreen) this.f275872w, continuation, 29);
                eVar29.v = obj2;
                return eVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((TiersRateItemMapper$Parcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((v19.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((PersonalisationGalleryTileModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((q66.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((uh0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v91, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v2, types: [com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        ggc.l lVar;
        ggc.t tVar;
        String str;
        String currency;
        u6i.c cVar;
        int i = this.u;
        int i2 = 4;
        int i3 = 19;
        int i5 = 1;
        int i6 = 27;
        int i21 = 12;
        int i22 = 2;
        int i32 = 26;
        Object obj3 = this.f275872w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVarE3 = ((FreelancerPerksDetailsScreen) obj3).R2();
                String listId = aVar.f275445a;
                o oVar = (o) iVarE3;
                oVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (Intrinsics.f(listId, "ITEM_ID_TERMS_AND_CONS_LINK") && (lVar = (ggc.l) ((h) ((j2) oVar.f275888r.f22677a).getValue()).f275876a.getContent()) != null && (tVar = lVar.d) != null && (str = tVar.e) != null) {
                    oVar.C1(new ExternalDestination.Browser(str, null));
                }
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar2 = (o) obj3;
                oVar2.H2(oVar2.f275888r, new tvc.i(data, i21));
                break;
            case 2:
                String id10 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                tzd.f fVar = (tzd.f) ((CryptoStatementScreen) obj3).O.getValue();
                Intrinsics.h(id10);
                tzd.t tVar2 = (tzd.t) fVar;
                tVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                tVar2.H2(tVar2.u, new te8.a(id10, 18));
                break;
            case 3:
                TiersRateItemMapper$Parcel tiersRateItemMapper$Parcel = (TiersRateItemMapper$Parcel) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((tzh.i) obj3).d.Z2(tiersRateItemMapper$Parcel);
                break;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u07.l lVar2 = (u07.l) obj3;
                lVar2.H2(lVar2.f276090t, new tvc.i(data2, 13));
                break;
            case 5:
                String listId2 = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u1a.j jVar = (u1a.j) ((SplitBillQrScreen) obj3).P.getValue();
                Intrinsics.h(listId2);
                u1a.l lVar3 = (u1a.l) jVar;
                lVar3.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (listId2.equals("EDIT_MENU_ITEM_ID")) {
                    Object content = ((u1a.f) ((j2) lVar3.f276378r.f22677a).getValue()).f276369a.getContent();
                    SplitBillQrState.Shareable shareable = content instanceof SplitBillQrState.Shareable ? (SplitBillQrState.Shareable) content : null;
                    splitBillLink = shareable != null ? shareable.f79952a : 0;
                    if (splitBillLink == 0) {
                        r6.b.r("onEditClicked should not be called without loaded qrState");
                    } else {
                        lVar3.C2(new u1a.g(splitBillLink.f79942g, splitBillLink.f79939a));
                    }
                } else {
                    hx7.e.h(new IllegalArgumentException("Unsupported menu item clicked: ".concat(listId2)));
                }
                break;
            case 6:
                Data data3 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u1a.l lVar4 = (u1a.l) obj3;
                lVar4.H2(lVar4.f276378r, new tvc.i(data3, 14));
                break;
            case 7:
                String amount = (String) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u1k.g gVar = (u1k.g) ((PaymentOptionsVaultWithdrawalScreen) obj3).c0.getValue();
                Intrinsics.h(amount);
                u1k.j jVar2 = (u1k.j) gVar;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                s sVar = (s) ((u1k.e) jVar2.t2()).f276419a.getContent();
                if (sVar != null && (currency = sVar.getCurrency()) != null) {
                    jVar2.x2(new e06.g(jVar2.f276430s.b(amount, currency), currency, i2));
                }
                break;
            case 8:
                Data data4 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u1k.j) obj3).x2(new tvc.i(data4, 15));
                break;
            case 9:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((u1k.j) this.v).v2(new u1k.f((dj0.d) obj3));
                break;
            case 10:
                String partnerId = (String) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar2 = ((u1l.e) obj3).f276438b;
                u1l.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(partnerId, "partnerId");
                z0 z0Var = (z0) j6.a.k(z0.class, cVar2, "KEY_TRAVEL_STATUS_PARTNER_LAYOUT_" + partnerId);
                if (z0Var != null) {
                }
                break;
            case 11:
                v19.a aVar13 = (v19.a) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 12:
                PersonalisationGalleryTileModel personalisationGalleryTileModel = (PersonalisationGalleryTileModel) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u2a.g gVar2 = (u2a.g) ((TransferPersonalisationGallerySelector) obj3).R.getValue();
                P2pPersonalisation p2pPersonalisation = personalisationGalleryTileModel.f54215c;
                gVar2.getClass();
                gVar2.l2(new b0(gVar2, p2pPersonalisation, (Continuation) splitBillLink, i2), new yi5.b(i32));
                break;
            case 13:
                Data data5 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u2a.g gVar3 = (u2a.g) obj3;
                gVar3.H2(gVar3.f276595r, new tvc.i(data5, 16));
                break;
            case 14:
                String query = (String) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u36.d dVarE3 = ((CeFiToDeFiAssetPickerScreen) obj3).R2();
                Intrinsics.h(query);
                com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a aVar18 = (com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a) dVarE3;
                aVar18.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                aVar18.H2(aVar18.f71747r, new te8.a(query, i3));
                break;
            case 15:
                Data data6 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a aVar20 = (com.revolut.feature.defi.exchange.impl.ui.cefi_to_defi.asset_picker.a) obj3;
                aVar20.H2(aVar20.f71747r, new tvc.i(data6, i3));
                break;
            case 16:
                n6 actionButtonModel = (n6) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u3b.e eVar = (u3b.e) ((CfdMaintenanceMarginController) obj3).N.getValue();
                Intrinsics.h(actionButtonModel);
                u3b.g gVar4 = (u3b.g) eVar;
                gVar4.getClass();
                Intrinsics.checkNotNullParameter(actionButtonModel, "actionButtonModel");
                if (Intrinsics.f(actionButtonModel.k, u3b.c.f276884a)) {
                    gVar4.C1(u0.b(b3f.b.b(gVar4.f276890q, new TransferSubjectId.Portfolio(gVar4.o.f82222a), WealthAccountType.MARGIN, null, null, 12)));
                }
                break;
            case 17:
                Data data7 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u3b.g gVar5 = (u3b.g) obj3;
                gVar5.H2(gVar5.f276891r, new tvc.i(data7, 21));
                break;
            case 18:
                String searchQuery = (String) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u3k.f fVar2 = (u3k.f) ((PaymentsCountryChooserScreen) obj3).R.getValue();
                Intrinsics.h(searchQuery);
                u3k.h hVar = (u3k.h) fVar2;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                hVar.H2(hVar.f276946p, new te8.a(searchQuery, 20));
                break;
            case 19:
                Data data8 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u3k.h hVar2 = (u3k.h) obj3;
                hVar2.H2(hVar2.f276946p, new tvc.i(data8, 24));
                break;
            case 20:
                Data data9 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u4c.e eVar2 = (u4c.e) obj3;
                eVar2.H2(eVar2.f277316q, new tvc.i(data9, i6));
                break;
            case 21:
                ty0.a aVar26 = (ty0.a) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u4i.s sVarM3 = ((FeeBreakdownScreen) obj3).R2();
                String url2 = aVar26.f275445a;
                t tVar3 = (t) sVarM3;
                tVar3.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                tVar3.C2(new u4i.n(url2));
                break;
            case 22:
                Data data10 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar4 = (t) obj3;
                tVar4.H2(tVar4.f277364r, new u4e.l(data10, i5));
                break;
            case 23:
                Object obj4 = this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u65.g gVar6 = (u65.g) ((LoanDocumentsController) obj3).O.getValue();
                yx4.b.Companion.getClass();
                yx4.b click = yx4.a.a(obj4);
                u65.i iVar = (u65.i) gVar6;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(click, "click");
                String str2 = click.f317544a;
                if (Intrinsics.f(str2, "ERROR_STATE_ID")) {
                    iVar.f277495s.a();
                } else if (Intrinsics.f(str2, "PAYMENT_RECEIPTS_LIST_ID")) {
                    Data data11 = (Data) ((u65.c) ((j2) iVar.f277496t.f22677a).getValue()).f277486c.f224257a;
                    LoanDocuments loanDocuments = data11 != null ? (LoanDocuments) data11.getContent() : null;
                    if (loanDocuments != null) {
                        iVar.C2(new u65.e(loanDocuments.f70157b, loanDocuments.f70156a));
                    }
                } else {
                    Object obj5 = click.f317545b;
                    if (obj5 == q35.g.Generated) {
                        iVar.n2(new p0(iVar, splitBillLink, i6), new whi.b(6));
                    } else {
                        q35.g gVar7 = q35.g.Stored;
                        if (obj5 == gVar7) {
                            iVar.C1(new LoanKompotFeatureConfig.StatementsNavigationDestination(iVar.o.f70420a, gVar7));
                        } else if (obj5 instanceof ux4.d) {
                            ux4.d dVar = (ux4.d) obj5;
                            iVar.C2(new u65.d(dVar.f283867c, dVar.d));
                        } else if (obj5 instanceof LoanDocument) {
                            LoanDocument loanDocument = (LoanDocument) obj5;
                            iVar.C2(new u65.d(loanDocument.f70154b, loanDocument.f));
                        }
                    }
                }
                break;
            case 24:
                r rVar = (r) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u65.i iVar2 = (u65.i) obj3;
                iVar2.H2(iVar2.f277496t, new toh.h((Data) rVar.f314201a, i21, (Data) rVar.f314202b, (od0.i) rVar.f314203c));
                break;
            case 25:
                q66.c cVar3 = (q66.c) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                break;
            case 26:
                Data data12 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u6b.l lVar5 = (u6b.l) obj3;
                cli.y yVar = lVar5.f277539r;
                lVar5.H2(yVar, new u4e.l(data12, i22));
                r5b.e eVar3 = (r5b.e) data12.getContent();
                if (eVar3 != null && ((u6b.e) ((j2) yVar.f22677a).getValue()).f277527a.isEmpty()) {
                    HashMap map = new HashMap(((u6b.e) ((j2) yVar.f22677a).getValue()).f277527a);
                    for (r5b.f fVar3 : eVar3.d) {
                        String str3 = fVar3.f251570c;
                        if (str3 != null) {
                            map.put(fVar3.f251568a, str3);
                        }
                    }
                    lVar5.H2(yVar, new b4d.a(map, i22));
                }
                break;
            case 27:
                String listId3 = (String) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u6i.e eVar4 = (u6i.e) ((OrderOptionsScreen) obj3).T.getValue();
                Intrinsics.h(listId3);
                eVar4.getClass();
                Intrinsics.checkNotNullParameter(listId3, "listId");
                switch (listId3.hashCode()) {
                    case -1812221741:
                        if (listId3.equals("MARKET_ORDER_CELL_LIST_ID")) {
                            cVar = u6i.c.MARKET_ORDER;
                            eVar4.C2(new u6i.d(cVar));
                        }
                        hx7.e.n(new IllegalArgumentException("Unknown element selected ".concat(listId3)));
                        break;
                    case -1184454835:
                        if (listId3.equals("STOP_ORDER_CELL_LIST_ID")) {
                            cVar = u6i.c.STOP_ORDER;
                            eVar4.C2(new u6i.d(cVar));
                        }
                        hx7.e.n(new IllegalArgumentException("Unknown element selected ".concat(listId3)));
                        break;
                    case 1228313364:
                        if (listId3.equals("LIMIT_ORDER_CELL_LIST_ID")) {
                            cVar = u6i.c.LIMIT_ORDER;
                            eVar4.C2(new u6i.d(cVar));
                        }
                        hx7.e.n(new IllegalArgumentException("Unknown element selected ".concat(listId3)));
                        break;
                    case 1555911463:
                        if (listId3.equals("SCHEDULE_CELL_LIST_ID")) {
                            cVar = u6i.c.SCHEDULING;
                            eVar4.C2(new u6i.d(cVar));
                        }
                        hx7.e.n(new IllegalArgumentException("Unknown element selected ".concat(listId3)));
                        break;
                    default:
                        hx7.e.n(new IllegalArgumentException("Unknown element selected ".concat(listId3)));
                        break;
                }
                break;
            case 28:
                uh0.b bVar = (uh0.b) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                try {
                    bVar.a(((FaqFlow) obj3).m2(), 60431);
                } catch (IntentSender.SendIntentException e) {
                    IllegalStateException illegalStateException = new IllegalStateException("InAppCalls: Unable to start Twilio install confirmation dialog", e);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            default:
                y data13 = (y) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                u7k.g gVarE3 = ((PaymentLinkDetailsScreen) obj3).R2();
                Intrinsics.h(data13);
                com.revolut.retail.feature.payments.payment_links.impl.ui.details.b bVar2 = (com.revolut.retail.feature.payments.payment_links.impl.ui.details.b) gVarE3;
                com.revolut.kompot.navigable.vc.modal.a aVar36 = bVar2.f102192w;
                Intrinsics.checkNotNullParameter(data13, "data");
                u7k.b bVar3 = (u7k.b) ((u7k.a) ((j2) bVar2.v.f22677a).getValue()).f277943a.getContent();
                TransferLinkDetails.Active active = bVar3 != null ? bVar3.f277945a : null;
                if (active != null) {
                    String str4 = data13.f167226b.f58316a;
                    int iHashCode = str4.hashCode();
                    ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                    switch (iHashCode) {
                        case -1798194419:
                            if (str4.equals("ID_ACTION_ACCEPT")) {
                                bVar2.l2(new u7k.b0(bVar2, active, null), new yi5.b(i32));
                            }
                            break;
                        case -1742457729:
                            if (str4.equals("ID_ACTION_CANCEL")) {
                                oki.h.v2(aVar36, new PaymentLinkDetailsContract$ModalStep.CancelPaymentLink(active), bottom_dialog);
                            }
                            break;
                        case -1484448399:
                            if (str4.equals("ID_ACTION_DECLINE")) {
                                oki.h.v2(aVar36, new PaymentLinkDetailsContract$ModalStep.DeclinePaymentLink(active), bottom_dialog);
                            }
                            break;
                        case 1344237850:
                            if (str4.equals("ID_ACTION_SHARE")) {
                                bVar2.l2(new g0(bVar2, active, null), new yi5.b(i32));
                            }
                            break;
                    }
                } else {
                    IllegalStateException illegalStateException2 = new IllegalStateException(p.a.p("Tried ", data13.f167225a, " action on NonActive TransferLink: null"));
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                }
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(u1k.j jVar, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 9;
        this.v = jVar;
        this.f275872w = dVar;
    }
}
