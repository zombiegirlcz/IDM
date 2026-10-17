package ueg;

import com.revolut.core.ui_kit.views.ActionsView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class x0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ ActionsView.Item v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b f279443w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ActionsView.Item item, com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = item;
        this.f279443w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x0(this.v, this.f279443w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        if (nim.a.a(r8, r7) == r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (nim.a.a(r8, r7) == r2) goto L28;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b r0 = r7.f279443w
            i9g.h0 r1 = r0.f94063s
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L21
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L15
            yhm.o.b(r8)
            goto La3
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            yhm.o.b(r8)
            goto L5d
        L21:
            yhm.o.b(r8)
            com.revolut.core.ui_kit.views.ActionsView$Item r8 = r7.v
            java.lang.String r3 = r8.f58316a
            java.lang.Object r8 = r8.f58324n
            java.lang.String r6 = "QUICK_FILTER_TENANCY"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r3, r6)
            if (r6 == 0) goto L60
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r8 = r8 ^ r5
            fag.t0 r0 = r1.f159799a
            r0.getClass()
            e8h.p r1 = new e8h.p
            r3 = 1
            r1.<init>(r0, r8, r3)
            pfm.h r8 = new pfm.h
            r0 = 2
            r8.<init>(r1, r0)
            java.lang.String r0 = "fromAction(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r0)
            r7.u = r5
            java.lang.Object r8 = nim.a.a(r8, r7)
            if (r8 != r2) goto L5d
            goto La2
        L5d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L60:
            java.lang.String r5 = "FILTERS_ITEM_ID"
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r5)
            if (r3 == 0) goto L74
            com.revolut.kompot.navigable.vc.modal.a r8 = r0.X
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreenContract$ModalStep$Filters r0 = com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreenContract$ModalStep.Filters.f94056a
            com.revolut.kompot.common.ModalDestination$Style$POPUP r1 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.v2(r8, r0, r1)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L74:
            boolean r3 = r8 instanceof meg.g
            r5 = 0
            if (r3 == 0) goto L7c
            meg.g r8 = (meg.g) r8
            goto L7d
        L7c:
            r8 = r5
        L7d:
            if (r8 == 0) goto La6
            meg.h r3 = r0.F
            cli.y r0 = r0.W
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            ueg.v r0 = (ueg.v) r0
            zfi.a r0 = r0.d
            r3.getClass()
            zfi.a r8 = meg.h.b(r0, r8)
            pfm.h r8 = r1.j(r8)
            r7.u = r4
            java.lang.Object r8 = nim.a.a(r8, r7)
            if (r8 != r2) goto La3
        La2:
            return r2
        La3:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        La6:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ueg.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
