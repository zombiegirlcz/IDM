package y4d;

import com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewController;
import com.revolut.feature.settings.preview.displayCurrency.DisplayCurrencyPreviewControllerContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DisplayCurrencyPreviewController f310875w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DisplayCurrencyPreviewController displayCurrencyPreviewController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f310875w = displayCurrencyPreviewController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f310875w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f310875w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        DisplayCurrencyPreviewController displayCurrencyPreviewController = this.f310875w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar = (f) displayCurrencyPreviewController.N.getValue();
                Intrinsics.h(id10);
                com.revolut.feature.settings.preview.displayCurrency.a aVar2 = (com.revolut.feature.settings.preview.displayCurrency.a) fVar;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (id10.equals("currency_changer_light_bulb_id")) {
                    oki.h.v2(aVar2.f86030q, DisplayCurrencyPreviewControllerContract$ModalStep.ShortcutHintStep.f86028a, bottom_dialog);
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                f fVar2 = (f) displayCurrencyPreviewController.N.getValue();
                Intrinsics.h(clickData);
                com.revolut.feature.settings.preview.displayCurrency.a aVar4 = (com.revolut.feature.settings.preview.displayCurrency.a) fVar2;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "currency_changer_disclaimer_id")) {
                    oki.h.v2(aVar4.f86030q, DisplayCurrencyPreviewControllerContract$ModalStep.CurrencyExchangeDisclaimerStep.f86027a, bottom_dialog);
                }
                break;
        }
        return Unit.f186387a;
    }
}
