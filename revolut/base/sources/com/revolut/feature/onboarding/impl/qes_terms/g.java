package com.revolut.feature.onboarding.impl.qes_terms;

import com.revolut.feature.onboarding.impl.qes_terms.QesTermsFlowContract$Step;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends i implements Function1 {
    public final /* synthetic */ ArrayList A;
    public oki.h u;
    public yki.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f78559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f78560x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f78561y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.z = hVar;
        this.A = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yki.b bVar;
        List list;
        oki.h hVar;
        Integer num;
        yki.b bVar2;
        oki.h hVar2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f78561y;
        h hVar3 = this.z;
        if (i == 0) {
            o.b(obj2);
            yki.i iVar = hVar3.A;
            cn0.c cVar = hVar3.f78565s;
            this.u = hVar3;
            this.v = iVar;
            ArrayList arrayList = this.A;
            this.f78559w = arrayList;
            this.f78561y = 1;
            Object objA = cVar.a(this);
            if (objA != aVar) {
                bVar = iVar;
                obj2 = objA;
                list = arrayList;
                hVar = hVar3;
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            num = this.f78560x;
            list = this.f78559w;
            yki.b bVar3 = this.v;
            oki.h hVar4 = this.u;
            o.b(obj2);
            bVar2 = bVar3;
            hVar2 = hVar4;
            oki.h.t2(hVar2, bVar2, new QesTermsFlowContract$Step.Passcode(list, num, (rl0.d) obj2), true, null, false, 12);
            return Unit.f186387a;
        }
        list = this.f78559w;
        bVar = this.v;
        hVar = this.u;
        o.b(obj2);
        Integer num2 = ((zm0.a) obj2).f323318a;
        cn0.e eVar = hVar3.z;
        this.u = hVar;
        this.v = bVar;
        this.f78559w = list;
        this.f78560x = num2;
        this.f78561y = 2;
        Object objA2 = eVar.a(this);
        if (objA2 != aVar) {
            num = num2;
            obj2 = objA2;
            bVar2 = bVar;
            hVar2 = hVar;
            oki.h.t2(hVar2, bVar2, new QesTermsFlowContract$Step.Passcode(list, num, (rl0.d) obj2), true, null, false, 12);
            return Unit.f186387a;
        }
        return aVar;
    }
}
