package wdc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.revolutpay.shared.ui.insufficient_funds_options.InsufficientFundsOptionsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InsufficientFundsOptionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InsufficientFundsOptionsScreen insufficientFundsOptionsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = insufficientFundsOptionsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVar = (j) this.v.O.getValue();
        String listId = model.f53228a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode != 756486415) {
            if (iHashCode != 1067462371) {
                if (iHashCode == 1974897599 && listId.equals("MOVE_MONEY_OPTION_LIST_ID")) {
                    jVar.C2(d.f296545a);
                }
            } else if (listId.equals("ADD_CARD_OPTION_LIST_ID")) {
                jVar.C2(b.f296543a);
            }
        } else if (listId.equals("ADD_MONEY_OPTION_LIST_ID")) {
            jVar.C2(c.f296544a);
        }
        return Unit.f186387a;
    }
}
