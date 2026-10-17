package vmf;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.transactions.impl.ui.kompot.edit_note.EditNoteScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EditNoteScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(EditNoteScreen editNoteScreen, Continuation continuation) {
        super(2, continuation);
        this.v = editNoteScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) this.v.N.getValue();
        String listId = textData.f52597a;
        CharSequence text = textData.f52598b;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        lVar.H2(lVar.f290573q, new a2f.k(16, text));
        return Unit.f186387a;
    }
}
