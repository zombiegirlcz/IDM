package ebf;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferCreateRequest;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.TransferOutReviewScreenContract$InputData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a f124331w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f124331w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f124331w, continuation, 0);
            default:
                return new o(this.f124331w, continuation, 1);
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
        switch (this.u) {
            case 0:
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a aVar = this.f124331w;
                TransferOutReviewScreenContract$InputData transferOutReviewScreenContract$InputData = aVar.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    o9f.c cVar = aVar.f91645p;
                    TransferCreateRequest transferCreateRequest = new TransferCreateRequest(u8f.d.OUT, transferOutReviewScreenContract$InputData.f91641a, transferOutReviewScreenContract$InputData.f91642b, transferOutReviewScreenContract$InputData.f91643c);
                    String string = transferOutReviewScreenContract$InputData.d.getF105262a().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                    this.v = 1;
                    if (cVar.a(transferCreateRequest, string, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.a1(aVar, aVar.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.trading_stocks_transfer_in_completion_status_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new n(aVar, null, 2), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.trading.transfer.investments.impl.ui.transfer_out_create_revamp.screens.review.a aVar4 = this.f124331w;
                o oVar = new o(aVar4, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(aVar4.k, "TransferOutReviewScreenModel_submit", oVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
