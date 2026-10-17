package sv7;

import android.os.Parcelable;
import aw0.e;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import gim.i;
import grl.k9;
import gu7.e1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import sdi.k;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ e1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, e1 e1Var, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = e1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e1 e1Var = this.v;
        lw0.a aVar2 = new lw0.a(sr7.c.a(e1Var.f146735a, null), null, null, null, false, 30);
        e eVar = new e(false, null, null, new n6(sr7.c.a(e1Var.f146736b, null), LargeActionButton.ButtonStyle.d, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Insurance;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        ActionsBottomSheetController actionsBottomSheetController = new ActionsBottomSheetController(new dii.a(aVar2, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
        c cVar = this.u;
        cVar.N2(actionsBottomSheetController, ModalDestination.Style.BOTTOM_DIALOG.f98301a, new k(cVar, e1Var, 28));
        return Unit.f186387a;
    }
}
