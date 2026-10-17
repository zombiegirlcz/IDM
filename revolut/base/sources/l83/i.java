package l83;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReactivateCardConfirmationBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ReactivateCardConfirmationBottomSheetScreen reactivateCardConfirmationBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reactivateCardConfirmationBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.u
            com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r5)
            com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetScreen r5 = r4.v
            java.lang.Object r5 = r5.T
            java.lang.Object r5 = r5.getValue()
            l83.j r5 = (l83.j) r5
            java.lang.String r1 = r0.f52613a
            int r2 = r1.hashCode()
            r3 = -1907978181(0xffffffff8e46903b, float:-2.4474829E-30)
            if (r2 == r3) goto L3e
            r3 = -1083085883(0xffffffffbf716bc5, float:-0.9430507)
            if (r2 == r3) goto L33
            r3 = 1001311725(0x3baecded, float:0.005334607)
            if (r2 != r3) goto L7f
            java.lang.String r2 = "ORDER_REPLACEMENT_BUTTON_LIST_ID"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            l83.f r0 = l83.f.f192768a
            goto L48
        L33:
            java.lang.String r2 = "REACTIVATE_CARD_BUTTON_LIST_ID"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            l83.g r0 = l83.g.f192769a
            goto L48
        L3e:
            java.lang.String r2 = "CANCEL_CARD_REACTIVATION_BUTTON_LIST_ID"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L7f
            l83.e r0 = l83.e.f192767a
        L48:
            com.revolut.feature.card_screen.impl.kompot.reactivate.confirmation_bottom_sheet.ReactivateCardConfirmationBottomSheetContract$InputData r1 = r5.o
            java.lang.String r2 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            boolean r2 = r0 instanceof l83.g
            if (r2 == 0) goto L5e
            l83.b r0 = new l83.b
            com.revolut.feature.cards.models.revolutcard.TerminatedCard r1 = r1.f65497a
            r0.<init>(r1)
            r5.C2(r0)
            goto L76
        L5e:
            boolean r2 = r0 instanceof l83.f
            if (r2 == 0) goto L6d
            l83.c r0 = new l83.c
            com.revolut.feature.cards.models.revolutcard.TerminatedCard r1 = r1.f65497a
            r0.<init>(r1)
            r5.C2(r0)
            goto L76
        L6d:
            boolean r0 = r0 instanceof l83.e
            if (r0 == 0) goto L79
            l83.a r0 = l83.a.f192764a
            r5.C2(r0)
        L76:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L79:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L7f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.f52613a
            java.lang.String r1 = "Unknown listId: "
            java.lang.String r2 = " in ReactivateCardConfirmationBottomSheetScreen"
            java.lang.String r0 = a10.b.s(r1, r0, r2)
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l83.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
