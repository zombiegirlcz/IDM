package mx5;

import aw0.n6;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.hub.DebtsV3HubController;
import com.revolut.feature.global_markets.impl.ui.redesign.screen.collection_details.GlobalMarketsCollectionScreen;
import com.revolut.feature.rev_points.impl.ui.learn.RevPointsLearnScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.rebalance.RebalanceDialogScreen;
import gim.i;
import ip0.ui0;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mz3.a0;
import mz3.a1;
import mz3.b0;
import mz3.h0;
import mz3.i2;
import mz3.r1;
import mz3.z1;
import mzb.k;
import n09.f0;
import n09.m0;
import n30.n;
import n4d.r0;
import n87.u;
import n8a.o;
import nii.n1;
import qua.p;
import t7h.s;
import yhm.r;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f210214w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f210214w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g((com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.retail.a) this.f210214w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                return new g((a0) this.v, (PluginPayload) this.f210214w, continuation, 1);
            case 2:
                return new g((h0) this.v, (PluginPayload) this.f210214w, continuation, 2);
            case 3:
                return new g((PluginPayload) this.v, (a1) this.f210214w, continuation, 3);
            case 4:
                return new g((r1) this.v, (PluginPayload) this.f210214w, continuation, 4);
            case 5:
                return new g((z1) this.v, (PluginPayload) this.f210214w, continuation, 5);
            case 6:
                return new g((i2) this.v, (PluginPayload) this.f210214w, continuation, 6);
            case 7:
                return new g((r1) this.v, (PluginPayload) this.f210214w, continuation, 7);
            case 8:
                return new g((b0) this.v, (PluginPayload) this.f210214w, continuation, 8);
            case 9:
                g gVar2 = new g((RevPointsLearnScreen) this.f210214w, continuation, 9);
                gVar2.v = obj2;
                return gVar2;
            case 10:
                g gVar3 = new g((k) this.f210214w, continuation, 10);
                gVar3.v = obj2;
                return gVar3;
            case 11:
                g gVar4 = new g((mzh.e) this.f210214w, continuation, 11);
                gVar4.v = obj2;
                return gVar4;
            case 12:
                g gVar5 = new g((m0) this.f210214w, continuation, 12);
                gVar5.v = obj2;
                return gVar5;
            case 13:
                g gVar6 = new g((com.revolut.feature.rev_points.impl.ui.transactions.details.b) this.f210214w, continuation, 13);
                gVar6.v = obj2;
                return gVar6;
            case 14:
                return new g((n24.c) this.v, (String) this.f210214w, continuation, 14);
            case 15:
                g gVar7 = new g((n) this.f210214w, continuation, 15);
                gVar7.v = obj2;
                return gVar7;
            case 16:
                g gVar8 = new g((com.revolut.feature.store.impl.ui.orders.see_all.a) this.f210214w, continuation, 16);
                gVar8.v = obj2;
                return gVar8;
            case 17:
                g gVar9 = new g((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) this.f210214w, continuation, 17);
                gVar9.v = obj2;
                return gVar9;
            case 18:
                return new g((r0) this.v, (Map) this.f210214w, continuation, 18);
            case 19:
                g gVar10 = new g((n4h.k) this.f210214w, continuation, 19);
                gVar10.v = obj2;
                return gVar10;
            case 20:
                g gVar11 = new g((com.revolut.feature.junior.account_activation.impl.ui.screen.request.c) this.f210214w, continuation, 20);
                gVar11.v = obj2;
                return gVar11;
            case 21:
                g gVar12 = new g((RebalanceDialogScreen) this.f210214w, continuation, 21);
                gVar12.v = obj2;
                return gVar12;
            case 22:
                g gVar13 = new g((com.revolut.feature.wealth.gia.margin_trading.impl.ui.borrowing_interest.a) this.f210214w, continuation, 22);
                gVar13.v = obj2;
                return gVar13;
            case 23:
                g gVar14 = new g((lal.a) this.f210214w, continuation, 23);
                gVar14.v = obj2;
                return gVar14;
            case 24:
                g gVar15 = new g((n7h.b) this.f210214w, continuation, 24);
                gVar15.v = obj2;
                return gVar15;
            case 25:
                g gVar16 = new g((GlobalMarketsCollectionScreen) this.f210214w, continuation, 25);
                gVar16.v = obj2;
                return gVar16;
            case 26:
                g gVar17 = new g((o) this.f210214w, continuation, 26);
                gVar17.v = obj2;
                return gVar17;
            case 27:
                g gVar18 = new g((DebtsV3HubController) this.f210214w, continuation, 27);
                gVar18.v = obj2;
                return gVar18;
            case 28:
                return new g((n9e.i) this.v, (p) this.f210214w, continuation, 28);
            default:
                g gVar19 = new g((com.revolut.feature.junior.isa.impl.ui.jisa_child_trading_creation.a) this.f210214w, continuation, 29);
                gVar19.v = obj2;
                return gVar19;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((iw5.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((g) create((ui0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((g) create((hha.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((g) create((f0[]) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((g) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((g) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((g) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((g) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((g) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((g) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((g) create((t7h.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((g) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((g) create((u) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((g) create((AccountId) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((g) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((g) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022a  */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v18 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx5.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f210214w = obj2;
    }
}
