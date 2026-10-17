package zjc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.bank_account_switching.api.R$string;
import com.revolut.feature.bank_account_switching.impl.domain.CardDigits;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.description.flow.CreditCardBeDrivenDescriptionFlowContract$InputData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import cp4.x;
import dp4.w;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import skm.e0;
import skm.p0;
import ufm.n;
import vkm.j2;
import vkm.q;
import vkm.y;
import yhm.o;
import zfd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yji.l f322784w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, Continuation continuation, yji.l lVar) {
        super(1, continuation);
        this.u = i;
        this.f322784w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(0, continuation, (h) this.f322784w);
            case 1:
                return new g(1, continuation, (com.revolut.feature.bank_account_switching.impl.ui.review.b) this.f322784w);
            case 2:
                return new g(2, continuation, (com.revolut.feature.credit.card.impl.ui.description.flow.b) this.f322784w);
            case 3:
                return new g(3, continuation, (com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a) this.f322784w);
            default:
                return new g(4, continuation, (zv6.k) this.f322784w);
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
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        int i = this.u;
        Continuation continuation = null;
        yji.l lVar = this.f322784w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                h hVar = (h) lVar;
                n nVarF = ((ugc.g) hVar.f322785p).f(hVar.o.f322777a);
                this.v = 1;
                Object objB = nim.a.b(nVarF, this);
                return objB == aVar ? aVar : objB;
            case 1:
                com.revolut.feature.bank_account_switching.impl.ui.review.b bVar = (com.revolut.feature.bank_account_switching.impl.ui.review.b) lVar;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    zo2.d dVar = (zo2.d) ((j2) bVar.f63971t.f22677a).getValue();
                    bp2.d dVar2 = bVar.f63967p;
                    BankAccountSwitchingReviewScreenContract$InputData bankAccountSwitchingReviewScreenContract$InputData = bVar.o;
                    mn2.a aVar3 = bankAccountSwitchingReviewScreenContract$InputData.f63961a;
                    wn2.d dVar3 = bankAccountSwitchingReviewScreenContract$InputData.e;
                    FormState formState = dVar.f323858a;
                    LocalDate localDate = dVar.f323859b;
                    wn2.a aVar4 = dVar.d;
                    CardDigits cardDigits = bankAccountSwitchingReviewScreenContract$InputData.f;
                    this.v = 1;
                    pn2.d dVar4 = dVar2.f17546a;
                    dVar4.getClass();
                    ac8.h hVar2 = new ac8.h(aVar3, dVar3, formState, localDate, aVar4, cardDigits, dVar4, null, 24);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, hVar2, this);
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objJ = obj2;
                }
                return yji.l.b1(bVar, bVar.X1(new y0("SUBMISSION_REQUEST_SUCCESS", new j0((Clause) new TextLocalisedClause(R$string.account_switch_request_review_submitted, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, new s(bVar, (String) objJ, (Continuation) null), 3);
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.description.flow.b bVar2 = (com.revolut.feature.credit.card.impl.ui.description.flow.b) lVar;
                lal.a aVar6 = bVar2.f69219p;
                CreditCardBeDrivenDescriptionFlowContract$InputData creditCardBeDrivenDescriptionFlowContract$InputData = bVar2.o;
                String facilityId = creditCardBeDrivenDescriptionFlowContract$InputData.f69215a;
                pl4.a type = creditCardBeDrivenDescriptionFlowContract$InputData.f69216b;
                aVar6.getClass();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(type, "type");
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                w wVar = (w) aVar6.f193426b;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                y yVarD = rd0.e.d(mo3.a.g(new y(wVar.f.b(new x(facilityId, type.getId()), loadingStrategy), new xsd.a(2, 15, continuation)), null, new znc.j(20), 1), zhm.h0.f322473a);
                this.v = 1;
                Object objX = q.x(yVarD, this);
                return objX == aVar5 ? aVar5 : objX;
            case 3:
                com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a aVar7 = (com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a) lVar;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                List list = aVar7.o.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((ql4.j) obj3) != ql4.j.UNKNOWN) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("Repayment methods is empty, expected at least one repayment method");
                }
                this.v = 1;
                Object objI2 = com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a.I2(aVar7, arrayList, this);
                return objI2 == aVar8 ? aVar8 : objI2;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                zv6.k kVar = (zv6.k) lVar;
                n nVarA = kVar.f325587p.a(zv6.k.y2(kVar));
                this.v = 1;
                Object objB2 = nim.a.b(nVarA, this);
                return objB2 == aVar9 ? aVar9 : objB2;
        }
    }
}
