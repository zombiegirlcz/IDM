package chf;

import android.view.View;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.spinner_picker.SpinnerPickerItemDelegateModel;
import com.revolut.core.ui_kit.views.spinnerPicker.SpinnerPickerView;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData;
import com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.OpenFinanceFlowContract$Step;
import com.revolut.feature.shared.order_initiation.api.domain.OrderInitiationPage;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.tab.accounts.impl.ui.tab.AccountsController;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.SelectFreeStocksScreen;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import csj.u;
import d6j.n0;
import do2.q;
import doc.n;
import elf.n1;
import etj.o;
import foc.j;
import java.io.File;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;
import w4l.k;
import whf.p;
import zm3.l;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f24205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f24206x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f24205w = obj3;
        this.f24206x = obj4;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a((c) this.f24205w, (List) this.f24206x, continuation, 0);
                aVar.v = obj2;
                return aVar;
            case 1:
                a aVar2 = new a((AccountsController) this.f24205w, (View) this.f24206x, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
            case 2:
                return new a((ck1.c) this.v, (yj1.e) this.f24205w, (String) this.f24206x, continuation, 2);
            case 3:
                return new a((u) this.v, (csj.g) this.f24205w, (dj0.d) this.f24206x, continuation, 3);
            case 4:
                a aVar3 = new a((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f24205w, (Amount) this.f24206x, continuation, 4);
                aVar3.v = obj2;
                return aVar3;
            case 5:
                a aVar4 = new a((com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f24205w, (SourcePocket) this.f24206x, continuation, 5);
                aVar4.v = obj2;
                return aVar4;
            case 6:
                a aVar5 = new a((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.create.a) this.f24205w, (OrderInitiationPage) this.f24206x, continuation, 6);
                aVar5.v = obj2;
                return aVar5;
            case 7:
                return new a((d2d.c) this.v, (String) this.f24205w, (List) this.f24206x, continuation, 7);
            case 8:
                a aVar6 = new a((n0) this.f24205w, (xi0.b) this.f24206x, continuation, 8);
                aVar6.v = obj2;
                return aVar6;
            case 9:
                a aVar7 = new a((com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance_details.a) this.f24205w, (k) this.f24206x, continuation, 9);
                aVar7.v = obj2;
                return aVar7;
            case 10:
                a aVar8 = new a((com.revolut.feature.credit.application.plugins.impl.ui.home_insurance.e) this.f24205w, (uy3.c) this.f24206x, continuation, 10);
                aVar8.v = obj2;
                return aVar8;
            case 11:
                a aVar9 = new a((dfj.u) this.f24205w, (String) this.f24206x, continuation, 11);
                aVar9.v = obj2;
                return aVar9;
            case 12:
                a aVar10 = new a((com.revolut.feature.external_accounts.impl.ui.brazil.open_finance.flow.d) this.f24205w, (OpenFinanceFlowContract$Step) this.f24206x, continuation, 12);
                aVar10.v = obj2;
                return aVar10;
            case 13:
                a aVar11 = new a((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_checkout.c) this.f24205w, (w6c.h) this.f24206x, continuation, 13);
                aVar11.v = obj2;
                return aVar11;
            case 14:
                a aVar12 = new a((q) this.f24205w, (FormData) this.f24206x, continuation, 14);
                aVar12.v = obj2;
                return aVar12;
            case 15:
                a aVar13 = new a((j) this.f24205w, (n) this.f24206x, continuation, 15);
                aVar13.v = obj2;
                return aVar13;
            case 16:
                a aVar14 = new a((e2d.e) this.f24205w, (String) this.f24206x, continuation, 16);
                aVar14.v = obj2;
                return aVar14;
            case 17:
                a aVar15 = new a((ei1.k) this.f24205w, (String) this.f24206x, continuation, 17);
                aVar15.v = obj2;
                return aVar15;
            case 18:
                return new a((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_referral_sender.g) this.v, (y0) this.f24205w, (l) this.f24206x, continuation, 18);
            case 19:
                return new a((ej9.c) this.v, (ai9.h) this.f24205w, (wi9.g) this.f24206x, continuation, 19);
            case 20:
                a aVar16 = new a((n1) this.f24205w, (ParcelableDestination) this.f24206x, continuation, 20);
                aVar16.v = obj2;
                return aVar16;
            case 21:
                a aVar17 = new a((File) this.f24205w, (enf.c) this.f24206x, continuation, 21);
                aVar17.v = obj2;
                return aVar17;
            case 22:
                a aVar18 = new a((com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f24205w, (vr.a) this.f24206x, continuation, 22);
                aVar18.v = obj2;
                return aVar18;
            case 23:
                a aVar19 = new a((kotlin.jvm.internal.q) this.f24205w, (com.revolut.biometric_verification.impl.ui.flow.launcher.d) this.f24206x, continuation);
                aVar19.v = obj2;
                return aVar19;
            case 24:
                a aVar20 = new a((et6.y0) this.f24205w, (k) this.f24206x, continuation, 24);
                aVar20.v = obj2;
                return aVar20;
            case 25:
                a aVar21 = new a((o) this.f24205w, (SavingsAccountDetails) this.f24206x, continuation, 25);
                aVar21.v = obj2;
                return aVar21;
            case 26:
                a aVar22 = new a((com.revolut.feature.card_add_to_googlepay.impl.a) this.f24205w, (dj0.d) this.f24206x, continuation, 26);
                aVar22.v = obj2;
                return aVar22;
            case 27:
                a aVar23 = new a((com.revolut.feature.rev_points.impl.ui.challenges.home.b) this.f24205w, (String) this.f24206x, continuation, 27);
                aVar23.v = obj2;
                return aVar23;
            case 28:
                a aVar24 = new a((SpinnerPickerView) this.f24205w, (SelectFreeStocksScreen) this.f24206x, continuation, 28);
                aVar24.v = obj2;
                return aVar24;
            default:
                return new a((zjh.f) this.v, (wd6.e) this.f24205w, (String) this.f24206x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a) create((p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((a) create((SourcePocketWrapper) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((a) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((a) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((a) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((a) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((a) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((a) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((a) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((a) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((a) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((a) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((a) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((a) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((a) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((a) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((a) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((a) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((a) create((nii.n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((a) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((a) create((SpinnerPickerItemDelegateModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x06b9 A[PHI: r6
      0x06b9: PHI (r6v24 int) = (r6v23 int), (r6v29 int) binds: [B:233:0x06d0, B:226:0x06b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014d  */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r15v33, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: chf.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24205w = obj2;
        this.f24206x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(Function0 function0, com.revolut.biometric_verification.impl.ui.flow.launcher.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 23;
        this.f24205w = (kotlin.jvm.internal.q) function0;
        this.f24206x = dVar;
    }
}
