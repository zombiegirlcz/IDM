package com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions;

import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.MigrateSubscriptionsControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import g6a.f;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import o7.d;
import oki.h;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Provider f80264w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Provider provider, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f80264w = provider;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f80264w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        c cVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d dVar = cVar.f80266q;
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
            h.v2(cVar.f80270w, MigrateSubscriptionsControllerContract$ModalStep.NoCards.f80261a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            cVar.C2(new g6a.i(this.f80264w, x5a.b.CARD_PAYMENT, ((f) ((j2) cVar.v.f22677a).getValue()).f));
        }
        return Unit.f186387a;
    }
}
