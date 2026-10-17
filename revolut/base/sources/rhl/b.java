package rhl;

import ba6.t;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.travel.experiences.impl.ui.screen.options_v2.model.TravelExperienceOptionSelectionV2;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import ft3.h1;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import mii.q;
import prl.e;
import qb4.f;
import rnd.y;
import rp1.j;
import rqd.k;
import s15.l;
import s2g.w;
import s6e.z;
import s8a.c;
import sa6.j0;
import sbb.d0;
import skm.a2;
import vkm.d;
import xo1.h;
import xy3.s;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f254528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f254529x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f254530y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254528w = obj2;
        this.f254529x = obj3;
        this.f254530y = obj4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b((e) this.f254528w, (List) this.f254529x, (List) this.f254530y, continuation, 0);
            case 1:
                b bVar = new b((com.revolut.feature.confirmation_code.ui.otp.a) this.f254529x, (String) this.f254530y, continuation, 1);
                bVar.f254528w = obj2;
                return bVar;
            case 2:
                b bVar2 = new b((y) this.f254530y, continuation, 2);
                bVar2.f254529x = obj2;
                return bVar2;
            case 3:
                b bVar3 = new b((y) this.f254530y, continuation, 3);
                bVar3.f254529x = obj2;
                return bVar3;
            case 4:
                return new b((com.revolut.retail.feature.esim.impl.ui.screens.troubleshooting.a) this.f254529x, (String) this.f254530y, continuation, 4);
            case 5:
                return new b((j) this.f254528w, (String) this.f254529x, (h) this.f254530y, continuation, 5);
            case 6:
                b bVar4 = new b((k) this.f254529x, (String) this.f254530y, continuation, 6);
                bVar4.f254528w = obj2;
                return bVar4;
            case 7:
                b bVar5 = new b((rs2.b) this.f254530y, continuation, 7);
                bVar5.f254529x = obj2;
                return bVar5;
            case 8:
                return new b((rwb.h) this.f254528w, (VoucherProduct) this.f254529x, (String) this.f254530y, continuation, 8);
            case 9:
                return new b((s09.k) this.f254529x, (ArrayList) this.f254530y, continuation, 9);
            case 10:
                return new b((s0e.b) this.f254530y, continuation, 10);
            case 11:
                return new b((l) this.f254528w, (ty0.a) this.f254529x, (String) this.f254530y, continuation, 11);
            case 12:
                return new b((s24.a) this.f254529x, (String) this.f254530y, continuation, 12);
            case 13:
                return new b((s24.a) this.f254529x, (h1) this.f254530y, continuation, 13);
            case 14:
                b bVar6 = new b((w) this.f254529x, (TravelExperienceOptionSelectionV2) this.f254530y, continuation, 14);
                bVar6.f254528w = obj2;
                return bVar6;
            case 15:
                return new b((s34.b) this.f254528w, (h1) this.f254529x, (s) this.f254530y, continuation, 15);
            case 16:
                return new b((com.revolut.feature.defi.remittances.impl.ui.send.amount.b) this.f254528w, (DeFiBalance) this.f254529x, (DeFiAssetDetails) this.f254530y, continuation, 16);
            case 17:
                b bVar7 = new b((com.revolut.feature.credit.loan.impl.ui.rev10.changerepaymentday.selectday_v2.a) this.f254530y, continuation, 17);
                bVar7.f254529x = obj2;
                return bVar7;
            case 18:
                b bVar8 = new b((z) this.f254529x, (Set) this.f254530y, continuation, 18);
                bVar8.f254528w = obj2;
                return bVar8;
            case 19:
                b bVar9 = new b((s78.h) this.f254529x, (String) this.f254530y, continuation, 19);
                bVar9.f254528w = obj2;
                return bVar9;
            case 20:
                return new b((c) this.f254528w, (AccountId) this.f254529x, (String) this.f254530y, continuation, 20);
            case 21:
                b bVar10 = new b((sa0.k) this.f254529x, (rp0.y) this.f254530y, continuation, 21);
                bVar10.f254528w = obj2;
                return bVar10;
            case 22:
                return new b((j0) this.f254528w, (t) this.f254529x, (String) this.f254530y, continuation, 22);
            case 23:
                return new b((com.revolut.feature.credit.application.plugins.impl.ui.financial_evidence.flow.e) this.f254528w, (f) this.f254529x, (yki.l) this.f254530y, continuation, 23);
            case 24:
                b bVar11 = new b((d0) this.f254529x, (rla.b) this.f254530y, continuation, 24);
                bVar11.f254528w = obj2;
                return bVar11;
            case 25:
                return new b((sbd.h) this.f254528w, (String) this.f254529x, (String) this.f254530y, continuation, 25);
            case 26:
                b bVar12 = new b((sde.e) this.f254529x, (String) this.f254530y, continuation, 26);
                bVar12.f254528w = obj2;
                return bVar12;
            case 27:
                b bVar13 = new b((d) this.f254529x, continuation, (a2) this.f254530y);
                bVar13.f254528w = obj2;
                return bVar13;
            case 28:
                return new b((sf3.i) this.f254529x, (jf0.c) this.f254530y, continuation, 28);
            default:
                b bVar14 = new b((sl1.c) this.f254530y, continuation, 29);
                bVar14.f254529x = obj2;
                return bVar14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((b) create((AnalyticsAccountsSelection) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((b) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((b) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x05db, code lost:
    
        if (s09.k.b3(r0, r2, r41) == r4) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0604, code lost:
    
        if (s09.k.Z2(r0, r2, r41) == r4) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0192, code lost:
    
        if (r0.c(r41, r7, true) == r2) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:510:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:512:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v20 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rhl.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254529x = obj2;
        this.f254530y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f254530y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation, a2 a2Var) {
        super(2, continuation);
        this.u = 27;
        this.f254529x = dVar;
        this.f254530y = a2Var;
    }
}
