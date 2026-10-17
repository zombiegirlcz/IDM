package com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation;

import com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.FinancialSituationConfirmationFlowContract$Step;
import elm.f;
import ft3.h1;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import sy3.d;
import yhm.o;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FinancialSituationConfirmationFlowContract$Step f67758w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, FinancialSituationConfirmationFlowContract$Step financialSituationConfirmationFlowContract$Step, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f67758w = financialSituationConfirmationFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f67758w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        c cVar = this.v;
        ix3.a aVar2 = cVar.f67759p;
        h1 h1VarA9 = cVar.f67760q.a9();
        ArrayList arrayList = ((FinancialSituationConfirmationFlowContract$Step.Intro) this.f67758w).f67757a.f266613c.f266608c;
        int iB = q0.b(w.t(arrayList, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            linkedHashMap.put(((sy3.a) it8.next()).f266603a, Boolean.FALSE);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((sy3.a) obj3).f266605c == sy3.b.CUSTOM) {
                arrayList2.add(obj3);
            }
        }
        int iB2 = q0.b(w.t(arrayList2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        Iterator it9 = arrayList2.iterator();
        while (it9.hasNext()) {
            linkedHashMap2.put(((sy3.a) it9.next()).f266603a, null);
        }
        d dVar = new d(linkedHashMap, linkedHashMap2);
        this.u = 1;
        k34.a aVar3 = aVar2.f169334a;
        aVar3.getClass();
        i4g.d dVar2 = new i4g.d(20, h1VarA9, aVar3, dVar, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(f.f127540b, dVar2, this);
        return objJ == aVar ? aVar : objJ;
    }
}
