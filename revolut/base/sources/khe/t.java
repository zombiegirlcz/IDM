package khe;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class t extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ SpaceContentListMapper$ItemParcel v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a f184109w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ vh f184110x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SpaceContentListMapper$ItemParcel spaceContentListMapper$ItemParcel, com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a aVar, vh vhVar, Continuation continuation) {
        super(2, continuation);
        this.v = spaceContentListMapper$ItemParcel;
        this.f184109w = aVar;
        this.f184110x = vhVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.v, this.f184109w, this.f184110x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r8.a(r1, r3, r7) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        if (((vge.t3) r8).j(r6, r7) == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        return r0;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.u
            r2 = 1
            com.revolut.feature.tab.accounts.impl.total_wealth.category_list.a r3 = r7.f184109w
            r4 = 2
            if (r1 == 0) goto L20
            if (r1 == r2) goto L1b
            if (r1 != r4) goto L13
            yhm.o.b(r8)
            goto L84
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            yhm.o.b(r8)
            goto La0
        L20:
            yhm.o.b(r8)
            com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel r8 = r7.v
            boolean r1 = r8 instanceof com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel.SubspaceValueItem
            com.revolut.core.ui_kit.delegates.vh r5 = r7.f184110x
            r6 = 0
            if (r1 == 0) goto L56
            com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel$SubspaceValueItem r8 = (com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel.SubspaceValueItem) r8
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r8 = r8.f89621c
            boolean r1 = r8 instanceof com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main
            if (r1 == 0) goto L37
            r6 = r8
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r6 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r6
        L37:
            if (r6 != 0) goto L3c
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L3c:
            the.a r8 = r3.u
            com.revolut.feature.tab.accounts.models.ProductId r1 = r6.f89727a
            sfe.m r3 = new sfe.m
            com.revolut.core.ui_kit.delegates.SwipeToActionDelegate$SwipeAction r4 = r5.f54883a
            java.lang.String r5 = r4.f53505a
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = r6.f89728b
            java.lang.Object r4 = r4.f
            r3.<init>(r5, r6, r4)
            r7.u = r2
            java.lang.Object r8 = r8.a(r1, r3, r7)
            if (r8 != r0) goto La0
            goto L83
        L56:
            boolean r1 = r8 instanceof com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem
            if (r1 == 0) goto L91
            com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel$SubspaceDiscoverItem r8 = (com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel.SubspaceDiscoverItem) r8
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r8 = r8.f89616c
            boolean r1 = r8 instanceof com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Discover
            if (r1 == 0) goto L65
            r6 = r8
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Discover r6 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Discover) r6
        L65:
            if (r6 != 0) goto L6a
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L6a:
            com.revolut.core.ui_kit.delegates.SwipeToActionDelegate$SwipeAction r8 = r5.f54883a
            java.lang.String r8 = r8.f53505a
            java.lang.String r1 = "DISCOVER_ACTION_HIDE_"
            r2 = 0
            boolean r8 = kotlin.text.a0.H(r8, r1, r2)
            if (r8 == 0) goto La0
            vge.z2 r8 = r3.f89597s
            r7.u = r4
            vge.t3 r8 = (vge.t3) r8
            java.lang.Object r8 = r8.j(r6, r7)
            if (r8 != r0) goto L84
        L83:
            return r0
        L84:
            fhe.a r8 = r3.v
            r8.getClass()
            nii.y0 r8 = fhe.a.a()
            r3.X1(r8)
            goto La0
        L91:
            boolean r0 = r8 instanceof com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel.PendingItem
            if (r0 != 0) goto La0
            boolean r8 = r8 instanceof com.revolut.feature.tab.accounts.impl.ui.spaces.SpaceContentListMapper$ItemParcel.SubspaceHeader
            if (r8 == 0) goto L9a
            goto La0
        L9a:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        La0:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: khe.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
