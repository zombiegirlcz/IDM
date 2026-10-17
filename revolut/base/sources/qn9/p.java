package qn9;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.payinstore.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l6c.b;
import nii.h0;
import nii.j0;
import nii.k1;
import nii.n1;
import nii.u1;
import nii.v1;
import nii.y0;
import nii.z;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f247891w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f247891w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                p pVar = new p(this.f247891w, continuation, 0);
                pVar.v = obj2;
                return pVar;
            case 1:
                p pVar2 = new p(this.f247891w, continuation, 1);
                pVar2.v = obj2;
                return pVar2;
            case 2:
                p pVar3 = new p(this.f247891w, continuation, 2);
                pVar3.v = obj2;
                return pVar3;
            default:
                p pVar4 = new p(this.f247891w, continuation, 3);
                pVar4.v = obj2;
                return pVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((p) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((p) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((p) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((p) create((l6c.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        q qVar = this.f247891w;
        switch (i) {
            case 0:
                n1 n1Var = (n1) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof k1) {
                    qVar.v2(g.f247882a);
                }
                return Unit.f186387a;
            case 1:
                List list = (List) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.x2(new q2j.j(list, 12));
                return Unit.f186387a;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                qVar.x2(new q65.l(data, 28));
                return Unit.f186387a;
            default:
                l6c.b bVar = (l6c.b) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                on9.a aVar5 = qVar.f247896t;
                Continuation continuation = null;
                if (bVar instanceof l6c.h) {
                    dj0.d amount = new dj0.d(((f) qVar.t2()).f247880b, ((f) qVar.t2()).f247879a);
                    dj0.d cashbackAmount = new dj0.d(((mn9.a) ((f) qVar.t2()).e.getContent()) != null ? r11.f207489c : 0, ((f) qVar.t2()).f247879a);
                    mn9.a aVar6 = (mn9.a) ((f) qVar.t2()).e.getContent();
                    String merchantName = aVar6 != null ? aVar6.f207487a : null;
                    if (merchantName == null) {
                        merchantName = "";
                    }
                    aVar5.getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    Intrinsics.checkNotNullParameter(cashbackAmount, "cashbackAmount");
                    Intrinsics.checkNotNullParameter(merchantName, "merchantName");
                    yji.l.b1(qVar, qVar.X1(new y0("SUCCESS_PAYMENT_DIALOG_ID", new j0((Clause) new TextLocalisedClause(R$string.retail_pay_in_store_flow_payment_screen_payment_status_success_title, v.k(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), merchantName), null, 12), (Clause) new TextLocalisedClause(R$string.retail_pay_in_store_flow_payment_screen_payment_status_success_subtitle, u.c(new MoneyClause(cashbackAmount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new v1(new TextLocalisedClause(R$string.retail_pay_in_store_flow_payment_screen_payment_status_success_button_review_payment_title, null, null, 14), null), true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4044), false, 4)), null, new o4a.b(qVar, bVar, continuation, 27), 3);
                } else if (Intrinsics.f(bVar, b.a.f192384a)) {
                    aVar5.getClass();
                    yji.l.b1(qVar, qVar.X1(new y0("PAYMENT_ALREADY_COMPLETED_ID", new z(new TextLocalisedClause(R$string.retail_pay_in_store_common_error_title, null, null, 14), new TextLocalisedClause(R$string.retail_pay_in_store_flow_payment_screen_payment_status_already_paid_description, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 4)), null, new p(qVar, continuation, 0), 3);
                } else if ((bVar instanceof l6c.e) || (bVar instanceof l6c.f) || (bVar instanceof b.c) || (bVar instanceof l6c.k) || Intrinsics.f(bVar, b.C1094b.f192385a)) {
                    aVar5.getClass();
                    qVar.X1(on9.a.a());
                } else if (bVar instanceof l6c.i) {
                    qVar.s1();
                    qVar.v2(new i(((l6c.i) bVar).f192397a));
                } else if (!(bVar instanceof l6c.j) && !(bVar instanceof l6c.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
