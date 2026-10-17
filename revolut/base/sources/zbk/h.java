package zbk;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import yg5.r;
import yhm.o;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d f320960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f320961x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f320960w = dVar;
        this.f320961x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f320960w, this.f320961x, continuation, 0);
            default:
                return new h(this.f320960w, this.f320961x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar = this.f320960w;
                    tbk.e eVar = dVar.f102474q;
                    String str = dVar.f102478w;
                    this.v = 1;
                    if (eVar.a(this.f320961x, str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.d dVar2 = this.f320960w;
                if (i2 == 0) {
                    o.b(obj2);
                    r rVar = new r(dVar2, this.f320961x, continuation, 24);
                    this.v = 1;
                    if (u0.b0(dVar2.X(), "DECLINE_BUTTON_LOADING_TAG", rVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                dVar2.f102473p.getClass();
                l.b1(dVar2, dVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.plan_gifting_claiming_decline_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, new g(dVar2, null, 1), 3);
                return Unit.f186387a;
        }
    }
}
