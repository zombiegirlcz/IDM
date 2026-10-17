package com.revolut.feature.three_ds_verification.impl.ui.sceen;

import ack.n;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.three_ds_verification.impl.ui.sceen.f;
import gim.i;
import ise.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import n14.k;
import nii.h;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ThreeDSTransaction f90426w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, ThreeDSTransaction threeDSTransaction, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f90426w = threeDSTransaction;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f90426w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            n nVar = new n(27);
            q qVar = new q(dVar, this.f90426w, null, 0);
            this.u = 1;
            obj2 = k.V(dVar, null, null, nVar, qVar, this, 3);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((h) obj2) instanceof nii.g) {
            dVar.C2(f.b.f90439a);
        }
        return Unit.f186387a;
    }
}
