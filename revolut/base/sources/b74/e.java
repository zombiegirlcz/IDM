package b74;

import a83.p0;
import android.os.Parcelable;
import aw0.f4;
import aw0.n6;
import b4b.d0;
import b4b.z;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.core.api.provider.BillsDialogProvider$Payload;
import com.revolut.feature.apm.upi.impl.flow.screen.amount.UpiTransferAmountScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.edit.EditConsentPreferencesScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreen;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.screen.search.BillsSearchScreen;
import com.revolut.feature.paynow.impl.screens.amount.PayNowAmountScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.send.PixSendScreen;
import com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.ConfirmReservationScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.bottom_sheet.delete_tracking.DeleteTrackingScreen;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyContract$ModalStep;
import com.revolut.feature.revolutpay.shared.ui.pay_with_any.PayWithAnyScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.cards.troubleshooter.CardTroubleshooterScreen;
import com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.select_type.SelectAlertTypeController;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.AccountInformationScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.child_age.TravelHotelsChildAgePickerController;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature_retail_user_declarations.bank_terms.AcceptBankTermsScreen;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import ip0.a10;
import ip0.c10;
import ip0.tm0;
import ip0.um0;
import ip0.vd;
import ip0.x10;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import org.joda.time.DateTime;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f12886w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f12886w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e((EditConsentPreferencesScreen) this.f12886w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e((com.revolut.feature.giro.impl.ui.form.b) this.f12886w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e((b79.m) this.f12886w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e((PayNowAmountScreen) this.f12886w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e((b7f.h) this.f12886w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e((b85.j) this.f12886w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            case 6:
                e eVar7 = new e((com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.b) this.f12886w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
            case 7:
                e eVar8 = new e((CardTroubleshooterScreen) this.f12886w, continuation, 7);
                eVar8.v = obj2;
                return eVar8;
            case 8:
                e eVar9 = new e((UploadScreen) this.f12886w, continuation, 8);
                eVar9.v = obj2;
                return eVar9;
            case 9:
                e eVar10 = new e((AccountInformationScreen) this.f12886w, continuation, 9);
                eVar10.v = obj2;
                return eVar10;
            case 10:
                e eVar11 = new e((AcceptBankTermsScreen) this.f12886w, continuation, 10);
                eVar11.v = obj2;
                return eVar11;
            case 11:
                e eVar12 = new e((com.revolut.feature_retail_user_declarations.bank_terms.a) this.f12886w, continuation, 11);
                eVar12.v = obj2;
                return eVar12;
            case 12:
                e eVar13 = new e((com.revolut.feature.apm.payid.impl.screen.settings.a) this.f12886w, continuation, 12);
                eVar13.v = obj2;
                return eVar13;
            case 13:
                e eVar14 = new e((bb8.j) this.f12886w, continuation, 13);
                eVar14.v = obj2;
                return eVar14;
            case 14:
                e eVar15 = new e((PixSendScreen) this.f12886w, continuation, 14);
                eVar15.v = obj2;
                return eVar15;
            case 15:
                e eVar16 = new e((bba.s) this.f12886w, continuation, 15);
                eVar16.v = obj2;
                return eVar16;
            case 16:
                e eVar17 = new e((DeleteTrackingScreen) this.f12886w, continuation, 16);
                eVar17.v = obj2;
                return eVar17;
            case 17:
                e eVar18 = new e((bcj.l) this.f12886w, continuation, 17);
                eVar18.v = obj2;
                return eVar18;
            case 18:
                e eVar19 = new e((TravelHotelsChildAgePickerController) this.f12886w, continuation, 18);
                eVar19.v = obj2;
                return eVar19;
            case 19:
                e eVar20 = new e((ConfirmReservationScreen) this.f12886w, continuation, 19);
                eVar20.v = obj2;
                return eVar20;
            case 20:
                e eVar21 = new e((PayWithAnyScreen) this.f12886w, continuation, 20);
                eVar21.v = obj2;
                return eVar21;
            case 21:
                return new e((bek.g) this.v, (ArrayList) this.f12886w, continuation, 21);
            case 22:
                e eVar22 = new e((SelectAlertTypeController) this.f12886w, continuation, 22);
                eVar22.v = obj2;
                return eVar22;
            case 23:
                e eVar23 = new e((UpiTransferAmountScreen) this.f12886w, continuation, 23);
                eVar23.v = obj2;
                return eVar23;
            case 24:
                return new e((bgg.b) this.v, (eig.n) this.f12886w, continuation, 24);
            case 25:
                e eVar24 = new e((bh5.e) this.f12886w, continuation, 25);
                eVar24.v = obj2;
                return eVar24;
            case 26:
                e eVar25 = new e((JuniorMigrationAssetDetailsScreen) this.f12886w, continuation, 26);
                eVar25.v = obj2;
                return eVar25;
            case 27:
                e eVar26 = new e((bh8.u) this.f12886w, continuation, 27);
                eVar26.v = obj2;
                return eVar26;
            case 28:
                e eVar27 = new e((BillsSearchScreen) this.f12886w, continuation, 28);
                eVar27.v = obj2;
                return eVar27;
            default:
                e eVar28 = new e((bh9.t) this.f12886w, continuation, 29);
                eVar28.v = obj2;
                return eVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((b77.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((s69.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((d1h.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
                return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((sa) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((mgd.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((x10) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        int i3 = 1;
        int i5 = 28;
        int i6 = 12;
        int i21 = 2;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        int i22 = 7;
        int i32 = 18;
        Object obj3 = this.f12886w;
        switch (i) {
            case 0:
                vd vdVar = (vd) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = ((EditConsentPreferencesScreen) obj3).d();
                LocalDate date = vdVar.f166807b;
                l lVar = (l) jVarE3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                lVar.H2(lVar.f12894p, new b58.f(lVar.I2(date), lVar, i6));
                break;
            case 1:
                b77.h hVar = (b77.h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.giro.impl.ui.form.b bVar = (com.revolut.feature.giro.impl.ui.form.b) obj3;
                bVar.H2(bVar.f74552t, new z(hVar, 22));
                break;
            case 2:
                b79.m mVar = (b79.m) obj3;
                s69.j jVar = (s69.j) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                DateTime dateTime = jVar.f260172a;
                if (dateTime == null) {
                    dateTime = new DateTime(System.currentTimeMillis());
                }
                List list = (List) ue0.e.M(mVar.f12959a.c(dateTime));
                if (list != null) {
                }
                break;
            case 3:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((PayNowAmountScreen) obj3).d().I2(new b7a.j(charSequence.toString()));
                break;
            case 4:
                Data data = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b7f.h hVar2 = (b7f.h) obj3;
                hVar2.X2(hVar2.o, new d0(data, i22));
                break;
            case 5:
                Data data2 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b85.j jVar2 = (b85.j) obj3;
                jVar2.H2(jVar2.f13107s, new d0(data2, 8));
                break;
            case 6:
                d1h.g gVar = (d1h.g) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.b bVar2 = (com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.b) obj3;
                bVar2.H2(bVar2.f91434q, new b8f.z(gVar, i2));
                break;
            case 7:
                String itemId = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b9d.i iVar = (b9d.i) ((CardTroubleshooterScreen) obj3).f86321d0.getValue();
                Intrinsics.h(itemId);
                b9d.n nVar = (b9d.n) iVar;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("DONE_BUTTON_ITEM_ID")) {
                    nVar.v2(b9d.f.f13718a);
                }
                break;
            case 8:
                ty0.a aVar9 = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ba4.r rVarE3 = ((UploadScreen) obj3).R2();
                Intrinsics.h(aVar9);
                ((com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a) rVarE3).I2(new ba4.l(aVar9));
                break;
            case 9:
                f4 f4Var = (f4) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (f4Var.f10304b) {
                    KProperty[] kPropertyArr = AccountInformationScreen.U;
                    ((AccountInformationScreen) obj3).d3().f174567b.setExpanded(false, true);
                }
                break;
            case 10:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bai.l lVarE3 = ((AcceptBankTermsScreen) obj3).R2();
                Intrinsics.h(clickData);
                com.revolut.feature_retail_user_declarations.bank_terms.a aVar13 = (com.revolut.feature_retail_user_declarations.bank_terms.a) lVarE3;
                aVar13.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                String str = (String) com.revolut.feature_retail_user_declarations.bank_terms.a.u.get(clickData.f275445a);
                if (str != null) {
                    aVar13.C1(new ExternalDestination.Browser(str, null));
                }
                break;
            case 11:
                Data data3 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature_retail_user_declarations.bank_terms.a aVar15 = (com.revolut.feature_retail_user_declarations.bank_terms.a) obj3;
                aVar15.H2(aVar15.f97492t, new d0(data3, 17));
                break;
            case 12:
                Data data4 = (Data) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.apm.payid.impl.screen.settings.a aVar17 = (com.revolut.feature.apm.payid.impl.screen.settings.a) obj3;
                aVar17.H2(aVar17.v, new d0(data4, 19));
                break;
            case 13:
                Data data5 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bb8.j jVar3 = (bb8.j) obj3;
                jVar3.H2(jVar3.f14192q, new d0(data5, 20));
                break;
            case 14:
                String searchQuery = (String) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bba.k kVarE3 = ((PixSendScreen) obj3).d();
                Intrinsics.h(searchQuery);
                bba.s sVar = (bba.s) kVarE3;
                sVar.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "query");
                ogm.i iVar2 = sVar.o;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                yji.l.a1(sVar, rd0.e.b(nim.a.w(xx9.p.b((xx9.p) iVar2.f225222b, searchQuery), new s78.d(iVar2, i21))), null, null, new a26.q(sVar, searchQuery, (Continuation) , i32), 3);
                break;
            case 15:
                Data data6 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bba.s sVar2 = (bba.s) obj3;
                sVar2.H2(sVar2.v, new d0(data6, 21));
                break;
            case 16:
                n6 n6Var = (n6) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bbc.i iVar3 = (bbc.i) ((DeleteTrackingScreen) obj3).Q.getValue();
                Object obj4 = n6Var.k;
                if (obj4 instanceof bbc.b) {
                    iVar3.C2(bbc.d.f14248a);
                } else {
                    iVar3.getClass();
                    if (obj4 instanceof bbc.c) {
                        iVar3.l2(new aza.g(iVar3, , 10), new yi5.b(26));
                    }
                }
                break;
            case 17:
                Data data7 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bcj.l lVar2 = (bcj.l) obj3;
                lVar2.X2(lVar2.o, new d0(data7, i5));
                break;
            case 18:
                Pair pair = (Pair) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                a10 model = (a10) pair.f186385a;
                int iIntValue = ((Number) pair.f186386b).intValue();
                bdg.d dVar = (bdg.d) ((TravelHotelsChildAgePickerController) obj3).U.getValue();
                dVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                if (iIntValue >= 0 && iIntValue <= 18) {
                    Object obj5 = ((c10) model.f163364b.get(iIntValue)).f163673b;
                    dVar.H2(dVar.o, new b9i.f((Object) (obj5 instanceof Child ? (Child) obj5 : 0), 11));
                }
                break;
            case 19:
                sa model2 = (sa) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                beb.j jVarE32 = ((ConfirmReservationScreen) obj3).R2();
                Intrinsics.h(model2);
                com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a aVar25 = (com.revolut.feature.retail.restaurants.impl.ui.confirmreservation.a) jVarE32;
                aVar25.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                if (Intrinsics.f(model2.f54700a, "CONFIRM_RESERVATION_PAYMENT_ERROR")) {
                    xdb.y yVar = (xdb.y) ((beb.h) ((j2) aVar25.f82839s.f22677a).getValue()).f14736b.getContent();
                    aVar25.I2(yVar != null ? yVar.f304415a : null);
                }
                break;
            case 20:
                String menuId = (String) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bec.q qVarE3 = ((PayWithAnyScreen) obj3).d();
                Intrinsics.h(menuId);
                com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar27 = (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) qVarE3;
                aVar27.getClass();
                Intrinsics.checkNotNullParameter(menuId, "menuId");
                if (menuId.equals("MONEY_OPTIONS_MENU_ITEM")) {
                    oki.h.v2(aVar27.f84729w, new PayWithAnyContract$ModalStep.InsufficientFundsOptions(aVar27.f84726r.f84433g), bottom_dialog);
                }
                break;
            case 21:
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w4l.f fVar = ((bek.g) this.v).f14870c;
                Unit unit = Unit.f186387a;
                fVar.j(unit, (ArrayList) obj3);
                break;
            case 22:
                mgd.f alertType = (mgd.f) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bfd.g gVar2 = (bfd.g) ((SelectAlertTypeController) obj3).M.getValue();
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(alertType, "alertType");
                l2d.n nVar2 = (l2d.n) gVar2.o;
                if (alertType != ((mgd.f) nVar2.f191787a.d.v0(mgd.f.TARGET_PRICE, "PREFERRED_ALERT_TYPE_KEY", mgd.f.class))) {
                    Intrinsics.checkNotNullParameter(alertType, "alertType");
                    b4d.i iVar4 = nVar2.f191787a;
                    Intrinsics.checkNotNullParameter(alertType, "alertType");
                    iVar4.d.G(alertType, "PREFERRED_ALERT_TYPE_KEY", wim.z.d(o0.b(mgd.f.class)));
                }
                gVar2.C2(new bfd.e(alertType));
                break;
            case 23:
                CharSequence charSequence2 = (CharSequence) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bg2.k kVarE32 = ((UpiTransferAmountScreen) obj3).R2();
                String amount = charSequence2.toString();
                bg2.x xVar = (bg2.x) kVarE32;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                xVar.H2(xVar.z, new beg.k(xVar, amount, i3));
                break;
            case 24:
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bgg.b bVar3 = (bgg.b) this.v;
                j60.a aVar32 = bVar3.f15200m;
                eig.n unlinkAccountParcel = (eig.n) obj3;
                bVar3.f15199l.getClass();
                Intrinsics.checkNotNullParameter(unlinkAccountParcel, "unlinkAccountParcel");
                aVar32.x(new rp0.y(zhm.u.c(new um0("UNLINK_ACCOUNT_CONFIRMATION_BUTTONS_ITEM_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.miles_providers_unlink_account_button_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.miles_providers_unlink_account_button_confirm, null, null, 14), false, "UNLINK_ACCOUNT_CONFIRMATION_BUTTON_TAG", null, 40), (Object) unlinkAccountParcel, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new rp0.t(new TextLocalisedClause(R$string.miles_providers_unlink_account_title, null, null, 14), new TextLocalisedClause(R$string.miles_providers_unlink_account_message, zhm.u.c(unlinkAccountParcel.f126637b), null, 12), null, 28), rp0.l.WINDOW, null, null, null, 1016));
                break;
            case 25:
                Data data8 = (Data) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bh5.e eVar = (bh5.e) obj3;
                eVar.H2(eVar.f15231r, new beb.p(data8, i22));
                break;
            case 26:
                x10 model3 = (x10) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bh8.i iVarI3 = ((JuniorMigrationAssetDetailsScreen) obj3).T2();
                Intrinsics.h(model3);
                bh8.u uVar = (bh8.u) iVarI3;
                uVar.getClass();
                Intrinsics.checkNotNullParameter(model3, "model");
                String str2 = model3.f167082b.f58316a;
                int iHashCode = str2.hashCode();
                int i33 = 6;
                if (iHashCode != -566398196) {
                    if (iHashCode != 396649337) {
                        if (iHashCode == 1640488399 && str2.equals("VERIFY_ACCOUNT_ITEM_ID")) {
                            uVar.n2(new be7.s(uVar, , , i33), new whi.b(i33));
                        }
                    } else if (str2.equals("TRANSFER_FAILED_PROCEED_WITHOUT_TRANSFER_ID")) {
                        uVar.n2(new be7.s(uVar, bh8.l.PROCEED_WITHOUT_TRANSFER, , i33), new whi.b(i33));
                    }
                } else if (str2.equals("TRANSFER_FAILED_TRY_AGAIN_ID")) {
                    uVar.n2(new be7.s(uVar, bh8.l.TRY_AGAIN, , i33), new whi.b(i33));
                }
                break;
            case 27:
                Pair pair2 = (Pair) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((bh8.u) obj3).x2(new p0((Data) pair2.f186385a, (Data) pair2.f186386b, i22));
                break;
            case 28:
                ty0.a clickData2 = (ty0.a) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bh9.f fVarE3 = ((BillsSearchScreen) obj3).d();
                Intrinsics.h(clickData2);
                bh9.t tVar = (bh9.t) fVarE3;
                tVar.getClass();
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                tVar.f15286r.getClass();
                yji.l.j2(tVar, new ActionsBottomSheetController(sf9.a.a()), bottom_dialog, null, 2);
                break;
            default:
                n1 n1Var = (n1) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Parcelable parcelableA = n1Var.a().a();
                if ((parcelableA instanceof BillsDialogProvider$Payload) && ((BillsDialogProvider$Payload) parcelableA).f61465a == 57421) {
                    bh9.t tVar2 = (bh9.t) obj3;
                    tVar2.H2(tVar2.f15289w, new bek.a(i32));
                }
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f12886w = obj2;
    }
}
