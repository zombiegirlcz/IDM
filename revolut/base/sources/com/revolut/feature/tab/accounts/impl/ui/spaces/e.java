package com.revolut.feature.tab.accounts.impl.ui.spaces;

import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ SpaceContentListMapper$ItemParcel v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f89630w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, SpaceContentListMapper$ItemParcel spaceContentListMapper$ItemParcel, Continuation continuation) {
        super(2, continuation);
        this.v = spaceContentListMapper$ItemParcel;
        this.f89630w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.f89630w, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        nie.b bVar = ((SpaceContentListMapper$ItemParcel.PendingItem) this.v).f89613c;
        String str = "product pending action " + bVar.f215684a;
        i iVar = this.f89630w;
        a2j.c cVar = new a2j.c(iVar, bVar, null, 18);
        this.u = 1;
        Object objB = pu7.a.B(iVar.k, str, cVar, this);
        return objB == aVar ? aVar : objB;
    }
}
