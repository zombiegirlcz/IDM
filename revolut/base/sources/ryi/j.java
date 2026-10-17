package ryi;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import dwi.s;
import gwi.h1;
import hwi.a0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.j0;
import nii.u1;
import nii.y0;
import pfm.r;
import te0.w;
import vkm.j2;
import yhm.o;
import yji.l;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a f258385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f258386x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar, ArrayList arrayList, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f258385w = aVar;
        this.f258386x = arrayList;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f258385w, this.f258386x, continuation, 0);
            default:
                return new j(this.f258385w, this.f258386x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        int i = this.u;
        ArrayList entriesIds = this.f258386x;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    s sVar = this.f258385w.o;
                    sVar.getClass();
                    Intrinsics.checkNotNullParameter(entriesIds, "refundIds");
                    a0 a0Var = (a0) sVar.f120458a;
                    a0Var.getClass();
                    Intrinsics.checkNotNullParameter(entriesIds, "entriesIds");
                    r rVarG0 = w.g0(a0Var.f156188a.postRefundRequest(new h1(entriesIds)));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                int i5 = 0;
                Continuation continuation = null;
                com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.a aVar3 = this.f258385w;
                if (i3 == 0) {
                    o.b(obj2);
                    j jVar = new j(aVar3, entriesIds, continuation, i5);
                    this.v = 1;
                    if (aVar3.p2(this, jVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                g gVar = ((c) ((j2) aVar3.f99146q.f22677a).getValue()).f258378c;
                qwi.c cVar = aVar3.f99145p;
                dj0.d totalAmountRefunded = gVar.f258381a;
                Double d = gVar.f258382b;
                double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(totalAmountRefunded, "totalAmountRefunded");
                if (!totalAmountRefunded.k() && dDoubleValue > 0.0d) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.airport_lounges_refund_success_prompt_mixed_description, v.k(new MoneyClause(totalAmountRefunded, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new NumberClause(new BigDecimal(String.valueOf(dDoubleValue)), null, null, null, 14)), null, 12);
                } else if (!totalAmountRefunded.k()) {
                    textLocalisedClause2 = new TextLocalisedClause(R$string.airport_lounges_refund_success_prompt_description, u.c(new MoneyClause(totalAmountRefunded, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
                } else {
                    if (dDoubleValue <= 0.0d) {
                        IllegalStateException illegalStateException = new IllegalStateException("Both totalAmountRefunded and totalPointsRefunded have zero values");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        textLocalisedClause = null;
                        l.a1(aVar3, aVar3.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.airport_lounges_refund_success_prompt_title, null, null, 14), (Clause) textLocalisedClause, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new i(aVar3, null), 3);
                        return Unit.f186387a;
                    }
                    textLocalisedClause2 = new TextLocalisedClause(R$string.airport_lounges_refund_success_prompt_points_description, u.c(new NumberClause(new BigDecimal(String.valueOf(dDoubleValue)), null, null, null, 14)), null, 12);
                }
                textLocalisedClause = textLocalisedClause2;
                l.a1(aVar3, aVar3.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.airport_lounges_refund_success_prompt_title, null, null, 14), (Clause) textLocalisedClause, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new i(aVar3, null), 3);
                return Unit.f186387a;
        }
    }
}
