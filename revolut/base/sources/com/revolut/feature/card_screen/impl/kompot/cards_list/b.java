package com.revolut.feature.card_screen.impl.kompot.cards_list;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends i implements Function2 {
    public c u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f65459w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CardsListFlowContract$Step f65460x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, CardsListFlowContract$Step cardsListFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.f65459w = cVar;
        this.f65460x = cardsListFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f65459w, this.f65460x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L1b
            if (r2 != r3) goto L13
            com.revolut.feature.card_screen.impl.kompot.cards_list.c r1 = r0.u
            yhm.o.b(r21)
            r2 = r21
            goto L3a
        L13:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1b:
            yhm.o.b(r21)
            com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$Step r2 = r0.f65460x
            com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$Step$CardsList r2 = (com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$Step.CardsList) r2
            com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$PreSelectedVariant r2 = r2.f65455b
            boolean r4 = r2 instanceof com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$PreSelectedVariant.DependingOnLastOpenAccount
            com.revolut.feature.card_screen.impl.kompot.cards_list.c r5 = r0.f65459w
            if (r4 == 0) goto L3e
            com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$PreSelectedVariant$DependingOnLastOpenAccount r2 = (com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$PreSelectedVariant.DependingOnLastOpenAccount) r2
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r2 = r2.f65448a
            r0.u = r5
            r0.v = r3
            java.lang.Enum r2 = com.revolut.feature.card_screen.impl.kompot.cards_list.c.O2(r5, r2, r0)
            if (r2 != r1) goto L39
            return r1
        L39:
            r1 = r5
        L3a:
            com.revolut.feature.card_order_new.api.SelectedTab r2 = (com.revolut.feature.card_order_new.api.SelectedTab) r2
            r5 = r1
            goto L4b
        L3e:
            boolean r1 = r2 instanceof com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$PreSelectedVariant.Tab
            if (r1 == 0) goto L47
            com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$PreSelectedVariant$Tab r2 = (com.revolut.feature.card_screen.impl.kompot.cards_list.CardsListFlowContract$PreSelectedVariant.Tab) r2
            com.revolut.feature.card_order_new.api.SelectedTab r2 = r2.f65449a
            goto L4b
        L47:
            if (r2 != 0) goto L74
            com.revolut.feature.card_order_new.api.SelectedTab r2 = com.revolut.feature.card_order_new.api.SelectedTab.DEBIT
        L4b:
            if (r2 != 0) goto L4f
            com.revolut.feature.card_order_new.api.SelectedTab r2 = com.revolut.feature.card_order_new.api.SelectedTab.DEBIT
        L4f:
            r7 = r2
            com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig r6 = new com.revolut.feature.card_order_new.api.CardOrderNewFeatureConfig
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 16382(0x3ffe, float:2.2956E-41)
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
            r1.<init>(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r2 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r2.<init>(r1)
            aii.n r1 = r5.C1(r2)
            return r1
        L74:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_screen.impl.kompot.cards_list.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
