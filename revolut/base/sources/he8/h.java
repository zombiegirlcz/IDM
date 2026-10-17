package he8;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.junior_coparent.impl.R$string;
import com.revolut.feature.junior_core.api.JuniorCoreApi$Toggles;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mii.k;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import yhm.o;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.a aVar2 = this.v;
        if (i == 0) {
            o.b(obj2);
            String str = aVar2.o.f151596a.f287823a;
            a5h.g gVar = aVar2.f76877p;
            this.u = 1;
            if (gVar.a0(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        Continuation continuation = null;
        if (((jte.d) aVar2.f76878q).c(JuniorCoreApi$Toggles.JuniorSuccessStatusMigration.f76894c)) {
            return l.a1(aVar2, aVar2.X1(new k("COPARENT_INVITATION_DECLINED_ID", new TextLocalisedClause(R$string.junior_co_parent_invitation_declined_title, null, null, 14), null, null, null, 28)), null, null, new hbg.h(aVar2, continuation, 4), 3);
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_co_parent_invitation_declined_title, null, null, 14);
        int i2 = R$string.junior_co_parent_invitation_declined_message;
        vd8.f fVar = aVar2.o.f151596a;
        return l.a1(aVar2, aVar2.X1(new y0(null, new j0((Clause) textLocalisedClause, (Clause) new TextLocalisedClause(i2, u.c(fVar.f287824b + " " + fVar.f287825c), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new hba.k(aVar2, continuation, 9), 3);
    }
}
