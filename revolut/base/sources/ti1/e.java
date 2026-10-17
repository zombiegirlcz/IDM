package ti1;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.address.common.impl.flow.validation_flow.suggestion.SuggestionSheetController;
import gim.i;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SuggestionSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SuggestionSheetController suggestionSheetController, Continuation continuation) {
        super(2, continuation);
        this.v = suggestionSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.V.getValue();
        String listId = model.f53304a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Iterator<E> it8 = a.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((a) next).b(), listId)) {
                break;
            }
        }
        a aVar2 = (a) next;
        if (aVar2 != null) {
            gVar.H2(gVar.f271403p, new td1.f(aVar2, 22));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown option ", listId));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
