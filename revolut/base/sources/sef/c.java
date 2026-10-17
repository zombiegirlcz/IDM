package sef;

import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.add_note.AddNoteScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ AddNoteScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AddNoteScreen addNoteScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = addNoteScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AddNoteScreen addNoteScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) addNoteScreen.c0.getValue()).v2(g.f262190a);
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) addNoteScreen.c0.getValue()).y2();
                break;
        }
        return Unit.f186387a;
    }
}
