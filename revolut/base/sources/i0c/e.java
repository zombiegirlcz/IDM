package i0c;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.models.TermsInfo;
import com.revolut.feature.rev_points.models.TermsToReview;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import gim.i;
import hwi.l0;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import pfm.r;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends i implements Function1 {
    public com.revolut.feature.rev_points.impl.ui.terms_review.flow.a u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f157347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f157348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.terms_review.flow.a f157349y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.rev_points.impl.ui.terms_review.flow.a aVar, Continuation continuation) {
        super(1, continuation);
        this.f157349y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f157349y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Iterator it8;
        int i;
        com.revolut.feature.rev_points.impl.ui.terms_review.flow.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.f157348x;
        com.revolut.feature.rev_points.impl.ui.terms_review.flow.a aVar3 = this.f157349y;
        if (i2 == 0) {
            o.b(obj2);
            it8 = aVar3.o.f83546a.iterator();
            i = 0;
            aVar = aVar3;
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f157347w;
            it8 = this.v;
            aVar = this.u;
            o.b(obj2);
        }
        while (it8.hasNext()) {
            TermsInfo termsInfo = ((TermsToReview) it8.next()).f84099a;
            if (termsInfo instanceof TermsInfo.Full) {
                r rVarB = pre.c.b(aVar.f83846p, ((TermsInfo.Full) termsInfo).f84096a.f90355a);
                this.u = aVar;
                this.v = it8;
                this.f157347w = i;
                this.f157348x = 1;
                if (nim.a.a(rVarB, this) == aVar2) {
                    return aVar2;
                }
            } else if (termsInfo instanceof TermsInfo.Id) {
                r rVarB2 = pre.c.b(aVar.f83846p, ((TermsInfo.Id) termsInfo).f84097a);
                this.u = aVar;
                this.v = it8;
                this.f157347w = i;
                this.f157348x = 2;
                if (nim.a.a(rVarB2, this) == aVar2) {
                    return aVar2;
                }
            } else {
                if (!(termsInfo instanceof TermsInfo.Scope)) {
                    throw new NoWhenBranchMatchedException();
                }
                pfm.a aVarA = pre.c.a(aVar.f83846p, ((TermsInfo.Scope) termsInfo).f84098a);
                this.u = aVar;
                this.v = it8;
                this.f157347w = i;
                this.f157348x = 3;
                if (nim.a.a(aVarA, this) == aVar2) {
                    return aVar2;
                }
            }
        }
        l.b1(aVar3, aVar3.X1(new y0("SUCCESS_DOCUSIGN_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.rev_points_terms_review_signed, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, new l0(aVar3, null, 7), 3);
        return Unit.f186387a;
    }
}
