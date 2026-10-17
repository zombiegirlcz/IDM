package v44;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.recipients.PixBeneficiary;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.common.viewer.CreditApplicationDocumentViewerScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.transactions.RevolutTransactionsSelectionScreen;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import com.revolut.feature.revolut_x_promo.impl.ui.in_app_install.RevolutXInAppInstallController;
import com.revolut.feature.structured_note.details.impl.ui.common.PayoutScenarioMapper$CalculatorParcel;
import com.revolut.feature.structured_note.details.impl.ui.screens.performance_tracker.pages.terms.PerformanceTrackerTermsController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.models.ManagedPortfolioUnrealisedReturnBreakdown;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.instruments_list.InstrumentsListScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.baggage_selection.TravelFlightsBaggageSelectionScreen;
import com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import v4e.u;
import vaa.f0;
import vb3.s;
import vdl.d1;
import vdl.h0;
import vdl.j1;
import vdl.l1;
import vdl.y;
import vdl.z0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f285939w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f285939w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e((CreditApplicationDocumentViewerScreen) this.f285939w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                return new e((RecipientSelectionScreen) this.v, (NavBarWithToolbar) this.f285939w, continuation, 1);
            case 2:
                e eVar2 = new e((u) this.f285939w, continuation, 2);
                eVar2.v = obj2;
                return eVar2;
            case 3:
                e eVar3 = new e((TravelFlightsBaggageSelectionScreen) this.f285939w, continuation, 3);
                eVar3.v = obj2;
                return eVar3;
            case 4:
                e eVar4 = new e((RevolutXInAppInstallController) this.f285939w, continuation, 4);
                eVar4.v = obj2;
                return eVar4;
            case 5:
                e eVar5 = new e((PerformanceTrackerTermsController) this.f285939w, continuation, 5);
                eVar5.v = obj2;
                return eVar5;
            case 6:
                e eVar6 = new e((com.revolut.feature.travel.flights.impl.ui.screen.discover.a) this.f285939w, continuation, 6);
                eVar6.v = obj2;
                return eVar6;
            case 7:
                e eVar7 = new e((v6f.c) this.f285939w, continuation, 7);
                eVar7.v = obj2;
                return eVar7;
            case 8:
                e eVar8 = new e((v6i.m) this.f285939w, continuation, 8);
                eVar8.v = obj2;
                return eVar8;
            case 9:
                e eVar9 = new e((g7f.b) this.f285939w, continuation, 9);
                eVar9.v = obj2;
                return eVar9;
            case 10:
                e eVar10 = new e((v88.c) this.f285939w, continuation, 10);
                eVar10.v = obj2;
                return eVar10;
            case 11:
                e eVar11 = new e((v8d.m) this.f285939w, continuation, 11);
                eVar11.v = obj2;
                return eVar11;
            case 12:
                e eVar12 = new e((InstrumentsListScreen) this.f285939w, continuation, 12);
                eVar12.v = obj2;
                return eVar12;
            case 13:
                e eVar13 = new e((PixAreaScreen) this.f285939w, continuation, 13);
                eVar13.v = obj2;
                return eVar13;
            case 14:
                e eVar14 = new e((f0) this.f285939w, continuation, 14);
                eVar14.v = obj2;
                return eVar14;
            case 15:
                e eVar15 = new e((s) this.f285939w, continuation, 15);
                eVar15.v = obj2;
                return eVar15;
            case 16:
                e eVar16 = new e((RevolutTransactionsSelectionScreen) this.f285939w, continuation, 16);
                eVar16.v = obj2;
                return eVar16;
            case 17:
                e eVar17 = new e((vb4.s) this.f285939w, continuation, 17);
                eVar17.v = obj2;
                return eVar17;
            case 18:
                return new e((vc2.u) this.v, (Alias) this.f285939w, continuation, 18);
            case 19:
                e eVar18 = new e((vc2.u) this.f285939w, continuation, 19);
                eVar18.v = obj2;
                return eVar18;
            case 20:
                e eVar19 = new e((vdg.f) this.f285939w, continuation, 20);
                eVar19.v = obj2;
                return eVar19;
            case 21:
                e eVar20 = new e((vdl.f) this.f285939w, continuation, 21);
                eVar20.v = obj2;
                return eVar20;
            case 22:
                e eVar21 = new e((vdl.r) this.f285939w, continuation, 22);
                eVar21.v = obj2;
                return eVar21;
            case 23:
                e eVar22 = new e((y) this.f285939w, continuation, 23);
                eVar22.v = obj2;
                return eVar22;
            case 24:
                e eVar23 = new e((h0) this.f285939w, continuation, 24);
                eVar23.v = obj2;
                return eVar23;
            case 25:
                e eVar24 = new e((d1) this.f285939w, continuation, 25);
                eVar24.v = obj2;
                return eVar24;
            case 26:
                e eVar25 = new e((l1) this.f285939w, continuation, 26);
                eVar25.v = obj2;
                return eVar25;
            case 27:
                e eVar26 = new e((ve4.s) this.f285939w, continuation, 27);
                eVar26.v = obj2;
                return eVar26;
            case 28:
                e eVar27 = new e((com.revolut.feature.passcode_reminder.impl.ui.flow.b) this.f285939w, continuation, 28);
                eVar27.v = obj2;
                return eVar27;
            default:
                e eVar28 = new e((ved.o) this.f285939w, continuation, 29);
                eVar28.v = obj2;
                return eVar28;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((v4e.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((PayoutScenarioMapper$CalculatorParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((FlightSearchQuery) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((ManagedPortfolioUnrealisedReturnBreakdown) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((e) create((PixBeneficiary) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((e) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((e) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((e) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((e) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((e) create((z0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((e) create((j1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((e) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((e) create((mii.q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0ac2 A[LOOP:11: B:442:0x0abc->B:444:0x0ac2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0867 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v33, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 3440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v44.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f285939w = obj2;
    }
}
