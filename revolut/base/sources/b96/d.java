package b96;

import android.graphics.Bitmap;
import bfh.o;
import bg2.x;
import bh8.u;
import bld.m;
import btb.l;
import c2d.x0;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.onboarding.impl.onboarding.workflow.OnboardingWorkflowFlowContract$Step;
import com.revolut.feature.slot_manager.impl.ui.custom_rating.FeedbackBundle;
import ecg.j;
import gim.i;
import hd.r;
import i2l.p;
import ig8.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import m1c.l0;
import nel.n;
import nii.n1;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f13668w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f13669x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f13670y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(x0 x0Var, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.u = 28;
        this.f13669x = x0Var;
        this.f13670y = str;
        this.v = i;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((e) this.f13669x, (xi0.b) this.f13670y, continuation, 0);
                dVar.f13668w = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((ArrayList) this.f13669x, (com.revolut.feature_retail_user_declarations.bank_terms.a) this.f13670y, continuation, 1);
                dVar2.f13668w = obj2;
                return dVar2;
            case 2:
                return new d((String) this.f13668w, (String) this.f13669x, (bb.b) this.f13670y, continuation, 2);
            case 3:
                return new d((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.amendment_confirmation.a) this.f13668w, (j) this.f13669x, (cgi.f) this.f13670y, continuation, 3);
            case 4:
                return new d((r) this.f13668w, (String) this.f13669x, (com.revolut.feature.credit_card.autopay.api.models_v3.b) this.f13670y, continuation, 4);
            case 5:
                return new d((r) this.f13668w, (String) this.f13669x, (nb5.f) this.f13670y, continuation, 5);
            case 6:
                return new d((r) this.f13668w, (String) this.f13669x, (String) this.f13670y, continuation, 6);
            case 7:
                return new d((r) this.f13668w, (String) this.f13669x, (com.revolut.feature.credit_card.autopay.api.models_v3.c) this.f13670y, continuation, 7);
            case 8:
                return new d((bc9.j) this.f13668w, (til.r) this.f13669x, (OnboardingWorkflowFlowContract$Step) this.f13670y, continuation, 8);
            case 9:
                return new d((String) this.f13668w, (bd2.e) this.f13669x, (List) this.f13670y, continuation, 9);
            case 10:
                return new d((dii.g) this.f13668w, (com.revolut.feature.revolutpay.shared.ui.pay_with_any.a) this.f13669x, (String) this.f13670y, continuation, 10);
            case 11:
                return new d((o) this.f13668w, (String) this.f13669x, (n) this.f13670y, continuation, 11);
            case 12:
                return new d((x) this.f13668w, (String) this.f13669x, (AccountId) this.f13670y, continuation, 12);
            case 13:
                d dVar3 = new d((u) this.f13669x, (k) this.f13670y, continuation, 13);
                dVar3.f13668w = obj2;
                return dVar3;
            case 14:
                d dVar4 = new d((bi2.f) this.f13670y, continuation, 14);
                dVar4.f13668w = obj2;
                return dVar4;
            case 15:
                return new d((Ref$ObjectRef) this.f13668w, (wdb.b) this.f13669x, (wgb.n) this.f13670y, continuation, 15);
            case 16:
                return new d((bke.x) this.f13670y, continuation, 16);
            case 17:
                return new d((m) this.f13668w, (FeedbackBundle) this.f13669x, (String) this.f13670y, continuation, 17);
            case 18:
                d dVar5 = new d((FlowCollector) this.f13669x, (blm.f) this.f13670y, continuation, 18);
                dVar5.f13668w = obj2;
                return dVar5;
            case 19:
                return new d(this.f13668w, (bmb.u) this.f13669x, (String) this.f13670y, continuation, 19);
            case 20:
                return new d((bn2.f) this.f13669x, (Bitmap) this.f13670y, continuation, 20);
            case 21:
                return new d((com.revolut.feature.tax_residency.impl.flows.missing.b) this.f13668w, (List) this.f13669x, (List) this.f13670y, continuation, 21);
            case 22:
                return new d((com.revolut.sso.impl.ui.signin_sessions_flow.a) this.f13668w, (cql.f) this.f13669x, (oki.g) this.f13670y, continuation, 22);
            case 23:
                return new d((l) this.f13668w, (jai.e) this.f13669x, (plc.i) this.f13670y, continuation, 23);
            case 24:
                d dVar6 = new d((bvb.r) this.f13669x, (rub.j) this.f13670y, continuation, 24);
                dVar6.f13668w = obj2;
                return dVar6;
            case 25:
                return new d((bzb.a) this.f13668w, (l0) this.f13669x, (dzb.f) this.f13670y, continuation, 25);
            case 26:
                d dVar7 = new d((c0f.d) this.f13670y, continuation, 26);
                dVar7.f13668w = obj2;
                return dVar7;
            case 27:
                return new d((c0f.d) this.f13668w, (String) this.f13669x, (String) this.f13670y, continuation, 27);
            case 28:
                d dVar8 = new d((x0) this.f13669x, (String) this.f13670y, this.v, continuation);
                dVar8.f13668w = obj2;
                return dVar8;
            default:
                return new d((p) this.f13668w, (com.revolut.retail.feature.travel_status.impl.ui.flow.b) this.f13669x, (String) this.f13670y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:507:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:519:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b96.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f13668w = obj2;
        this.f13669x = obj3;
        this.f13670y = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f13669x = obj2;
        this.f13670y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f13670y = obj2;
    }
}
