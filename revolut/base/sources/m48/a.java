package m48;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.joint.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yfe.b1;
import yfe.c1;
import yfe.d1;
import yfe.h;
import yfe.i1;
import yfe.l1;
import yfe.m1;
import yfe.n;
import yfe.p0;
import yfe.q0;
import yfe.y0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements yfe.b {
    public static y0 c(m1 m1Var) {
        if (m1Var instanceof l1) {
            return new c1(((l1) m1Var).f313281a);
        }
        if (!(m1Var instanceof i1)) {
            throw new NoWhenBranchMatchedException();
        }
        i1 i1Var = (i1) m1Var;
        return new y0.a(i1Var.f313268a, i1Var.f313269b, i1Var.f313270c, null, 8);
    }

    @Override // yfe.b
    public final p0 a(h.c cVar) {
        h.c.b snapshot = (h.c.b) cVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return new p0(R$drawable.uikit_icn_24_joint, new TextLocalisedClause(R$string.accountHome_tab_joint_title, null, null, 14), new TextLocalisedClause(R$string.joint_total_wealth_empty_tile_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
    }

    @Override // yfe.b
    public final q0 b(h.a aVar) {
        n snapshot = (n) aVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return new q0(new TextLocalisedClause(R$string.accountHome_tab_joint_title, null, null, 14), snapshot.f313283c, new d1(v13.d.Z(v.k(c(snapshot.e), c(snapshot.f)), new b1(R$drawable.uikit_icn_24_joint)), false), null, 56);
    }
}
