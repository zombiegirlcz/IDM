package u90;

import com.revolut.feature.backend_flow.domain.models.ExternalValidation;
import com.revolut.feature.backend_flow.domain.models.MaxLengthValidation;
import com.revolut.feature.backend_flow.domain.models.MinLengthValidation;
import com.revolut.feature.backend_flow.domain.models.RegexValidation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import q90.k1;
import q90.w3;
import q90.y3;

/* JADX INFO: loaded from: classes19.dex */
public final class z0 {
    public static ArrayList a(List validations) {
        Intrinsics.checkNotNullParameter(validations, "validations");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = validations.iterator();
        while (it8.hasNext()) {
            zhm.a0.x(b((w3) it8.next()), arrayList);
        }
        return arrayList;
    }

    public static aim.e b(w3 w3Var) {
        aim.e eVarB = zhm.u.b();
        if (w3Var instanceof q90.a1) {
            q90.a1 a1Var = (q90.a1) w3Var;
            if (a1Var.getMinLength() != null) {
                eVarB.add(new MinLengthValidation(a1Var.getMinLength().intValue(), a1Var.getMessage()));
            }
            if (a1Var.getMaxLength() != null) {
                eVarB.add(new MaxLengthValidation(a1Var.getMaxLength().intValue(), a1Var.getMessage()));
            }
            if (a1Var.getPattern() != null) {
                eVarB.add(new RegexValidation(a1Var.getPattern(), a1Var.getMessage()));
            }
        } else if (w3Var instanceof y3) {
            y3 y3Var = (y3) w3Var;
            if (y3Var.getMinLength() != null) {
                eVarB.add(new MinLengthValidation(y3Var.getMinLength().intValue(), y3Var.getMessage()));
            }
            if (y3Var.getMaxLength() != null) {
                eVarB.add(new MaxLengthValidation(y3Var.getMaxLength().intValue(), y3Var.getMessage()));
            }
            if (y3Var.getPattern() != null) {
                eVarB.add(new RegexValidation(y3Var.getPattern(), y3Var.getMessage()));
            }
        } else {
            if (!(w3Var instanceof k1)) {
                throw new NoWhenBranchMatchedException();
            }
            eVarB.add(new ExternalValidation(((k1) w3Var).getMessage()));
        }
        return zhm.u.a(eVarB);
    }
}
