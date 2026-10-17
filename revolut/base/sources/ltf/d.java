package ltf;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration.TransferReasonsReuseDeclarationScreen;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferReasonsReuseDeclarationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TransferReasonsReuseDeclarationScreen transferReasonsReuseDeclarationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferReasonsReuseDeclarationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.N.getValue();
        Intrinsics.h(model);
        l lVar = (l) iVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "REUSE_BUTTON_ID")) {
            TransferReasonsValues transferReasonsValues = lVar.o.f92393a.f92443c;
            if (transferReasonsValues == null) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "TransferReasonsReuseDeclarationScreenModel", "Reuse button clicked with null suggestion.reasons — screen should not be shown in this state", null, h0Var);
            } else {
                lVar.C2(new g(transferReasonsValues));
            }
        } else if (Intrinsics.f(str, "FILL_FROM_SCRATCH_BUTTON_ID")) {
            lVar.C2(f.f199866a);
        }
        return Unit.f186387a;
    }
}
