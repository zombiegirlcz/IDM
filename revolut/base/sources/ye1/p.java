package ye1;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import pfm.r;

/* JADX INFO: loaded from: classes20.dex */
public final class p extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f312762w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar, r rVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f312762w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new p(this.v, this.f312762w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.product.a aVar2 = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            wm3.j jVar = new wm3.j(this.f312762w, null, 18);
            this.u = 1;
            if (aVar2.p2(this, jVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return yji.l.a1(aVar2, aVar2.X1(new y0("STATUS_DIALOG_ID_SUCCESS", new j0((Clause) new TextLocalisedClause(aVar2.o.f60817a == null ? R$string.product_catalogue_flow_catalogue_product_details_create_success_dialog_title : R$string.product_catalogue_flow_catalogue_product_details_edit_success_dialog_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (h0) null, (ResourceImage) null, 3582), false, 4)), null, null, new y5g.d(aVar2, null, 15), 3);
    }
}
