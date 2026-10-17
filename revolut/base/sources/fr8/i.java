package fr8;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ JuniorTransferAmountScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(JuniorTransferAmountScreen juniorTransferAmountScreen, Continuation continuation) {
        super(2, continuation);
        this.u = juniorTransferAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        r rVarT2 = this.u.T2();
        rVarT2.f137437t.Q();
        j9i.d dVar = rVarT2.u;
        j9i.b type = j9i.b.GIF;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        ReactionsKeyboardView reactionsKeyboardView = dVar.d;
        int i = j9i.c.f172345a[type.ordinal()];
        if (i == 1) {
            str = "type_sticker";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "type_gif";
        }
        reactionsKeyboardView.setType(str);
        reactionsKeyboardView.setState(zx0.j.EXPANDED);
        return Unit.f186387a;
    }
}
