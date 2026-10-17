package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favorites_grid;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rcg.p;
import rcg.q;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ q v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ UndoRemoveFavoriteParcel f93934w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q qVar, UndoRemoveFavoriteParcel undoRemoveFavoriteParcel, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
        this.f93934w = undoRemoveFavoriteParcel;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f93934w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            String str = this.f93934w.f93933a;
            this.u = 1;
            q qVar = this.v;
            if (pu7.a.B(qVar.k, str, new p(qVar, str, null), this) == aVar) {
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
