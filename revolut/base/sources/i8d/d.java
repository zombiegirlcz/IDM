package i8d;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.faq.R$string;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import hwi.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.v1;
import nii.y0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f159505w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f159505w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f159505w, continuation, 0);
            default:
                return new d(this.f159505w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    e eVar = this.f159505w;
                    c cVar = new c(eVar, null, 0);
                    this.v = 1;
                    if (eVar.p2(this, cVar) == aVar) {
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
                e eVar2 = this.f159505w;
                Continuation continuation = null;
                if (i2 == 0) {
                    o.b(obj2);
                    c cVar2 = new c(eVar2, continuation, 1);
                    this.v = 1;
                    if (eVar2.p2(this, cVar2) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return l.a1(eVar2, eVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.support_faq_feedback_form_dialog_sent_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.support_faq_feedback_form_dialog_sent_subtitle, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(new TextLocalisedClause(R$string.support_faq_feedback_form_dialog_sent_action, null, null, 14), null), false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4076), false, 5)), null, null, new l0(eVar2, continuation, 24), 3);
        }
    }
}
