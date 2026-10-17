package z8k;

import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.n1;

/* JADX INFO: loaded from: classes11.dex */
public final class o0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o0(this.v, continuation, 0);
            default:
                return new o0(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o0) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.u2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.E.Q();
                j9i.d dVar = bVar.F;
                j9i.b type = j9i.b.GIF;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(type, "type");
                ReactionsKeyboardView reactionsKeyboardView = dVar.d;
                int i2 = j9i.c.f172345a[type.ordinal()];
                if (i2 == 1) {
                    str = "type_sticker";
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "type_gif";
                }
                reactionsKeyboardView.setType(str);
                dVar.d.setState(zx0.j.EXPANDED);
                return Unit.f186387a;
        }
    }
}
