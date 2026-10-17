package dnk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import ggk.d1;
import ggk.m0;
import ggk.n0;
import ggk.o0;
import ggk.u0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static m0 a(String str, d1 d1Var) {
        Integer numM;
        String str2 = (String) d0.e0(1, kotlin.text.d0.n0(str, new String[]{"---"}, 0, 6));
        if (str2 == null || (numM = z.m(str2)) == null) {
            return null;
        }
        int iIntValue = numM.intValue();
        List list = d1Var != null ? d1Var.f143709c : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return (m0) d0.e0(iIntValue, list);
    }

    public static n0 b(String str, List list) {
        String str2;
        Integer numM;
        Object next;
        if (list != null) {
            List listN0 = kotlin.text.d0.n0(str, new String[]{"---"}, 0, 6);
            String str3 = (String) d0.e0(1, listN0);
            if (str3 != null && (str2 = (String) d0.e0(2, listN0)) != null && (numM = z.m(str2)) != null) {
                int iIntValue = numM.intValue();
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (((o0) next).f143763a.equals(str3)) {
                        break;
                    }
                }
                o0 o0Var = (o0) next;
                if (o0Var != null) {
                    return (n0) d0.e0(iIntValue, o0Var.d);
                }
            }
        }
        return null;
    }

    public static PlansDashboardLayout$PlanPageLayout$BottomSheet c(String id10, List list, d1 d1Var) {
        m0 m0VarA;
        Intrinsics.checkNotNullParameter(id10, "id");
        if (a0.H(id10, "benefit", false)) {
            n0 n0VarB = b(id10, list);
            if (n0VarB != null) {
                return n0VarB.f;
            }
            return null;
        }
        if (!a0.H(id10, "app", false) || (m0VarA = a(id10, d1Var)) == null) {
            return null;
        }
        return m0VarA.e;
    }

    public static u0 d(String str, List list, d1 d1Var) {
        m0 m0VarA;
        if (a0.H(str, "benefit", false)) {
            n0 n0VarB = b(str, list);
            if (n0VarB != null) {
                return n0VarB.f143758c;
            }
            return null;
        }
        if (!a0.H(str, "app", false) || (m0VarA = a(str, d1Var)) == null) {
            return null;
        }
        return m0VarA.f143753c;
    }
}
