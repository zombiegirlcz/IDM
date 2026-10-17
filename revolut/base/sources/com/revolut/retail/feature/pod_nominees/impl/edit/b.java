package com.revolut.retail.feature.pod_nominees.impl.edit;

import com.revolut.feature.address.models.Address;
import com.revolut.retail.feature.pod_nominees.impl.edit.PodNomineeEditScreenContract$LaunchType;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import lek.m;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends i implements Function1 {
    public c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f102597w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.f102597w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.f102597w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PodNominee podNominee;
        Address address;
        c cVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            c cVar2 = this.f102597w;
            PodNomineeEditScreenContract$LaunchType podNomineeEditScreenContract$LaunchType = cVar2.o.f102589a;
            PodNomineeEditScreenContract$LaunchType.Edit edit = podNomineeEditScreenContract$LaunchType instanceof PodNomineeEditScreenContract$LaunchType.Edit ? (PodNomineeEditScreenContract$LaunchType.Edit) podNomineeEditScreenContract$LaunchType : null;
            if (edit == null || (podNominee = edit.f102593a) == null || (address = podNominee.f102620g) == null) {
                return null;
            }
            lek.b bVar = cVar2.f102598p;
            this.u = cVar2;
            this.v = 1;
            Object objJ = ((m) bVar).j(address, this);
            if (objJ == aVar) {
                return aVar;
            }
            cVar = cVar2;
            obj2 = objJ;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = this.u;
            o.b(obj2);
        }
        cVar.H2(cVar.f102602t, new lph.c(((Boolean) obj2).booleanValue(), 8));
        return Unit.f186387a;
    }
}
