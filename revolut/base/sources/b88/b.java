package b88;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.junior.accounts.impl.ui.saving_picker.JuniorSavingChildPickerScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorSavingChildPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JuniorSavingChildPickerScreen juniorSavingChildPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorSavingChildPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVar = (h) this.v.P.getValue();
        Intrinsics.h(model);
        n nVar = (n) hVar;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        if (Intrinsics.f(str, "ADD_NEW_CHILD_ID")) {
            nVar.C2(e.f13122a);
        } else {
            Object obj3 = model.u;
            if (obj3 instanceof String) {
                nVar.n2(new av7.l(nVar, (String) obj3, null, 18), new whi.b(6));
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unexpected model. ListId = ", str));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
        }
        return Unit.f186387a;
    }
}
