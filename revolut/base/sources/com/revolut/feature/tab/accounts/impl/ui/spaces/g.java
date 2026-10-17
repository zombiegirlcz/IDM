package com.revolut.feature.tab.accounts.impl.ui.spaces;

import aie.y;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import sfe.m;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ SpaceContentListMapper$ItemParcel v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f89632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ vh f89633x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SpaceContentListMapper$ItemParcel spaceContentListMapper$ItemParcel, i iVar, vh vhVar, Continuation continuation) {
        super(2, continuation);
        this.v = spaceContentListMapper$ItemParcel;
        this.f89632w = iVar;
        this.f89633x = vhVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f89632w, this.f89633x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            SpaceContentListMapper$ItemParcel spaceContentListMapper$ItemParcel = this.v;
            boolean z = spaceContentListMapper$ItemParcel instanceof SpaceContentListMapper$ItemParcel.SubspaceValueItem;
            i iVar = this.f89632w;
            if (z) {
                ProductAccountDescriptor$Value productAccountDescriptor$Value = ((SpaceContentListMapper$ItemParcel.SubspaceValueItem) spaceContentListMapper$ItemParcel).f89621c;
                ProductAccountDescriptor$Value.Main main = productAccountDescriptor$Value instanceof ProductAccountDescriptor$Value.Main ? (ProductAccountDescriptor$Value.Main) productAccountDescriptor$Value : null;
                if (main == null) {
                    return Unit.f186387a;
                }
                the.a aVar2 = iVar.f89643x;
                ProductId productId = main.f89727a;
                SwipeToActionDelegate.SwipeAction swipeAction = this.f89633x.f54883a;
                m mVar = new m(swipeAction.f53505a, main.f89728b, swipeAction.f);
                this.u = 1;
                if (aVar2.a(productId, mVar, this) == aVar) {
                    return aVar;
                }
            } else if (spaceContentListMapper$ItemParcel instanceof SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem) {
                ProductAccountDescriptor$Value productAccountDescriptor$Value2 = ((SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem) spaceContentListMapper$ItemParcel).f89616c;
                ProductAccountDescriptor$Value.Discover discover = productAccountDescriptor$Value2 instanceof ProductAccountDescriptor$Value.Discover ? (ProductAccountDescriptor$Value.Discover) productAccountDescriptor$Value2 : null;
                if (discover == null) {
                    return Unit.f186387a;
                }
                iVar.n2(new y(iVar, discover, null), new whi.b(6));
            } else if (!(spaceContentListMapper$ItemParcel instanceof SpaceContentListMapper$ItemParcel.PendingItem) && !(spaceContentListMapper$ItemParcel instanceof SpaceContentListMapper$ItemParcel.SubspaceHeader)) {
                throw new NoWhenBranchMatchedException();
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
