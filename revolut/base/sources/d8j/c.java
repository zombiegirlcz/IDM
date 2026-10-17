package d8j;

import aw0.f4;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.LitePosShoppingCartScreen;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreen;
import com.revolut.feature.contacts.impl.ui.contact.screen.details.ContactDetailsScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_account_details.home.RefinancingAccountDetailsHomeController;
import com.revolut.feature.crypto.exchange.fees.impl.ui.learnmore.CryptoExchangeFeesLearnMoreBottomSheet;
import com.revolut.feature.junior.isa.impl.ui.account_details_confirmation.JuniorAccountDetailsConfirmationScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.trusted_list.PixTrustedListScreen;
import com.revolut.feature.retail.restaurants.impl.ui.customerdetails.CustomerDetailsScreen;
import com.revolut.feature.retail.savings.impl.challenge.presentation.onboarding.setup.SavingsChallengeSetUpScreen;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.traveller_information_edit.TravelHotelsTravellerInformationEditScreen;
import com.revolut.retail.feature.crypto.asset_details.common.api.ui.BaseCryptoAssetDetailsScreen;
import com.revolut.sso.impl.ui.consent.common.select_identity.SelectIdentityScreen;
import d9j.j;
import dah.k;
import dca.r;
import dk9.a0;
import do2.q;
import dx4.l;
import gim.i;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import qv0.p;
import tof.a3;
import vf0.h;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f112285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 26;
        this.v = dVar;
        this.f112285w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((BaseCryptoAssetDetailsScreen) this.f112285w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c((aah.g) this.f112285w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c((List) this.f112285w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c((j) this.f112285w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c((JuniorAccountDetailsConfirmationScreen) this.f112285w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c((k) this.f112285w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c((PixTrustedListScreen) this.f112285w, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c((dba.i) this.f112285w, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
            case 8:
                c cVar9 = new c((dbl.e) this.f112285w, continuation, 8);
                cVar9.v = obj2;
                return cVar9;
            case 9:
                c cVar10 = new c((dc8.f) this.f112285w, continuation, 9);
                cVar10.v = obj2;
                return cVar10;
            case 10:
                c cVar11 = new c((r) this.f112285w, continuation, 10);
                cVar11.v = obj2;
                return cVar11;
            case 11:
                c cVar12 = new c((com.revolut.feature.subscriptions.impl.subscriptiondetails.kompot.c) this.f112285w, continuation, 11);
                cVar12.v = obj2;
                return cVar12;
            case 12:
                c cVar13 = new c((CustomerDetailsScreen) this.f112285w, continuation, 12);
                cVar13.v = obj2;
                return cVar13;
            case 13:
                c cVar14 = new c((LitePosShoppingCartScreen) this.f112285w, continuation, 13);
                cVar14.v = obj2;
                return cVar14;
            case 14:
                c cVar15 = new c((com.revolut.feature.acquiring.lite_pos.impl.ui.screen.shopping_cart.c) this.f112285w, continuation, 14);
                cVar15.v = obj2;
                return cVar15;
            case 15:
                c cVar16 = new c((TravelHotelsTravellerInformationEditScreen) this.f112285w, continuation, 15);
                cVar16.v = obj2;
                return cVar16;
            case 16:
                c cVar17 = new c((CryptoExchangeFeesLearnMoreBottomSheet) this.f112285w, continuation, 16);
                cVar17.v = obj2;
                return cVar17;
            case 17:
                c cVar18 = new c((RefinancingAccountDetailsHomeController) this.f112285w, continuation, 17);
                cVar18.v = obj2;
                return cVar18;
            case 18:
                c cVar19 = new c((di7.e) this.f112285w, continuation, 18);
                cVar19.v = obj2;
                return cVar19;
            case 19:
                c cVar20 = new c((RentAndBillsManageLinkedPaymentsScreen) this.f112285w, continuation, 19);
                cVar20.v = obj2;
                return cVar20;
            case 20:
                c cVar21 = new c(continuation, (djh.d) this.f112285w);
                cVar21.v = obj2;
                return cVar21;
            case 21:
                c cVar22 = new c((a0) this.f112285w, continuation, 21);
                cVar22.v = obj2;
                return cVar22;
            case 22:
                c cVar23 = new c((SavingsChallengeSetUpScreen) this.f112285w, continuation, 22);
                cVar23.v = obj2;
                return cVar23;
            case 23:
                c cVar24 = new c((ContactDetailsScreen) this.f112285w, continuation, 23);
                cVar24.v = obj2;
                return cVar24;
            case 24:
                c cVar25 = new c((dmf.d) this.f112285w, continuation, 24);
                cVar25.v = obj2;
                return cVar25;
            case 25:
                c cVar26 = new c((SelectIdentityScreen) this.f112285w, continuation, 25);
                cVar26.v = obj2;
                return cVar26;
            case 26:
                return new c((com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.d) this.v, (String) this.f112285w, continuation);
            case 27:
                c cVar27 = new c((dn8.f) this.f112285w, continuation, 27);
                cVar27.v = obj2;
                return cVar27;
            case 28:
                c cVar28 = new c((BankAccountSwitchingFormScreen) this.f112285w, continuation, 28);
                cVar28.v = obj2;
                return cVar28;
            default:
                c cVar29 = new c((q) this.f112285w, continuation, 29);
                cVar29.v = obj2;
                return cVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((f5j.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((cd1.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((di7.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((a3) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03be  */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v46, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.ArrayList] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 2186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8j.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112285w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, djh.d dVar) {
        super(2, continuation);
        this.u = 20;
        this.f112285w = dVar;
    }
}
