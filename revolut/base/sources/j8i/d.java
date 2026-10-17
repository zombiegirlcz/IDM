package j8i;

import a2f.k;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature_move_money.impl.review.edit_note.MoveMoneyEditNoteScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoveMoneyEditNoteScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MoveMoneyEditNoteScreen moveMoneyEditNoteScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moveMoneyEditNoteScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.N.getValue();
        String listId = textData.f52597a;
        CharSequence text = textData.f52598b;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        iVar.H2(iVar.o, new k(9, text));
        return Unit.f186387a;
    }
}
