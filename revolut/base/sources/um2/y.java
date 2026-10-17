package um2;

import com.revolut.core.ui_kit.delegates.WallpaperPreviewDelegate;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationContract$ModalStep;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ThemeCustomisationController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ThemeCustomisationController themeCustomisationController, Continuation continuation) {
        super(2, continuation);
        this.v = themeCustomisationController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        y yVar = new y(this.v, continuation);
        yVar.u = obj2;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((WallpaperPreviewDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        WallpaperPreviewDelegate.Model model = (WallpaperPreviewDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        b bVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar = (com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b) bVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        em2.i iVar = model.d;
        bVar.z.getClass();
        oki.h.v2(bVar.C, new ThemeCustomisationContract$ModalStep.BackgroundPicker(iVar.f127589b, iVar.e), ModalDestination.Style.POPUP.f98311a);
        return Unit.f186387a;
    }
}
