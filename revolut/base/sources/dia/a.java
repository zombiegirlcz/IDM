package dia;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pro.accounts.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yfe.a1;
import yfe.a2;
import yfe.b1;
import yfe.d1;
import yfe.e2;
import yfe.f2;
import yfe.h;
import yfe.k0;
import yfe.p0;
import yfe.q0;
import yfe.t;
import yfe.z0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements yfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.b f114959a;

    public a(g6e.b subaccountBackgroundInteractor) {
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        this.f114959a = subaccountBackgroundInteractor;
    }

    @Override // yfe.b
    public final p0 a(h.c cVar) {
        TextLocalisedClause textLocalisedClause;
        k0 snapshot = (k0) cVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.freelancer_home_total_wealth_category_title, null, null, 14);
        int i = R$drawable.uikit_icn_24_services;
        Double d = snapshot.f313277c;
        if (d != null) {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_home_total_wealth_category_placeholder_subtitle_v2, u.c(new PercentageClause(d.doubleValue(), (PercentageClause.Format) null, (Custom) null, 6)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.freelancer_home_total_wealth_category_placeholder_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        return new p0(i, textLocalisedClause2, textLocalisedClause);
    }

    @Override // yfe.b
    public final q0 b(h.a aVar) {
        Object a1Var;
        t snapshot = (t) aVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_home_total_wealth_category_title, null, null, 14);
        dj0.d dVar = snapshot.f313305c;
        List<f2> list = snapshot.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (f2 f2Var : list) {
            if (f2Var instanceof a2) {
                a1Var = new z0(((a2) f2Var).f313241a);
            } else {
                if (!(f2Var instanceof e2)) {
                    throw new NoWhenBranchMatchedException();
                }
                a1Var = new a1(((s6e.d) this.f114959a).d(((e2) f2Var).f313252a));
            }
            arrayList.add(a1Var);
        }
        return new q0(textLocalisedClause, dVar, new d1(v13.d.Z(arrayList, new b1(R$drawable.uikit_icn_24_services)), false), null, 56);
    }
}
