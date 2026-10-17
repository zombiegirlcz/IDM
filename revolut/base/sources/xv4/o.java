package xv4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.data.model.Data;
import com.revolut.feature.defi.trade.impl.ui.asset_picker.DeFiAssetPickerScreen;
import com.revolut.feature.freelancer.impl.ui.profile.vat.FreelancerVatScreen;
import com.revolut.feature.store.impl.ui.brands.StoreBrandsScreen;
import com.revolut.feature.topup_screen.impl.flows.topup.limits.TopUpLimitsBottomSheetController;
import com.revolut.feature.transport.impl.ui.help.contact.TransportHelpContactScreen;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.AirportLoungesPassActivityScreen;
import ip0.y;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pzd.w;
import rp0.a0;
import v30.c0;
import xyh.t;
import y20.b1;
import y5b.g0;
import y7a.f0;
import y7k.s;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f309198w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f309198w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o((p) this.f309198w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            case 1:
                o oVar2 = new o((TransportHelpContactScreen) this.f309198w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
            case 2:
                o oVar3 = new o((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.collections.buy.flow.a) this.f309198w, continuation, 2);
                oVar3.v = obj2;
                return oVar3;
            case 3:
                o oVar4 = new o((com.revolut.feature.rev_points.giftcards.impl.ui.screen.purchase.a) this.f309198w, continuation, 3);
                oVar4.v = obj2;
                return oVar4;
            case 4:
                o oVar5 = new o((com.revolut.feature.staking.impl.unstake.v2.a) this.f309198w, continuation, 4);
                oVar5.v = obj2;
                return oVar5;
            case 5:
                o oVar6 = new o((xxh.a) this.f309198w, continuation, 5);
                oVar6.v = obj2;
                return oVar6;
            case 6:
                o oVar7 = new o((AirportLoungesPassActivityScreen) this.f309198w, continuation, 6);
                oVar7.v = obj2;
                return oVar7;
            case 7:
                o oVar8 = new o((xy.a) this.f309198w, continuation, 7);
                oVar8.v = ((AnalyticsContext) obj2).f50296a;
                return oVar8;
            case 8:
                o oVar9 = new o((com.revolut.feature.selfserve.sot.impl.ui.flow.e) this.f309198w, continuation, 8);
                oVar9.v = obj2;
                return oVar9;
            case 9:
                o oVar10 = new o((TopUpLimitsBottomSheetController) this.f309198w, continuation, 9);
                oVar10.v = obj2;
                return oVar10;
            case 10:
                return new o((t) this.v, (xyh.d) this.f309198w, continuation);
            case 11:
                o oVar11 = new o((com.revolut.feature.statements.impl.ui.custom_statement.screen.b) this.f309198w, continuation, 11);
                oVar11.v = obj2;
                return oVar11;
            case 12:
                o oVar12 = new o((FreelancerVatScreen) this.f309198w, continuation, 12);
                oVar12.v = obj2;
                return oVar12;
            case 13:
                o oVar13 = new o((y07.l) this.f309198w, continuation, 13);
                oVar13.v = obj2;
                return oVar13;
            case 14:
                o oVar14 = new o((com.revolut.feature.freelancer.impl.ui.sales.new_sale.a) this.f309198w, continuation, 14);
                oVar14.v = obj2;
                return oVar14;
            case 15:
                o oVar15 = new o((y1e.b) this.f309198w, continuation, 15);
                oVar15.v = obj2;
                return oVar15;
            case 16:
                o oVar16 = new o((b1) this.f309198w, continuation, 16);
                oVar16.v = obj2;
                return oVar16;
            case 17:
                o oVar17 = new o((y25.h) this.f309198w, continuation, 17);
                oVar17.v = obj2;
                return oVar17;
            case 18:
                o oVar18 = new o((StoreBrandsScreen) this.f309198w, continuation, 18);
                oVar18.v = obj2;
                return oVar18;
            case 19:
                o oVar19 = new o((y44.m) this.f309198w, continuation, 19);
                oVar19.v = obj2;
                return oVar19;
            case 20:
                o oVar20 = new o((y4b.c) this.f309198w, continuation, 20);
                oVar20.v = obj2;
                return oVar20;
            case 21:
                o oVar21 = new o((com.revolut.feature.settings.preview.displayCurrency.a) this.f309198w, continuation, 21);
                oVar21.v = obj2;
                return oVar21;
            case 22:
                o oVar22 = new o((y4e.i) this.f309198w, continuation, 22);
                oVar22.v = obj2;
                return oVar22;
            case 23:
                o oVar23 = new o((y4h.g) this.f309198w, continuation, 23);
                oVar23.v = obj2;
                return oVar23;
            case 24:
                o oVar24 = new o((g0) this.f309198w, continuation, 24);
                oVar24.v = obj2;
                return oVar24;
            case 25:
                o oVar25 = new o((y5g.k) this.f309198w, continuation, 25);
                oVar25.v = obj2;
                return oVar25;
            case 26:
                o oVar26 = new o((DeFiAssetPickerScreen) this.f309198w, continuation, 26);
                oVar26.v = obj2;
                return oVar26;
            case 27:
                o oVar27 = new o((y6b.k) this.f309198w, continuation, 27);
                oVar27.v = obj2;
                return oVar27;
            case 28:
                o oVar28 = new o((f0) this.f309198w, continuation, 28);
                oVar28.v = obj2;
                return oVar28;
            default:
                o oVar29 = new o((com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a) this.f309198w, continuation, 29);
                oVar29.v = obj2;
                return oVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((o) create((xvf.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((o) create((a0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((o) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((o) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((o) create((xxi.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((o) create(new AnalyticsContext(((AnalyticsContext) obj2).f50296a), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((o) create((kii.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((o) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((o) create((w) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((o) create((y17.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((o) create((c0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((o) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((o) create((zn.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((o) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((o) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((o) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((o) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x033f  */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 1810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xv4.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, xyh.d dVar, Continuation continuation) {
        super(2, continuation);
        this.u = 10;
        this.v = tVar;
        this.f309198w = dVar;
    }
}
