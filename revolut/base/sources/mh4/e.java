package mh4;

import com.revolut.feature.credit.application.plugins.impl.ui.refinancing_offer.selection.CreditToRefinanceSelectionScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditToRefinanceSelectionScreen f205385w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f205385w = creditToRefinanceSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f205385w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f205385w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((mv3.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((dx4.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditToRefinanceSelectionScreen creditToRefinanceSelectionScreen = this.f205385w;
        switch (i) {
            case 0:
                mv3.c buttonClickAction = (mv3.c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = (y) creditToRefinanceSelectionScreen.R2();
                yVar.getClass();
                Intrinsics.checkNotNullParameter(buttonClickAction, "buttonClickAction");
                int i2 = t.f205406a[buttonClickAction.ordinal()];
                if (i2 == 1) {
                    j60.a.v(yVar.f205411p, false, null, 3);
                } else if (i2 != 2) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unknown click action " + buttonClickAction);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                } else {
                    mv3.k kVar = yVar.I2().f205395g;
                    if (kVar == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    yVar.C2(new l(kVar, true));
                }
                return Unit.f186387a;
            default:
                dx4.l lVar = (dx4.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c8g.c.i(creditToRefinanceSelectionScreen.d(), lVar);
                return Unit.f186387a;
        }
    }
}
