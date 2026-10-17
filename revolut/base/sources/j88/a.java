package j88;

import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yfe.a0;
import yfe.a1;
import yfe.d1;
import yfe.h;
import yfe.p0;
import yfe.q0;
import yfe.s0;
import yfe.t0;
import yfe.u0;
import yfe.v0;
import yfe.w;
import yfe.w0;
import yfe.x0;
import yfe.y0;
import yfe.z;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements yfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.b f172156a;

    public a(g6e.b subaccountBackgroundInteractor) {
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        this.f172156a = subaccountBackgroundInteractor;
    }

    @Override // yfe.b
    public final p0 a(h.c cVar) {
        h.c.d snapshot = (h.c.d) cVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        return new p0(R$drawable.uikit_icn_24_children, new TextLocalisedClause(R$string.home_total_wealth_category_youth_title, null, null, 14), new TextLocalisedClause(R$string.home_total_wealth_category_youth_subtitle_generic, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
    }

    @Override // yfe.b
    public final q0 b(h.a aVar) {
        u0 t0Var;
        x0 v0Var;
        a0 snapshot = (a0) aVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        TextClause textClause = new TextClause(snapshot.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        dj0.d dVar = snapshot.f313238c;
        y0.a aVar2 = new y0.a(null, snapshot.f, snapshot.d, rf8.a.f253707a, 1);
        w wVar = snapshot.f313239g;
        if (wVar == null) {
            v0Var = new w0(aVar2);
        } else {
            if (wVar.equals(w.c.INSTANCE)) {
                t0Var = new s0(new a1(nib.a.a()));
            } else if (wVar.equals(w.b.INSTANCE)) {
                t0Var = new s0(new a1(((s6e.d) this.f172156a).c(SubaccountType.Junior.f88962a)));
            } else {
                if (!(wVar instanceof z)) {
                    throw new NoWhenBranchMatchedException();
                }
                t0Var = new t0(((z) wVar).f313329b);
            }
            v0Var = new v0(aVar2, t0Var);
        }
        return new q0(textClause, dVar, new d1(v0Var, false), null, 40);
    }
}
