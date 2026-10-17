package wae;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import mii.k;
import qua.p;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f295868w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, p pVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f295868w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f295868w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        d dVar = this.v;
        p pVar = this.f295868w;
        if (i == 0) {
            o.b(obj2);
            b bVar = new b(dVar, pVar, continuation, 0);
            this.u = 1;
            if (dVar.Y2(this, bVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        dVar.L2(new k("MARKED_SUBSCRIPTION_TOAST_ID", new TextLocalisedClause(R$string.card_marked_as_subscription_toast, null, null, 14), null, null, null, 28));
        if (pd.b.j(pVar.c0)) {
            n.P2(dVar, dVar.o2(new c9e.b(pVar)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
        }
        return Unit.f186387a;
    }
}
