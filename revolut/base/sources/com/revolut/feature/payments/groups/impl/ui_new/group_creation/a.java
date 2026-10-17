package com.revolut.feature.payments.groups.impl.ui_new.group_creation;

import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreenContract$ModalSteps;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nt9.g;
import oki.h;
import vkm.j2;
import yhm.o;
import zs9.e;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public xi0.b u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f79481w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f79481w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f79481w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        b bVar2 = this.f79481w;
        if (i == 0) {
            o.b(obj2);
            xi0.b bVar3 = ((g) ((j2) bVar2.f79487w.f22677a).getValue()).e;
            e eVar = bVar2.o;
            this.u = bVar3;
            this.v = 1;
            Serializable serializableB = eVar.f324833b.b(this);
            if (serializableB == aVar) {
                return aVar;
            }
            bVar = bVar3;
            obj2 = serializableB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = this.u;
            o.b(obj2);
        }
        h.v2(bVar2.v, new GroupCreationScreenContract$ModalSteps.CurrencySelector((List) obj2, bVar), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
