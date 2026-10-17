package q84;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.debts.c f242981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ pu3.b f242982x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar, pu3.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f242981w = cVar;
        this.f242982x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f242981w, this.f242982x, continuation, 0);
            default:
                return new m(this.f242981w, this.f242982x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                pu3.b bVar = this.f242982x;
                com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar = this.f242981w;
                if (i == 0) {
                    o.b(obj2);
                    ww3.c cVar2 = cVar.f67434q;
                    h1 h1VarF = w0.F(cVar.f67436s.f67413a);
                    String id10 = bVar.getId();
                    this.v = 1;
                    if (cVar2.c(h1VarF, id10, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                oki.h.r2(cVar.u);
                cVar.l2(new l(cVar, null, 1), new yi5.b(26));
                return cVar.X1(new y0("DEBT_WAS_DELETED_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.credit_application_outstanding_debts_delete_dialog_success, v.k(bVar.P5(), new TextLocalisedClause(cp5.c.w(bVar.c4()), null, null, 14)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.debts.c cVar3 = this.f242981w;
                m mVar = new m(cVar3, this.f242982x, null, 0);
                this.v = 1;
                Object objP2 = cVar3.p2(this, mVar);
                return objP2 == aVar2 ? aVar2 : objP2;
        }
    }
}
