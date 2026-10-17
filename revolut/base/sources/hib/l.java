package hib;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.salary_account.impl.R$string;
import fib.s;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.y0;
import nii.z;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f152585b;

    public /* synthetic */ l(q qVar, int i) {
        this.f152584a = i;
        this.f152585b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f152584a;
        q qVar = this.f152585b;
        switch (i) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "WorkEmailInputControllerModel", null, it8, h0Var);
                qVar.s1();
                return Boolean.TRUE;
            default:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "WorkEmailInputControllerModel", null, it9, h0Var2);
                cib.a aVar = qVar.f152592r;
                qVar.f152593s.getClass();
                fib.r rVarA = s.a(it9);
                if (rVarA.equals(fib.n.f135377a)) {
                    qVar.C2(g.f152578a);
                } else if (rVarA.equals(fib.p.f135379a)) {
                    aVar.getClass();
                    qVar.X1(new y0("ID_VERIFY_EMPLOYMENT_NOT_ELIGIBLE_ERROR", new l0(new TextLocalisedClause(R$string.salaried_growth_work_email_verification_bottom_sheet_error_title, null, null, 14), new TextLocalisedClause(R$string.salaried_growth_work_email_verification_bottom_sheet_error_description, null, null, 14), null, new TextLocalisedClause(R$string.salaried_growth_work_email_verification_bottom_sheet_error_action, null, null, 14), null, null, false, null, 1012), false, 4));
                } else {
                    if (!rVarA.equals(fib.l.f135375a) && !rVarA.equals(fib.m.f135376a) && !rVarA.equals(fib.o.f135378a) && !rVarA.equals(fib.q.f135380a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar.getClass();
                    qVar.X1(new y0("ID_VERIFY_EMPLOYMENT_ERROR", new z(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_error_title, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.error_generic, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_ok, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4));
                }
                return Boolean.TRUE;
        }
    }
}
