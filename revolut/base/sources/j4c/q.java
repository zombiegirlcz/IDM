package j4c;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import ix6.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.c0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gim.i f171353w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(u uVar, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.v = uVar;
        this.f171353w = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.v, this.f171353w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objInvoke;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            uVar.X1(new y0(null, new c0(new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_order_section_invoice_dialog_loading_title, null, null, 14), null, null, false, null, false, false, null, 2046), false, 5));
            this.u = 1;
            objInvoke = this.f171353w.invoke(this);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objInvoke = obj2;
        }
        return yji.l.b1(uVar, uVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_order_section_invoice_dialog_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) u1.b.f216225a, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4078), false, 5)), null, new l0(uVar, (d3c.e) objInvoke, continuation, 7), 3);
    }
}
