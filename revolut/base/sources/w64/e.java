package w64;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.application.plugins.api.models.config.CongratulationsScreenConfig;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import yhm.o;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.credit.application.plugins.impl.ui.congratulations.b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.credit.application.plugins.impl.ui.congratulations.a aVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.congratulations.a(bVar, continuation, 1);
            this.u = 1;
            objP2 = bVar.p2(this, aVar2);
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
        return l.a1(bVar, bVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.congratulations_template_popup_title, u.c(((CongratulationsScreenConfig.Popup) bVar.f67257q.f67253b).f66346a), null, 12), ((CongratulationsScreenConfig.Popup) bVar.f67257q.f67253b).f66347b, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new w3k.i(bVar, (it3.d) objP2, continuation, 11), 3);
    }
}
