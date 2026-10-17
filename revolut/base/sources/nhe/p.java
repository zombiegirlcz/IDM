package nhe;

import com.revolut.core.ui_kit.delegates.SmallStockCardDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class p extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ mhe.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f215434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ yfe.a f215435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ SmallStockCardDelegate.Model f215436y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mhe.j jVar, s sVar, yfe.a aVar, SmallStockCardDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f215434w = sVar;
        this.f215435x = aVar;
        this.f215436y = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new p(this.v, this.f215434w, this.f215435x, this.f215436y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((p) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r9 == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r9 == r3) goto L26;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            com.revolut.core.ui_kit.delegates.SmallStockCardDelegate$Model r0 = r8.f215436y
            java.lang.String r0 = r0.f53379a
            nhe.s r1 = r8.f215434w
            java.util.LinkedHashMap r2 = r1.f215439m
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r8.u
            r5 = 2
            r6 = 1
            mhe.j r7 = r8.v
            if (r4 == 0) goto L26
            if (r4 == r6) goto L22
            if (r4 != r5) goto L1a
            yhm.o.b(r9)
            goto L7f
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            yhm.o.b(r9)
            goto L45
        L26:
            yhm.o.b(r9)
            boolean r9 = r7 instanceof mhe.h
            yfe.a r4 = r8.f215435x
            if (r9 == 0) goto L65
            java.lang.Object r9 = r2.get(r4)
            yfe.c r9 = (yfe.c) r9
            if (r9 == 0) goto L4d
            r2 = r7
            mhe.h r2 = (mhe.h) r2
            yfe.h$c r2 = r2.f205555b
            r8.u = r6
            java.lang.Object r9 = r9.b3(r2, r8)
            if (r9 != r3) goto L45
            goto L7e
        L45:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto La3
        L4d:
            mhe.h r7 = (mhe.h) r7
            com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r9 = r7.f205554a
            uge.e r2 = r1.f215445t
            qf1.c r9 = z92.f.v(r9)
            com.revolut.kompot.common.transition.ZoomTarget$ListId r3 = new com.revolut.kompot.common.transition.ZoomTarget$ListId
            r3.<init>(r0)
            r0 = 0
            com.revolut.feature.add.new_product.api.declaration.AddNewProductDestination r9 = uge.d.a(r2, r0, r9, r3, r6)
            r1.A2(r9)
            goto La3
        L65:
            boolean r9 = r7 instanceof mhe.i
            if (r9 == 0) goto La6
            java.lang.Object r9 = r2.get(r4)
            yfe.c r9 = (yfe.c) r9
            r2 = r7
            mhe.i r2 = (mhe.i) r2
            yfe.h$a r2 = r2.f205558b
            if (r9 == 0) goto L87
            r8.u = r5
            java.lang.Object r9 = r9.c3(r2, r8)
            if (r9 != r3) goto L7f
        L7e:
            return r3
        L7f:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto La3
        L87:
            mhe.i r7 = (mhe.i) r7
            com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey r9 = r7.f205557a
            com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryListDestination r2 = new com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryListDestination
            com.revolut.kompot.navigable.TransitionAnimation$a r3 = com.revolut.kompot.navigable.TransitionAnimation.INSTANCE
            com.revolut.kompot.common.transition.ZoomTarget$ListId r4 = new com.revolut.kompot.common.transition.ZoomTarget$ListId
            r4.<init>(r0)
            com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig r0 = new com.revolut.core.ui_kit.views.slider_layout.HomeOverlayConfig
            r0.<init>(r6)
            com.revolut.kompot.common.transition.ZoomTransitionAnimation$Default r0 = com.revolut.kompot.common.transition.a.d(r3, r4, r0)
            r2.<init>(r9, r0)
            r1.A2(r2)
        La3:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        La6:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nhe.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
