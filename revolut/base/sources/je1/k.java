package je1;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import j82.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import ufm.n;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f173181w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a aVar, n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f173181w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.v, this.f173181w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.acquiring.lite_pos.impl.ui.screen.category.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            iyi.j jVar = new iyi.j(this.f173181w, null, 9);
            this.u = 1;
            objP2 = aVar2.p2(this, jVar);
            if (objP2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objP2 = obj2;
        }
        return yji.l.a1(aVar2, aVar2.X1(new y0("STATUS_DIALOG_ID_SUCCESS", new j0((Clause) new TextLocalisedClause(aVar2.o.f60786a == null ? R$string.product_catalogue_flow_catalogue_category_details_create_success_dialog_title : R$string.product_catalogue_flow_catalogue_category_details_edit_success_dialog_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) StatusViewContract$Duration.Short.f59734a, (h0) null, (ResourceImage) null, 3582), false, 4)), null, null, new q(aVar2, (CatalogueCategory) objP2, null, 13), 3);
    }
}
