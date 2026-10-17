package mv7;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.bottom_sheet.EmbeddedBottomSheetScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EmbeddedBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EmbeddedBottomSheetScreen embeddedBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = embeddedBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarM3 = this.v.d();
        String id10 = model.f52519a;
        j jVar = (j) gVarM3;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        jVar.H2(jVar.f209166s, new mll.h(id10, 5));
        return Unit.f186387a;
    }
}
