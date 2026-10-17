package a26;

import ael.h0;
import ael.j1;
import amh.x;
import b4g.u;
import cbh.e0;
import cbh.n0;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.common.screen.counterpart_chooser.SharedFavouritesCounterpartChooserScreen;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;
import nii.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f688w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f689x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cam.t tVar, Object obj2, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 25;
        this.f689x = tVar;
        this.v = obj2;
        this.f688w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q qVar = new q((mp.p) this.f689x, (xi0.b) this.f688w, continuation, 0);
                qVar.v = obj2;
                return qVar;
            case 1:
                q qVar2 = new q((hd.r) this.f689x, (xi0.b) this.f688w, continuation, 1);
                qVar2.v = obj2;
                return qVar2;
            case 2:
                return new q((a44.d) this.v, (String) this.f689x, (ArrayList) this.f688w, continuation, 2);
            case 3:
                return new q((a44.d) this.v, (String) this.f689x, (ry3.a) this.f688w, continuation, 3);
            case 4:
                q qVar3 = new q((a5h.f) this.f689x, (nel.n) this.f688w, continuation, 4);
                qVar3.v = obj2;
                return qVar3;
            case 5:
                q qVar4 = new q((a62.b) this.f689x, (Function0) this.f688w, continuation, 5);
                qVar4.v = obj2;
                return qVar4;
            case 6:
                q qVar5 = new q((r10.r) this.f689x, (String) this.f688w, continuation, 6);
                qVar5.v = obj2;
                return qVar5;
            case 7:
                q qVar6 = new q((ab4.s) this.f689x, (y0) this.f688w, continuation, 7);
                qVar6.v = obj2;
                return qVar6;
            case 8:
                q qVar7 = new q((aci.h) this.f689x, (wi0.b) this.f688w, continuation, 8);
                qVar7.v = obj2;
                return qVar7;
            case 9:
                q qVar8 = new q((a5h.g) this.f689x, (String) this.f688w, continuation, 9);
                qVar8.v = obj2;
                return qVar8;
            case 10:
                q qVar9 = new q((h0) this.f689x, (cfl.p[]) this.f688w, continuation, 10);
                qVar9.v = obj2;
                return qVar9;
            case 11:
                q qVar10 = new q(continuation, (Map) this.f689x, (j1) this.f688w);
                qVar10.v = obj2;
                return qVar10;
            case 12:
                q qVar11 = new q((ybl.n) this.f689x, (x) this.f688w, continuation, 12);
                qVar11.v = obj2;
                return qVar11;
            case 13:
                q qVar12 = new q((IncomeSorter) this.f689x, (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.d) this.f688w, continuation, 13);
                qVar12.v = obj2;
                return qVar12;
            case 14:
                q qVar13 = new q((com.revolut.feature.apm.bills.pagopa.impl.ui.flow.a) this.f689x, (String) this.f688w, continuation, 14);
                qVar13.v = obj2;
                return qVar13;
            case 15:
                q qVar14 = new q((Set) this.f689x, (arb.g) this.f688w, continuation, 15);
                qVar14.v = obj2;
                return qVar14;
            case 16:
                q qVar15 = new q((u) this.f689x, (String) this.f688w, continuation, 16);
                qVar15.v = obj2;
                return qVar15;
            case 17:
                q qVar16 = new q((b4h.c) this.f689x, (nel.n) this.f688w, continuation, 17);
                qVar16.v = obj2;
                return qVar16;
            case 18:
                q qVar17 = new q((bba.s) this.f689x, (String) this.f688w, continuation, 18);
                qVar17.v = obj2;
                return qVar17;
            case 19:
                q qVar18 = new q((com.revolut.feature.retail.salary_account.impl.flow.ui.d) this.f689x, (bgb.c) this.f688w, continuation, 19);
                qVar18.v = obj2;
                return qVar18;
            case 20:
                q qVar19 = new q((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.otp.number_transfer_confirmation.e) this.f689x, (pfj.i) this.f688w, continuation, 20);
                qVar19.v = obj2;
                return qVar19;
            case 21:
                q qVar20 = new q((ArrayList) this.f689x, (bpd.e) this.f688w, continuation, 21);
                qVar20.v = obj2;
                return qVar20;
            case 22:
                q qVar21 = new q((bpd.e) this.f689x, (String) this.f688w, continuation, 22);
                qVar21.v = obj2;
                return qVar21;
            case 23:
                q qVar22 = new q((com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.a) this.f689x, (String) this.f688w, continuation, 23);
                qVar22.v = obj2;
                return qVar22;
            case 24:
                return new q((c10.e) this.v, (e10.q) this.f689x, (e10.j) this.f688w, continuation, 24);
            case 25:
                return new q((cam.t) this.f689x, this.v, (String) this.f688w, continuation);
            case 26:
                q qVar23 = new q((n0) this.f689x, (s) this.f688w, continuation, 26);
                qVar23.v = obj2;
                return qVar23;
            case 27:
                q qVar24 = new q((e0) this.f689x, (n0) this.f688w, continuation, 27);
                qVar24.v = obj2;
                return qVar24;
            case 28:
                q qVar25 = new q((cfa.g) this.f689x, (dj0.d) this.f688w, continuation, 28);
                qVar25.v = obj2;
                return qVar25;
            default:
                q qVar26 = new q((NavBarWithToolbar) this.f689x, (SharedFavouritesCounterpartChooserScreen) this.f688w, continuation, 29);
                qVar26.v = obj2;
                return qVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((q) create((Map) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((q) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((q) create((wbl.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((q) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((q) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((q) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((q) create((pcd.s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((q) create((lk0.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((q) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((q) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((q) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:300:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0863  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 2922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a26.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f689x = obj3;
        this.f688w = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f689x = obj2;
        this.f688w = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Continuation continuation, Map map, j1 j1Var) {
        super(2, continuation);
        this.u = 11;
        this.f689x = map;
        this.f688w = j1Var;
    }
}
