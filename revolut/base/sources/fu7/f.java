package fu7;

import com.revolut.feature.insurance_embedded.impl.data.model.CfacPolicy;
import com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout;
import du7.d2;
import du7.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static final CoverageDetailsLayout.FooterButton.Action a(d2 d2Var) {
        Intrinsics.checkNotNullParameter(d2Var, "<this>");
        if (d2Var instanceof d2.f) {
            d2.f fVar = (d2.f) d2Var;
            return new CoverageDetailsLayout.FooterButton.Action.Upgrade(fVar.f117636a, fVar.f117637b);
        }
        if (d2Var instanceof d2.d) {
            return CoverageDetailsLayout.FooterButton.Action.MakeClaim.INSTANCE;
        }
        dl7.a aVar = null;
        if (!(d2Var instanceof d2.c)) {
            if (d2Var instanceof d2.b) {
                return new CoverageDetailsLayout.FooterButton.Action.Deeplink(((d2.b) d2Var).f117629a);
            }
            if (d2Var instanceof d2.e) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        e0 e0Var = ((d2.c) d2Var).f117631a;
        String str = e0Var.f117659a;
        String str2 = e0Var.f117660b;
        dl7.a[] aVarArrValues = dl7.a.values();
        int length = aVarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            dl7.a aVar2 = aVarArrValues[i];
            if (a0.z(aVar2.name(), str2, true)) {
                aVar = aVar2;
                break;
            }
            i++;
        }
        if (aVar == null) {
            aVar = dl7.a.UNKNOWN;
        }
        return new CoverageDetailsLayout.FooterButton.Action.MakeCfacClaim(new CfacPolicy(str, aVar));
    }
}
