package wc4;

import com.revolut.core.ui_kit.delegates.ListingCardBasicDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.selection.KontomatikSelectionController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ KontomatikSelectionController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(KontomatikSelectionController kontomatikSelectionController, Continuation continuation) {
        super(2, continuation);
        this.v = kontomatikSelectionController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((ListingCardBasicDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListingCardBasicDelegate.Model model = (ListingCardBasicDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((k) this.v.N.getValue()).I2(new d(model.f52730a));
        return Unit.f186387a;
    }
}
