package wu9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.messaging.common.api.reactions.ReactionsAuthorsViewer$ReactionAuthor;
import com.revolut.feature.payments.messaging.common.impl.reactions.ReactionsAuthorsBottomSheetController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReactionsAuthorsBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ReactionsAuthorsBottomSheetController reactionsAuthorsBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.v = reactionsAuthorsBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        if ((obj3 instanceof ReactionsAuthorsViewer$ReactionAuthor) && ((ReactionsAuthorsViewer$ReactionAuthor) obj3).d) {
            this.v.c3(fu9.f.f138153a);
        }
        return Unit.f186387a;
    }
}
