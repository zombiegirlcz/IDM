package sik;

import a3i.t;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import ffk.e0;
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

/* JADX INFO: loaded from: classes11.dex */
public final class h extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g f263654w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f263655x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ oki.g f263656y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar, String str, oki.g gVar2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f263654w = gVar;
        this.f263655x = str;
        this.f263656y = gVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f263654w, this.f263655x, this.f263656y, continuation, 0);
            default:
                return new h(this.f263654w, this.f263655x, this.f263656y, continuation, 1);
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
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar = this.f263654w;
                if (i == 0) {
                    o.b(obj2);
                    e0 e0Var = gVar.f103296t;
                    this.v = 1;
                    if (e0Var.a(this.f263655x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                l.a1(gVar, gVar.X1(new y0("student_verification_success_dialog", new j0((Clause) new TextLocalisedClause(R$string.student_plans_email_verification_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.f(gVar, this.f263656y, null), 3);
                return Unit.f186387a;
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
                oki.g gVar2 = this.f263656y;
                String str = this.f263655x;
                com.revolut.retail.feature.pricing_plans.ui.impl.flows.student_verification.g gVar3 = this.f263654w;
                t tVar = new t(5, gVar2, str, (Continuation) null, gVar3);
                this.v = 1;
                Object objB = pu7.a.B(gVar3.k, "submit_verification", tVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
