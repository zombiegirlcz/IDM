package com.revolut.feature.onboarding.impl.onboarding.country.flow;

import com.bumptech.glide.d;
import com.revolut.feature.onboarding.impl.onboarding.country.flow.CountryOfResidenceFlowContract$Step;
import gim.i;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import t89.e;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wi0.b f78414w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ t89.a f78415x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f78416y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, wi0.b bVar, t89.a aVar, List list, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f78414w = bVar;
        this.f78415x = aVar;
        this.f78416y = list;
        this.z = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f78414w, this.f78415x, this.f78416y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e.c cVar = e.c.f268871a;
        e.b bVar = e.b.f268870a;
        c cVar2 = this.v;
        wi0.b bVar2 = this.f78414w;
        if (i == 0) {
            o.b(obj2);
            db9.e eVar = cVar2.f78419p;
            this.u = 1;
            eVar.getClass();
            obj2 = d.s(bVar2) ? bVar : cVar;
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        e eVar2 = (e) obj2;
        boolean zF = Intrinsics.f(eVar2, e.a.f268869a);
        t89.a aVar2 = this.f78415x;
        if (zF) {
            h.t2(cVar2, cVar2.v, new CountryOfResidenceFlowContract$Step.Disclaimer(bVar2, aVar2, this.f78416y), this.z, null, false, 12);
        } else if (Intrinsics.f(eVar2, e.d.f268872a)) {
            h.t2(cVar2, cVar2.v, CountryOfResidenceFlowContract$Step.OnboardingNotAvailableForCountry.f78413a, this.z, null, false, 12);
        } else if (Intrinsics.f(eVar2, e.C1502e.f268873a)) {
            h.t2(cVar2, cVar2.v, CountryOfResidenceFlowContract$Step.NavigateToRetailApp.f78412a, this.z, null, false, 12);
        } else if (Intrinsics.f(eVar2, bVar)) {
            h.t2(cVar2, cVar2.v, CountryOfResidenceFlowContract$Step.IndiaAppRedirection.f78408a, this.z, null, false, 12);
        } else {
            if (!Intrinsics.f(eVar2, cVar)) {
                throw new NoWhenBranchMatchedException();
            }
            cVar2.C2(new pa9.d(bVar2, aVar2));
        }
        return Unit.f186387a;
    }
}
