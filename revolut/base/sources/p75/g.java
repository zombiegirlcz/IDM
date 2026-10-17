package p75;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import o55.z;
import te0.w;
import vkm.q;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f233554w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f233554w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f233554w, continuation, 0);
            default:
                return new g(this.f233554w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    h hVar = this.f233554w;
                    l35.b bVar = hVar.f233556q;
                    String loanId = hVar.f233555p.f70486a.f70108a;
                    String str = ((e) hVar.t2()).f233551b;
                    if (str == null) {
                        str = "";
                    }
                    String name = d0.F0(str).toString();
                    y45.f fVar = (y45.f) bVar;
                    fVar.getClass();
                    Intrinsics.checkNotNullParameter(loanId, "loanId");
                    Intrinsics.checkNotNullParameter(name, "name");
                    z zVar = fVar.f310794a;
                    zVar.getClass();
                    Intrinsics.checkNotNullParameter(loanId, "loanId");
                    Intrinsics.checkNotNullParameter(name, "name");
                    pfm.a aVarE = w.g0(zVar.f222381a.renameLoan(loanId, new l55.d(name))).e(fVar.r(loanId));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    this.v = 1;
                    if (nim.a.a(aVarE, this) == aVar) {
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
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                h hVar2 = this.f233554w;
                int i3 = 2;
                if (i2 == 0) {
                    o.b(obj2);
                    g gVar = new g(hVar2, continuation, 0);
                    this.v = 1;
                    if (hVar2.p2(this, gVar) == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        hVar2.u2();
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                Object objY = q.y(hVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.loan_rename_loan_success, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), new m84.c(i3, 23, continuation), this);
                if (objY != obj3) {
                    objY = Unit.f186387a;
                }
                if (objY == obj3) {
                    return obj3;
                }
                hVar2.u2();
                return Unit.f186387a;
        }
    }
}
