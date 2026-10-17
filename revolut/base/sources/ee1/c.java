package ee1;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.add_note.AddNoteScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddNoteScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddNoteScreen addNoteScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addNoteScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.f60768a0.getValue();
        String text = textData.f52598b.toString();
        iVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        if (!Intrinsics.f(((d) iVar.t2()).f125061a, d0.F0(text).toString())) {
            iVar.x2(new e2j.i(text, 8));
        }
        return Unit.f186387a;
    }
}
