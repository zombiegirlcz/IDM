package e8e;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model.PersonalDetailsForm;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f123656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f123657x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a aVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 18;
        this.f123656w = aVar;
        this.f123657x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v36, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w((x) this.f123656w, (sua.b) this.f123657x, continuation, 0);
            case 1:
                return new w((e8h.e) this.f123656w, (xi0.b) this.f123657x, continuation, 1);
            case 2:
                return new w((e8h.j) this.f123656w, (ArrayList) this.f123657x, continuation, 2);
            case 3:
                return new w(this.f123656w, (e9d.z) this.f123657x, continuation, 3);
            case 4:
                return new w((e9d.z) this.f123656w, (String) this.f123657x, continuation, 4);
            case 5:
                return new w((e9d.z) this.f123656w, (hj0.b) this.f123657x, continuation, 5);
            case 6:
                return new w((com.revolut.feature.revolutpay.management.impl.ui.management.home.a) this.f123657x, continuation, 6);
            case 7:
                return new w((ebi.j) this.f123656w, (String) this.f123657x, continuation, 7);
            case 8:
                w wVar = new w((ec6.m) this.f123657x, continuation, 8);
                wVar.f123656w = obj2;
                return wVar;
            case 9:
                return new w((eci.b) this.f123656w, (List) this.f123657x, continuation, 9);
            case 10:
                w wVar2 = new w((eed.h) this.f123657x, continuation, 10);
                wVar2.f123656w = obj2;
                return wVar2;
            case 11:
                w wVar3 = new w((efb.a) this.f123657x, continuation, 11);
                wVar3.f123656w = obj2;
                return wVar3;
            case 12:
                w wVar4 = new w((efb.b) this.f123657x, continuation, 12);
                wVar4.f123656w = obj2;
                return wVar4;
            case 13:
                w wVar5 = new w((efb.c) this.f123657x, continuation, 13);
                wVar5.f123656w = obj2;
                return wVar5;
            case 14:
                w wVar6 = new w((efb.j) this.f123657x, continuation, 14);
                wVar6.f123656w = obj2;
                return wVar6;
            case 15:
                return new w((eg2.u) this.f123656w, (eg2.m) this.f123657x, continuation, 15);
            case 16:
                return new w((com.revolut.feature.credit.application.plugins.impl.ui.personal_details.a) this.f123656w, (it3.d) this.f123657x, continuation, 16);
            case 17:
                return new w((egf.c) this.f123656w, (String) this.f123657x, continuation, 17);
            case 18:
                return new w((com.revolut.feature.checklist_challenges_ui.impl.ui.checklist_collection.a) this.f123656w, (Function1) this.f123657x, continuation);
            case 19:
                return new w((eh9.z) this.f123656w, (yof.b) this.f123657x, continuation, 19);
            case 20:
                return new w((eh9.z) this.f123656w, (h1j.d) this.f123657x, continuation, 20);
            case 21:
                w wVar7 = new w((ehk.d) this.f123657x, continuation, 21);
                wVar7.f123656w = obj2;
                return wVar7;
            case 22:
                return new w((com.revolut.feature.apm.wero.impl.ui.p2m.b) this.f123656w, (sh2.a) this.f123657x, continuation, 22);
            case 23:
                return new w((ei3.m) this.f123656w, (AccountId) this.f123657x, continuation, 23);
            case 24:
                return new w((ei3.m) this.f123656w, (CheckoutParams) this.f123657x, continuation, 24);
            case 25:
                return new w((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e) this.f123656w, (PersonalDetailsForm) this.f123657x, continuation, 25);
            case 26:
                return new w((com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.e) this.f123656w, (String) this.f123657x, continuation, 26);
            case 27:
                return new w((eic.t) this.f123656w, (String) this.f123657x, continuation, 27);
            case 28:
                return new w((eif.d) this.f123656w, (ArrayList) this.f123657x, continuation, 28);
            default:
                return new w((eif.k) this.f123656w, (Set) this.f123657x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((w) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:435:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v21, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e8e.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f123656w = obj2;
        this.f123657x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f123657x = obj2;
    }
}
