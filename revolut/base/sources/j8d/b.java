package j8d;

import com.revolut.core.model.faq.FaqAction;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreen;
import com.revolut.feature.shared.help_centre.impl.faq.screens.form_chooser.FaqFormChooserScreenContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FaqFormChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FaqFormChooserScreen faqFormChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = faqFormChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.Z.getValue();
        String itemId = model.f51822a;
        Object obj3 = model.e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (obj3 instanceof FaqAction) {
            FaqFormChooserScreenContract$InputData faqFormChooserScreenContract$InputData = gVar.f172174p;
            gVar.v2(new d(faqFormChooserScreenContract$InputData.f86256a, (FaqAction) obj3, faqFormChooserScreenContract$InputData.f86258c));
        }
        return Unit.f186387a;
    }
}
