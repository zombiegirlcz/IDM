package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main;

import com.revolut.feature.insurance_car.impl.data.model.OptionValue;
import com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.CarOnboardingFlowContract$Step;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kl7.d2;
import kl7.f1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ll7.u;
import skm.e0;
import skm.p0;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f75430w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, Set set, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f75430w = set;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f75430w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jVar.X1(vl7.a.c(null, null));
            u uVar = jVar.u;
            String str = ((CarOnboardingFlowContract$State) jVar.A2().f98429a).f75402a.f75166a;
            String str2 = ((CarOnboardingFlowContract$State) jVar.A2().f98429a).f75403b;
            if (str2 == null) {
                throw new IllegalStateException("plan id can not be null");
            }
            Boolean bool = ((CarOnboardingFlowContract$State) jVar.A2().f98429a).d;
            if (bool == null) {
                throw new IllegalStateException("smart driving can not be null");
            }
            boolean zBooleanValue = bool.booleanValue();
            f1 f1Var = ((CarOnboardingFlowContract$State) jVar.A2().f98429a).f75404c;
            if (f1Var == null) {
                throw new IllegalStateException("payment frequency can not be null");
            }
            Set set = this.f75430w;
            ArrayList arrayList = new ArrayList(w.t(set, 10));
            Iterator it8 = set.iterator();
            while (it8.hasNext()) {
                arrayList.add(((OptionValue) it8.next()).f75269a);
            }
            this.u = 1;
            uVar.getClass();
            hve.i iVar = new hve.i(uVar, str, str2, f1Var, zBooleanValue, arrayList, (Continuation) null);
            p0 p0Var = p0.f264001a;
            obj2 = e0.J(elm.f.f127540b, iVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        jVar.s1();
        jVar.E2(new CarOnboardingFlowContract$Step.Reservation(((d2) obj2).f185304a), true, null, false);
        return Unit.f186387a;
    }
}
