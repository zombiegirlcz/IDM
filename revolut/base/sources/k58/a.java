package k58;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.joint.impl.R$string;
import j38.a;
import j38.b;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public static Clause a(j38.a relationship) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        if (relationship instanceof a.b) {
            return new TextLocalisedClause(R$string.joint_relationship_item_married_or_civil, null, null, 14);
        }
        if (relationship instanceof a.C0967a) {
            return new TextLocalisedClause(R$string.joint_relationship_item_family, null, null, 14);
        }
        if (relationship instanceof a.c) {
            return new TextLocalisedClause(R$string.joint_relationship_item_other, null, null, 14);
        }
        if (relationship instanceof a.d) {
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (relationship instanceof b) {
            return new TextClause(((b) relationship).f170989a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }
}
