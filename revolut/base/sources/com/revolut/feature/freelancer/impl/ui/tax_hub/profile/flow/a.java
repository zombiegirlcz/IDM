package com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow;

import an9.t;
import ap7.k;
import au6.d3;
import au6.k3;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.flow.TaxHubProfileFlowContract$Step;
import elm.f;
import gim.i;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import qki.d;
import skm.e0;
import skm.p0;
import u37.j;
import vkm.j2;
import yhm.o;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f74356w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f74356w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f74356w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        b bVar = this.v;
        d dVar = bVar.f74359r;
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.f74356w;
        if (i == 0) {
            o.b(obj2);
            a61.a aVar = bVar.f74357p;
            ds6.j jVarE = jVar.e();
            this.u = 1;
            k3 k3Var = (k3) ((d3) aVar.f1531b);
            k3Var.getClass();
            k kVar = new k(k3Var, jVarE, null, 18);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(f.f127540b, kVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        LinkedHashSet linkedHashSetJ = a1.j(((TaxHubProfileFlowContract$State) ((j2) dVar.f22677a).getValue()).f74354a, jVar.e());
        bVar.H2(dVar, new t(linkedHashSetJ, 16));
        ds6.j jVar2 = (ds6.j) d0.c0(linkedHashSetJ);
        if (jVar2 != null) {
            h.t2(bVar, bVar.f74358q, new TaxHubProfileFlowContract$Step.CreateProfile(jVar2), true, null, false, 12);
        } else {
            bVar.C2(x37.d.f302701a);
        }
        return Unit.f186387a;
    }
}
