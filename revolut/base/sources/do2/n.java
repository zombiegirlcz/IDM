package do2;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import dcf.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import nii.l0;
import nii.m0;
import nii.y0;
import nii.z;
import vkm.j2;
import zh9.u0;
import zhm.a0;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f116387w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116387w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f116387w, continuation, 0);
            default:
                return new n(this.f116387w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        String str;
        Object objB0;
        fo2.o oVar;
        m0 zVar;
        switch (this.u) {
            case 0:
                q qVar = this.f116387w;
                y yVar = qVar.f116393s;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    fo2.j jVar = qVar.f116390p;
                    BankAccountSwitchingFormScreenContract$InputData bankAccountSwitchingFormScreenContract$InputData = qVar.o;
                    mn2.a aVar2 = bankAccountSwitchingFormScreenContract$InputData.f63905a;
                    wn2.a aVar3 = bankAccountSwitchingFormScreenContract$InputData.f63907c;
                    wn2.d dVar = bankAccountSwitchingFormScreenContract$InputData.f63906b;
                    this.v = 1;
                    objA = jVar.a(aVar2, aVar3, dVar, this);
                    if (objA == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                Data data = (Data) objA;
                if (data.getContent() == null) {
                    qVar.H2(yVar, new g0(data, 29));
                } else {
                    fo2.a aVar4 = (fo2.a) zi0.c.I(data);
                    ArrayList<fo2.l> arrayList = aVar4.f136780a;
                    int iB = q0.b(w.t(arrayList, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (fo2.l lVar : arrayList) {
                        String str2 = lVar.f136789a;
                        ArrayList arrayList2 = lVar.f136791c;
                        ArrayList<fo2.b> arrayList3 = new ArrayList();
                        Iterator it8 = arrayList2.iterator();
                        while (it8.hasNext()) {
                            a0.x(((fo2.k) it8.next()).f136788b, arrayList3);
                        }
                        int iB2 = q0.b(w.t(arrayList3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                        for (fo2.b bVar : arrayList3) {
                            linkedHashMap2.put(bVar.c(), bVar.b());
                        }
                        linkedHashMap.put(str2, foh.i.f(linkedHashMap2));
                    }
                    fo2.l lVar2 = (fo2.l) d0.d0(arrayList);
                    if (lVar2 == null || (str = lVar2.f136789a) == null) {
                        m70.a.c(t0.f186434a);
                        str = "";
                    }
                    qVar.H2(yVar, new dcl.m0(aVar4, new FormState(linkedHashMap, str), 28));
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                q qVar2 = this.f116387w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    cpb.j jVar2 = new cpb.j(qVar2, continuation, 13);
                    this.v = 1;
                    objB0 = u0.b0(qVar2.X(), "CONTINUE_BUTTON_LOADING", jVar2, this);
                    if (objB0 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB0 = obj2;
                }
                fo2.p pVar = (fo2.p) objB0;
                fo2.m mVar = pVar.f136796b;
                FormData formData = pVar.f136797c;
                if (mVar == null || (oVar = pVar.f136795a) == null) {
                    qVar2.C2(new h(((g) ((j2) qVar2.f116393s.f22677a).getValue()).f116375b, formData));
                } else {
                    TextLocalisedClause textLocalisedClauseL2 = q.L2(mVar.f136792a);
                    wn2.c cVar = mVar.f136793b;
                    TextLocalisedClause textLocalisedClauseL22 = cVar != null ? q.L2(cVar) : null;
                    TextLocalisedClause textLocalisedClauseL23 = q.L2(mVar.f136794c);
                    wn2.c cVar2 = mVar.d;
                    TextLocalisedClause textLocalisedClauseL24 = cVar2 != null ? q.L2(cVar2) : null;
                    int i3 = m.f116386b[oVar.ordinal()];
                    if (i3 == 1) {
                        zVar = new z(textLocalisedClauseL2, textLocalisedClauseL22, textLocalisedClauseL23, textLocalisedClauseL24, null, null, false, null, null, null, null, null, null, 32724);
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zVar = new l0(textLocalisedClauseL2, textLocalisedClauseL22, null, textLocalisedClauseL23, textLocalisedClauseL24, null, false, null, 996);
                    }
                    yji.l.b1(qVar2, qVar2.X1(new y0("ID_FORM_VALIDATION_ERROR_DIALOG", zVar, false, 4)), null, new chf.a(qVar2, formData, continuation, 14), 3);
                }
                return Unit.f186387a;
        }
    }
}
