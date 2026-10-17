package wzb;

import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.impl.ui.points_expiry.home.RevPointsExpiryHomeScreen;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.t1;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsExpiryHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RevPointsExpiryHomeScreen revPointsExpiryHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsExpiryHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputDisclosureDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputDisclosureDelegate.Model model = (InputDisclosureDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.rev_points.impl.ui.points_expiry.home.a aVar2 = (com.revolut.feature.rev_points.impl.ui.points_expiry.home.a) gVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        aVar2.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(new RevPointsTransactionPageParams(0, null, null, null, null, null, t1.EXPIRATION, null, null, OnfidoActivity.RESULT_EXIT_MISSING_ONFIDO_CONFIG), new RevPointsFlowDestination.StartType.OpenTransactionList.UiOverrides(new ResourceId.IntResourceId(R$string.rev_points_points_expiry_expired_title), new RevPointsFlowDestination.StartType.OpenTransactionList.EmptyStateOverride(new ResourceId.IntResourceId(R$string.rev_points_points_expiry_expired_not_expired_title), new ResourceId.IntResourceId(R$string.rev_points_points_expiry_expired_not_expired_description), new ResourceId.IntResourceId(R$string.rev_points_points_expiry_earn_more), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_all_time, null, null, 6))), 4))));
        return Unit.f186387a;
    }
}
