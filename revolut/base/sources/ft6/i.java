package ft6;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {
    public static Clause a(i iVar, do3.n user) {
        wi0.b bVarG;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        String strI = te0.w.I(user);
        Address address = user.k;
        if (address != null) {
            Intrinsics.checkNotNullParameter(address, "<this>");
            bVarG = nz8.d.g(address);
        } else {
            bVarG = null;
        }
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVarG, wi0.b.f297760n0) ? yoj.b.w(yoj.b.w(new TextClause(strI, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null)), new TextLocalisedClause(R$string.freelancer_common_title_entrepreneur_individuel, null, null, 14)) : new TextClause(strI, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
