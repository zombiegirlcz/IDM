package b6i;

import com.revolut.feature_move_money.api.model.AccountSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature_move_money.impl.amount.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AccountSource f12791w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.feature_move_money.impl.amount.c cVar, AccountSource accountSource, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f12791w = accountSource;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i0(this.v, this.f12791w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x008a A[RETURN] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.u
            r2 = 0
            com.revolut.feature_move_money.api.model.AccountSource r3 = r6.f12791w
            com.revolut.feature_move_money.impl.amount.c r4 = r6.v
            r5 = 1
            if (r1 == 0) goto L1b
            if (r1 != r5) goto L13
            yhm.o.b(r7)
            goto L8b
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            yhm.o.b(r7)
            h6i.k0 r7 = r4.O
            r6.u = r5
            r7.getClass()
            boolean r1 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.InvestCashHolding
            if (r1 == 0) goto L44
            gte.a r1 = r7.f149689c
            com.revolut.feature.wealth.api.FeatureWealthApi$Toggles$InvestUnsettledOrdersImprovements r5 = com.revolut.feature.wealth.api.FeatureWealthApi$Toggles.InvestUnsettledOrdersImprovements.f95163c
            jte.d r1 = (jte.d) r1
            boolean r1 = r1.c(r5)
            if (r1 != 0) goto L42
            r1 = r3
            com.revolut.feature_move_money.api.model.AccountSource$InvestCashHolding r1 = (com.revolut.feature_move_money.api.model.AccountSource.InvestCashHolding) r1
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r0) goto L3f
            goto L88
        L3f:
            qih.c r7 = (qih.c) r7
            goto L88
        L42:
            r7 = r2
            goto L88
        L44:
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.SpotMarginCollateralSource
            if (r7 == 0) goto L49
            goto L42
        L49:
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.CreditCardSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.JuniorPocketSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.JuniorSavingsSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.JuniorVaultSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.TeenPocketSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.TeenVaultSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.PocketSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.RevPointsPocketSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.SavingsSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.VaultSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.JointSavingsSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.NonExistingCurrencyAccount
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.JointVaultSource
            if (r7 != 0) goto L42
            boolean r7 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.FuturesCollateralSource
            if (r7 == 0) goto L82
            goto L42
        L82:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L88:
            if (r7 != r0) goto L8b
            return r0
        L8b:
            aii.e r7 = (aii.e) r7
            if (r7 == 0) goto Lad
            com.revolut.kompot.navigable.vc.ViewController r7 = r4.e1(r7)
            h6i.k0 r0 = r4.O
            r0.getClass()
            java.lang.String r0 = "accountSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof com.revolut.feature_move_money.api.model.AccountSource.SpotMarginCollateralSource
            if (r0 == 0) goto La4
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            goto La6
        La4:
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_FADE r0 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_FADE.f98307a
        La6:
            r1 = 2
            yji.l.j2(r4, r7, r0, r2, r1)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b6i.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
