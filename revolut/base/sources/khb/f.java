package khb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.retail.salary_account.impl.R$string;
import dda.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f184093a;

    public f(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f184093a = uiKitResources;
    }

    public final String a(ArrayList arrayList, lhb.c cVar) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!d0.W((String) obj2)) {
                arrayList2.add(obj2);
            }
        }
        g gVar = cVar.f195233a.f113170g;
        Iterable iterable = gVar != null ? gVar.f113177b : null;
        if (iterable == null) {
            iterable = f0.f322471a;
        }
        List listK = v.k(zhm.d0.k0(iterable, m70.a.o(t0.f186434a), null, null, 0, new ke7.v(this, 6), 30), cVar.f195234b);
        return this.f184093a.b(arrayList2.isEmpty() ? new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_email_body, listK, null, 12) : new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_email_body_with_name, zhm.d0.E0(listK, u.c(zhm.d0.k0(arrayList2, null, null, null, 0, null, 63))), null, 12)).toString();
    }
}
