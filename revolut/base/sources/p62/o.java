package p62;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.h0;
import nii.j;
import nii.j0;
import nii.u1;
import nii.y0;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.iris.impl.ui.settings.a f233213w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.apm.iris.impl.ui.settings.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f233213w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f233213w, continuation, 0);
            default:
                return new o(this.f233213w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB0;
        y0 y0Var;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.apm.iris.impl.ui.settings.a aVar2 = this.f233213w;
                c62.e eVar = aVar2.f62533p;
                ApmPaymentProfile apmPaymentProfile = aVar2.o.f62531a;
                this.v = 1;
                Object objD = ((iz1.h) ((c62.i) eVar).f21592a).d(c62.i.b(apmPaymentProfile).f21586a, null, this);
                return objD == aVar ? aVar : objD;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                com.revolut.feature.apm.iris.impl.ui.settings.a aVar4 = this.f233213w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    o oVar = new o(aVar4, continuation, 0);
                    this.v = 1;
                    objB0 = u0.b0(aVar4.X(), "REGISTER_LOADING_TAG", oVar, this);
                    if (objB0 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB0 = obj2;
                }
                i02.h hVar = (i02.h) objB0;
                if (Intrinsics.f(hVar, i02.f.f157280a)) {
                    y0Var = new y0(null, new j0((Clause) new TextLocalisedClause(R$string.apm_registration_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5);
                } else {
                    if (!Intrinsics.f(hVar, i02.g.f157281a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    y0Var = new y0(null, new g0(new TextLocalisedClause(R$string.apm_registration_pending_dialog_title, null, null, 14), new TextLocalisedClause(R$string.apm_registration_pending_dialog_subtitle, null, null, 14), null, null, null, null, null, j.b.f216170a, false, null, false, null, 16252), false, 5);
                }
                return yji.l.a1(aVar4, aVar4.X1(y0Var), null, null, new n(aVar4, null, 0), 3);
        }
    }
}
