package o03;

import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.feature.card_management.impl.ui.kompot.replace.reason.CardReplaceReasonPickerController;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CardReplaceReasonPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CardReplaceReasonPickerController cardReplaceReasonPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = cardReplaceReasonPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.e;
        wy2.d reason = obj3 instanceof wy2.d ? (wy2.d) obj3 : null;
        if (reason != null) {
            m mVar = (m) this.v.S.getValue();
            mVar.getClass();
            Intrinsics.checkNotNullParameter(reason, "reason");
            int i = j.f221111a[reason.ordinal()];
            if (i == 1) {
                mVar.C2(d.f221107a);
            } else {
                if (i != 2 && i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                mVar.C2(new c(reason));
            }
        }
        return Unit.f186387a;
    }
}
