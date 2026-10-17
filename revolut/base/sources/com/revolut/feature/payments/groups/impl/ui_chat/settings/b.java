package com.revolut.feature.payments.groups.impl.ui_chat.settings;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_chat.settings.a;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ks9.f0;
import ks9.h;
import pfm.r;
import ps9.p;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            h hVar = dVar.v;
            PaymentGroup group = ((p) ((j2) dVar.C.f22677a).getValue()).f239437a;
            f0 f0Var = (f0) hVar;
            f0Var.getClass();
            Intrinsics.checkNotNullParameter(group, "group");
            r rVarE = ((mr9.a) f0Var.f189325l).e(group.f79285a);
            this.u = 1;
            if (nim.a.a(rVarE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        dVar.C2(a.C0518a.f79384a);
        return Unit.f186387a;
    }
}
