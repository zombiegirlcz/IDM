package qwd;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.feature.staking.impl.stake.v2.StakeController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ StakeController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(StakeController stakeController, Continuation continuation) {
        super(2, continuation);
        this.u = stakeController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CenteredAmountDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r18)
            r0 = r17
            com.revolut.feature.staking.impl.stake.v2.StakeController r1 = r0.u
            qwd.j r1 = r1.R2()
            com.revolut.feature.staking.impl.stake.v2.b r1 = (com.revolut.feature.staking.impl.stake.v2.b) r1
            cli.y r2 = r1.K
            java.lang.Object r3 = r2.f22677a
            vkm.j2 r3 = (vkm.j2) r3
            java.lang.Object r2 = r2.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r3 = r3.getValue()
            qwd.m r3 = (qwd.m) r3
            xi0.b r3 = r3.f249864b
            com.revolut.feature.staking.impl.stake.v2.StakeControllerContract$InputData r4 = r1.o
            com.revolut.feature.staking.api.model.StakingProduct r4 = r4.f88138a
            xi0.b r4 = r4.d
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            r4 = 0
            if (r3 == 0) goto L43
            java.lang.Object r2 = r2.getValue()
            qwd.m r2 = (qwd.m) r2
            com.revolut.data.model.Data r2 = r2.d
            java.lang.Object r2 = r2.getContent()
            qwd.k r2 = (qwd.k) r2
            if (r2 == 0) goto L41
            dj0.d r2 = r2.f249858a
            goto L55
        L41:
            r2 = r4
            goto L55
        L43:
            java.lang.Object r2 = r2.getValue()
            qwd.m r2 = (qwd.m) r2
            com.revolut.data.model.Data r2 = r2.d
            java.lang.Object r2 = r2.getContent()
            qwd.k r2 = (qwd.k) r2
            if (r2 == 0) goto L41
            dj0.d r2 = r2.f249859b
        L55:
            if (r2 == 0) goto L8f
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r3 = com.revolut.feature.staking.api.R$string.staking_currency_selected
            com.revolut.core.ui_kit.models.CurrencyClause r5 = new com.revolut.core.ui_kit.models.CurrencyClause
            xi0.b r7 = r2.f115083b
            com.revolut.core.ui_kit.models.CurrencyClause$Format$Ticker r8 = com.revolut.core.ui_kit.models.CurrencyClause.Format.Ticker.f57756a
            r9 = 4
            r5.<init>(r7, r8, r4, r9)
            java.util.List r5 = zhm.u.c(r5)
            r7 = 12
            r6.<init>(r3, r5, r4, r7)
            com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage r8 = new com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage
            int r9 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_arrows_sort
            r15 = 0
            r16 = 254(0xfe, float:3.56E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r11 = 108(0x6c, float:1.51E-43)
            java.lang.String r5 = "SWITCH_BUTTON_SHOT_ID"
            r7 = 0
            r9 = 0
            mii.f r3 = te0.w.a(r5, r6, r7, r8, r9, r10, r11)
            r1.X1(r3)
            ihm.b r1 = r1.J
            r1.onNext(r2)
        L8f:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: qwd.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
