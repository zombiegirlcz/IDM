package wa4;

import al4.n;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import om4.x2;
import t61.g;
import yhm.o;
import yji.l;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f295810w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f295811x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, g gVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f295810w = eVar;
        this.f295811x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f295810w, this.f295811x, continuation, 0);
            default:
                return new d(this.f295810w, this.f295811x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objW;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                g gVar = this.f295811x;
                e eVar = this.f295810w;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    dx3.a aVar2 = eVar.f295814r;
                    String str = eVar.f295812p.f67642b;
                    switch (aVar2.f120540a) {
                        case 0:
                            objW = ((x2) ((n) aVar2.f120541b)).w(str, gVar.f268137a, this);
                            if (objW != fim.a.COROUTINE_SUSPENDED) {
                                objW = Unit.f186387a;
                            }
                            break;
                        default:
                            objW = nim.a.a(((y45.f) ((l35.b) aVar2.f120541b)).g(str, gVar.f268137a), this);
                            if (objW != fim.a.COROUTINE_SUSPENDED) {
                                objW = Unit.f186387a;
                            }
                            break;
                    }
                    if (objW != aVar) {
                        objW = Unit.f186387a;
                    }
                    if (objW == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return l.a1(eVar, eVar.X1(new y0("EMERGENCY_PAYMENT_COMPLETE_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.emergency_payment_setup_select_card_success_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.emergency_payment_setup_select_card_success_description, u.c("··" + gVar.d), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new w65.c(eVar, null, 11), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                e eVar2 = this.f295810w;
                d dVar = new d(eVar2, this.f295811x, null, 0);
                this.v = 1;
                Object objP2 = eVar2.p2(this, dVar);
                return objP2 == aVar3 ? aVar3 : objP2;
        }
    }
}
