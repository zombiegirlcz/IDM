package com.revolut.feature.tab.accounts.impl.ui.spaces;

import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import pie.v;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SpaceContentListMapper$ItemParcel f89631w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, SpaceContentListMapper$ItemParcel spaceContentListMapper$ItemParcel, Continuation continuation) {
        super(1, continuation);
        this.v = iVar;
        this.f89631w = spaceContentListMapper$ItemParcel;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f89631w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            xge.a aVar = this.v.f89638q;
            SpaceContentListMapper$ItemParcel.SubspaceHeader subspaceHeader = (SpaceContentListMapper$ItemParcel.SubspaceHeader) this.f89631w;
            ProductSpaceIdentifier productSpaceIdentifier = subspaceHeader.f89617a;
            v vVar = subspaceHeader.f89618b;
            this.u = 1;
            xge.g gVar = (xge.g) aVar;
            gVar.getClass();
            xge.f fVar = new xge.f(productSpaceIdentifier, vVar, gVar, null, 0);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, fVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
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
