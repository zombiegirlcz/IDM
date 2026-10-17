package wu9;

import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.t0;
import kotlin.sequences.Sequence;
import kp0.t;
import nkm.y;
import zhm.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static t a(dv9.h hVar) {
        if (hVar != null) {
            List list = hVar.f;
            if (!list.isEmpty()) {
                Sequence sequenceH = y.H(y.k(y.x(d0.Q(list), new wsg.a(25))), 4);
                m70.a.c(t0.f186434a);
                return new t(y.u(sequenceH, "", null, 62), list.size() > 1 ? Integer.valueOf(list.size()) : null, new TextLocalisedClause(R$string.uikit_common_accessibility_custom_action_reactions, null, null, 14));
            }
        }
        return null;
    }
}
