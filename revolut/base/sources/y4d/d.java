package y4d;

import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DisplayCurrencyPreviewController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(DisplayCurrencyPreviewController displayCurrencyPreviewController, Continuation continuation) {
        super(2, continuation);
        this.v = displayCurrencyPreviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((IconSelectorDelegate.SelectableIconModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        IconSelectorDelegate.SelectableIconModel selectableIconModel = (IconSelectorDelegate.SelectableIconModel) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.N.getValue();
        Intrinsics.h(selectableIconModel);
        com.revolut.feature.settings.preview.displayCurrency.a aVar2 = (com.revolut.feature.settings.preview.displayCurrency.a) fVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(selectableIconModel, "selectableIconModel");
        Object obj3 = selectableIconModel.f52505l;
        if (obj3 instanceof xi0.b) {
            aVar2.n2(new h(aVar2, obj3, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
