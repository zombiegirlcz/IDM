package com.revolut.feature.backgroundpicker.impl.flow.catalogue;

import bn2.f;
import com.revolut.feature.backgroundpicker.impl.flow.catalogue.BackgroundCatalogControllerContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BackgroundCatalogControllerContract$ModalStep f63750w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, BackgroundCatalogControllerContract$ModalStep backgroundCatalogControllerContract$ModalStep, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f63750w = backgroundCatalogControllerContract$ModalStep;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f63750w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            f fVar = this.v.f63751p;
            String str = ((BackgroundCatalogControllerContract$ModalStep.DeleteConfirmation) this.f63750w).f63749a;
            this.u = 1;
            if (fVar.a(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
