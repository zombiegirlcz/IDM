package com.revolut.feature.apm.aani.impl.ui;

import com.revolut.feature.apm.aani.impl.model.AaniRegistrationStatus;
import com.revolut.feature.apm.aani.impl.ui.AaniFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;
import nii.n1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AaniRegistrationStatus.NotRegistered f61131w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f61132x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, AaniRegistrationStatus.NotRegistered notRegistered, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f61131w = notRegistered;
        this.f61132x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, this.f61131w, this.f61132x, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        boolean z = n1Var instanceof l1;
        c cVar = this.v;
        if (z) {
            h.t2(cVar, cVar.v, new AaniFlowContract$Step.Confirmation(this.f61131w.f61117a), this.f61132x, null, false, 12);
        } else {
            h.D2(cVar.v);
        }
        return Unit.f186387a;
    }
}
