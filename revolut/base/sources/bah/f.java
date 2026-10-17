package bah;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z0h.f1;
import z0h.k1;
import z0h.r;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements pzg.a {
    public f(aah.b parcelWrapper) {
        Intrinsics.checkNotNullParameter(parcelWrapper, "parcelWrapper");
    }

    @Override // pzg.a
    public final Clause a(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        r rVar = disclaimer instanceof r ? (r) disclaimer : null;
        if (rVar != null) {
            switch (e.f14078a[rVar.f318552b.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 7:
                    return new TextLocalisedClause(R$string.wealthcore_footer_disclosure_general_uk_services_provided_by_revolut_link, null, new Click(28, (Integer) null, aah.b.a(k1.f318523a, ((r) disclaimer).f318553c), "GENERAL_DISCLOSURES", false), 10);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    @Override // pzg.a
    public final boolean b(f1 disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        return disclaimer instanceof r;
    }
}
