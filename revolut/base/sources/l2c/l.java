package l2c;

import android.accounts.Account;
import android.database.Cursor;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.loan.api.models.rev10.LoanDetails;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$DomainState;
import com.revolut.feature_retail_user_declarations.terms_review.flow.TermsReviewFlowContract$State;
import ip0.jm0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import pjl.h0;
import zh9.k1;
import zh9.m1;
import zh9.o1;
import zh9.r0;
import zh9.y;
import zhm.a1;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f191750b;

    public /* synthetic */ l(int i, int i2) {
        this.f191749a = i2;
        this.f191750b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i;
        Object next;
        switch (this.f191749a) {
            case 0:
                g update = (g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return g.a(update, 0, new i(this.f191750b), null, null, null, null, 61);
            case 1:
                TermsReviewFlowContract$State update2 = (TermsReviewFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                update2.getClass();
                return new TermsReviewFlowContract$State(this.f191750b);
            case 2:
                mj6.g update3 = (mj6.g) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Set set = update3.f205930b;
                int i2 = this.f191750b;
                return mj6.g.a(update3, null, set.contains(Integer.valueOf(i2)) ? a1.j(set, Integer.valueOf(i2)) : a1.m(set, Integer.valueOf(i2)), 1);
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                jm0 jm0Var = new jm0("PERFORMANCE_CHART_LIST_ID", null, f0.f322471a, false, null, null, this.f191750b, true, 230, null, false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -454);
                int i3 = R$attr.uikit_dp0;
                int i5 = R$attr.uikit_dp16;
                yp0.b.p(jm0Var, i3, i3, i5, i5);
                return zhm.u.c(jm0Var);
            case 4:
                ovb.e update4 = (ovb.e) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return ovb.e.a(update4, null, null, Integer.valueOf(this.f191750b + 1), null, null, null, false, 123);
            case 5:
                ovb.e update5 = (ovb.e) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return ovb.e.a(update5, null, null, Integer.valueOf(this.f191750b - 1), null, null, null, false, 123);
            case 6:
                ox5.l update6 = (ox5.l) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return ox5.l.a(update6, null, null, null, null, null, null, null, null, this.f191750b, null, null, false, null, null, false, 32511);
            case 7:
                p5e.e updateState = (p5e.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return p5e.e.a(updateState, null, null, null, this.f191750b, 31);
            case 8:
                Cursor it8 = (Cursor) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                rlm.o oVar = h0.f236817b;
                bkl.a aVar = h0.f236816a;
                String string = it8.getString(this.f191750b);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return (Account) oVar.b(aVar, string);
            case 9:
                pmb.d update7 = (pmb.d) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return pmb.d.a(update7, null, null, this.f191750b, 11);
            case 10:
                q5g.s update8 = (q5g.s) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                Set set2 = update8.i;
                int i6 = this.f191750b;
                return q5g.s.a(update8, null, null, null, null, null, null, false, set2.contains(Integer.valueOf(i6)) ? a1.j(set2, Integer.valueOf(i6)) : a1.m(set2, Integer.valueOf(i6)), 255);
            case 11:
                return qna.f.a((qna.f) obj2, null, null, null, Integer.valueOf(this.f191750b), null, null, false, LDSFile.EF_SOD_TAG);
            case 12:
                ((qnk.c) obj2).getClass();
                return new qnk.c(this.f191750b);
            case 13:
                r5e.f update9 = (r5e.f) obj2;
                Intrinsics.checkNotNullParameter(update9, "$this$update");
                Data data = update9.f251589a;
                update9.getClass();
                return new r5e.f(data, this.f191750b);
            case 14:
                r65.c updateState2 = (r65.c) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                int i21 = this.f191750b + 1;
                LoanDetails loanDetails = updateState2.f251634a;
                Intrinsics.checkNotNullParameter(loanDetails, "loanDetails");
                return new r65.c(loanDetails, i21);
            case 15:
                rm2.h update10 = (rm2.h) obj2;
                Intrinsics.checkNotNullParameter(update10, "$this$update");
                Map map = update10.f255186a;
                if (map != null) {
                    return rm2.h.a(update10, null, null, false, (em2.b) d0.d1(map.keySet()).get(this.f191750b), 23);
                }
                throw new IllegalStateException("Required value was null.");
            case 16:
                rrg.b updateState3 = (rrg.b) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                List images = updateState3.f256833a;
                Intrinsics.checkNotNullParameter(images, "images");
                return new rrg.b(images, this.f191750b);
            case 17:
                List data2 = (List) obj2;
                Intrinsics.checkNotNullParameter(data2, "data");
                return new hw5.a(this.f191750b, data2, data2.isEmpty());
            case 18:
                s65.f update11 = (s65.f) obj2;
                Intrinsics.checkNotNullParameter(update11, "$this$update");
                return s65.f.a(update11, this.f191750b + 1, null, 5);
            case 19:
                return sai.f.a((sai.f) obj2, null, this.f191750b, null, false, 13);
            case 20:
                r0 plan = (r0) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                for (zh9.p pVar : plan.B) {
                    if (pVar.f322316a == this.f191750b) {
                        return new y(pVar, plan);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 21:
                o1 options = (o1) obj2;
                Intrinsics.checkNotNullParameter(options, "options");
                Iterator it9 = options.f322315a.iterator();
                while (true) {
                    boolean zHasNext = it9.hasNext();
                    i = this.f191750b;
                    if (zHasNext) {
                        next = it9.next();
                        if (((m1) next).a() == i) {
                        }
                    } else {
                        next = null;
                    }
                }
                k1 k1Var = next instanceof k1 ? (k1) next : null;
                if (k1Var != null) {
                    return k1Var;
                }
                throw new IllegalStateException(("There is no available option by term = " + i).toString());
            case 22:
                tma.e eVar = (tma.e) obj2;
                int i22 = this.f191750b;
                boolean z = i22 == 0;
                long j2 = eVar.f272169a;
                String email = eVar.f272170b;
                Intrinsics.checkNotNullParameter(email, "email");
                return new tma.e(email, i22, j2, z);
            case 23:
                uai.a aVar2 = (uai.a) obj2;
                int i32 = this.f191750b;
                boolean z3 = i32 > 0;
                aVar2.getClass();
                return new uai.a(z3, i32);
            case 24:
                uj6.k update12 = (uj6.k) obj2;
                Intrinsics.checkNotNullParameter(update12, "$this$update");
                Set set3 = update12.f280497c;
                int i33 = this.f191750b;
                return uj6.k.a(update12, null, null, set3.contains(Integer.valueOf(i33)) ? a1.j(set3, Integer.valueOf(i33)) : a1.m(set3, Integer.valueOf(i33)), null, null, 27);
            case 25:
                PortfolioSpareChangeScreenContract$DomainState update13 = (PortfolioSpareChangeScreenContract$DomainState) obj2;
                Intrinsics.checkNotNullParameter(update13, "$this$update");
                return PortfolioSpareChangeScreenContract$DomainState.a(update13, null, Integer.valueOf(this.f191750b), null, null, null, null, 61);
            case 26:
                urd.a update14 = (urd.a) obj2;
                Intrinsics.checkNotNullParameter(update14, "$this$update");
                return urd.a.a(update14, null, null, this.f191750b, null, null, null, 239);
            case 27:
                uxe.m update15 = (uxe.m) obj2;
                Intrinsics.checkNotNullParameter(update15, "$this$update");
                Set set4 = update15.f283996b;
                int i43 = this.f191750b;
                return uxe.m.a(update15, null, set4.contains(Integer.valueOf(i43)) ? a1.j(set4, Integer.valueOf(i43)) : a1.m(set4, Integer.valueOf(i43)), 1);
            case 28:
                vlk.m update16 = (vlk.m) obj2;
                Intrinsics.checkNotNullParameter(update16, "$this$update");
                Data layout = update16.f290488a;
                Intrinsics.checkNotNullParameter(layout, "layout");
                return new vlk.m(layout, this.f191750b);
            default:
                return wk2.k.a((wk2.k) obj2, false, null, false, false, false, 0, 0, 0, false, null, null, null, null, Integer.valueOf(this.f191750b), 8191);
        }
    }

    public /* synthetic */ l(o6f.k kVar, int i) {
        this.f191749a = 3;
        this.f191750b = i;
    }
}
