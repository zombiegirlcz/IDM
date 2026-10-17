package com.revolut.feature.apm.multibanco.impl.ui.enrollment;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.ui.enrollment.MultibancoExternalEnrollmentFlowContract$Step;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import do3.q;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MultibancoExternalEnrollmentFlowContract$Step.Confirmation f62583w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, MultibancoExternalEnrollmentFlowContract$Step.Confirmation confirmation, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f62583w = confirmation;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f62583w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            a aVar2 = new a(dVar, this.f62583w, null);
            this.u = 1;
            if (q.t(dVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return l.a1(dVar, dVar.X1(new y0("ID_ENROLLMENT_SUCCESS_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.multibanco_external_enrollment_card_linked, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new s1k.b(dVar, continuation, 10), 3);
    }
}
