package com.revolut.feature.selfserve.sot.impl.ui.flow;

import com.revolut.feature.selfserve.sot.api.models.DocumentType;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$Step;
import gim.i;
import java.util.List;
import kl.c0;
import km2.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import skm.e0;
import vkm.j2;
import xge.f;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeSource f85938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f85939x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, IncomeSource incomeSource, List list, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f85938w = incomeSource;
        this.f85939x = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f85938w, this.f85939x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.coroutines.Continuation] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        DocumentType documentType;
        e eVar = this.v;
        qki.d dVar = eVar.v;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        IncomeSource incomeSource = this.f85938w;
        List list = this.f85939x;
        if (i == 0) {
            o.b(obj2);
            c0 c0Var = eVar.f85941p;
            this.u = 1;
            c0Var.getClass();
            str = null;
            Object objO = e0.o(new n(list, incomeSource, c0Var, (Continuation) null, 24), this);
            if (objO != obj3) {
                objO = Unit.f186387a;
            }
            if (objO == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            str = null;
        }
        List list2 = ((SotFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).d;
        if (Intrinsics.f((list2 == null || (documentType = (DocumentType) d0.d0(list2)) == null) ? str : documentType.f85859a, "OTHER")) {
            yki.a aVar = eVar.f85946w;
            String str2 = ((SotFlowContract$FlowState) ((j2) eVar.v.f22677a).getValue()).f85916j;
            if (str2 == null) {
                str2 = "";
            }
            h.t2(eVar, aVar, new SotFlowContract$Step.OtherDocument(str2), true, null, false, 12);
        } else {
            h.t2(eVar, eVar.f85946w, e.J2(eVar, (DocumentType) d0.b0(list)), true, null, false, 12);
            if (((SotFlowContract$FlowState) ((j2) dVar.f22677a).getValue()).k == null) {
                eVar.n2(new f(eVar, incomeSource, (DocumentType) d0.b0(list), str, 20), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
