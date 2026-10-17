package com.revolut.feature.payments_migration.impl.ui.screen.search;

import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.ui.screen.search.SearchInBlockControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o7.d;
import oki.h;
import p6a.g;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Provider f80289w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Provider provider, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f80289w = provider;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f80289w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d dVar = bVar.o;
            this.u = 1;
            obj2 = dVar.i(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        if (((Number) obj2).intValue() <= 0) {
            h.v2(bVar.v, SearchInBlockControllerContract$ModalStep.NoCards.f80287a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            bVar.C2(new g(this.f80289w, x5a.b.CARD_PAYMENT, bVar.f80293s.d));
        }
        return Unit.f186387a;
    }
}
