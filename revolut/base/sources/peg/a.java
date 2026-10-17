package peg;

import aim.e;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import meg.f;
import meg.g;
import meg.i;
import ms0.e4;
import mx0.d;
import org.jmrtd.lds.icao.DG11File;
import zfi.l;
import zfi.n;
import zfi.q;
import zfi.t;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    public a(i filtersUIMapper) {
        Intrinsics.checkNotNullParameter(filtersUIMapper, "filtersUIMapper");
    }

    public static ActionsView.Item a(String str, Clause clause, g gVar) {
        return new ActionsView.Item(str, d.ACCENT, false, e4.EnabledNonClickable, null, clause, null, new ResourceImage(R$drawable.uikit_icn_16_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, null, gVar, null, DG11File.TITLE_TAG);
    }

    public final e b(zfi.a appliedFilters) {
        Intrinsics.checkNotNullParameter(appliedFilters, "appliedFilters");
        e eVarB = u.b();
        for (Map.Entry entry : appliedFilters.f321951a.entrySet()) {
            String str = (String) entry.getKey();
            zfi.i iVar = (zfi.i) entry.getValue();
            String strQ = j6.a.q("APPLIED_FILTER_", str);
            TextClause textClause = new TextClause(iVar.f321973b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String queryParam = iVar.f321972a;
            String label = iVar.f321973b;
            Intrinsics.checkNotNullParameter(queryParam, "queryParam");
            Intrinsics.checkNotNullParameter(label, "label");
            eVarB.add(a(strQ, textClause, new meg.a(str, new zfi.i(queryParam, label, false))));
        }
        for (Map.Entry entry2 : appliedFilters.f321952b.entrySet()) {
            String str2 = (String) entry2.getKey();
            l lVar = (l) entry2.getValue();
            for (n nVar : lVar.f321981b) {
                eVarB.add(a(j6.a.q("APPLIED_FILTER_", nVar.f321982a), new TextClause(nVar.f321983b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new meg.b(str2, lVar.f321980a, new efi.a(false, nVar))));
            }
        }
        for (Map.Entry entry3 : appliedFilters.f321953c.entrySet()) {
            String str3 = (String) entry3.getKey();
            t tVar = (t) entry3.getValue();
            eVarB.add(a(j6.a.q("APPLIED_FILTER_", tVar.f322001b.f321982a), new TextClause(tVar.f322001b.f321983b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new f(str3, tVar.f322000a, null)));
        }
        for (Map.Entry entry4 : appliedFilters.d.entrySet()) {
            String str4 = (String) entry4.getKey();
            q qVar = (q) entry4.getValue();
            eVarB.add(a(j6.a.q("APPLIED_FILTER_", str4), i.d(qVar), i.e(str4, true, qVar)));
        }
        return u.a(eVarB);
    }
}
