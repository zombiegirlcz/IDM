package lnd;

import aw0.i4;
import aw0.o9;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.i3;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    @NotNull
    private static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.c f197180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f197181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f197182c;
    public final cmd.a d;
    public final o e;

    public h0(thf.c transactionCategoryResourcesMapper, q analyticsChartHeaderMapper, t0 proCategoryGroupMapper, cmd.a groupDetailsMapper, o analyticsCategoryColorMapper) {
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(analyticsChartHeaderMapper, "analyticsChartHeaderMapper");
        Intrinsics.checkNotNullParameter(proCategoryGroupMapper, "proCategoryGroupMapper");
        Intrinsics.checkNotNullParameter(groupDetailsMapper, "groupDetailsMapper");
        Intrinsics.checkNotNullParameter(analyticsCategoryColorMapper, "analyticsCategoryColorMapper");
        this.f197180a = transactionCategoryResourcesMapper;
        this.f197181b = analyticsChartHeaderMapper;
        this.f197182c = proCategoryGroupMapper;
        this.d = groupDetailsMapper;
        this.e = analyticsCategoryColorMapper;
    }

    public final ArrayList a(zod.d0 details) {
        i4 i4Var;
        Intrinsics.checkNotNullParameter(details, "details");
        List<zod.c0> list = details.f323981a;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (zod.c0 c0Var : list) {
            if (c0Var instanceof zod.a0) {
                zod.a0 a0Var = (zod.a0) c0Var;
                i4Var = b(a0Var.f323974a, zhm.v.l(a0Var.f323975b), GroupingExtraData.None.f87450a, null);
            } else {
                if (!(c0Var instanceof zod.b0)) {
                    throw new NoWhenBranchMatchedException();
                }
                i4Var = new i4("SMALL_SEGMENTS_GROUP_ID", new TextLocalisedClause(R$string.analytics_spendings_category_others, null, null, 14), ((zod.b0) c0Var).f323977a.a().f115082a, new Color.Solid(R$attr.uikit_colorGreyTone50), zhm.f0.f322471a);
            }
            arrayList.add(i4Var);
        }
        return arrayList;
    }

    public final i4 b(he3.j jVar, List list, GroupingExtraData groupingExtraData, String str) {
        he3.j jVar2;
        List list2;
        Clause clauseC;
        Object next;
        Clause clause;
        he3.l type = jVar.d;
        if (type.a()) {
            Intrinsics.checkNotNullParameter(type, "type");
            clauseC = this.f197182c.f197205a.c(t0.c(type));
            jVar2 = jVar;
            list2 = list;
        } else {
            he3.l lVar = he3.l.CATEGORY;
            cmd.a aVar = this.d;
            if (type == lVar) {
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (kotlin.text.a0.z(((i3) next).getId(), jVar.f151563a, true)) {
                        break;
                    }
                }
                i3 i3Var = (i3) next;
                if (i3Var != null) {
                    TextClause textClause = new TextClause(((wjf.e) this.f197180a).k(i3Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    jVar2 = jVar;
                    list2 = list;
                    clause = textClause;
                    he3.j jVar3 = jVar2;
                    return new i4(jVar3.f151563a, clause, jVar3.f151564b.a().f115082a, this.e.a(jVar3, list2));
                }
                list2 = list;
                jVar2 = jVar;
                clauseC = ((fnd.d) aVar).c(jVar, list2, false, str, groupingExtraData).f314699b;
            } else {
                jVar2 = jVar;
                list2 = list;
                clauseC = ((fnd.d) aVar).c(jVar2, list2, false, str, groupingExtraData).f314699b;
            }
        }
        clause = clauseC;
        he3.j jVar32 = jVar2;
        return new i4(jVar32.f151563a, clause, jVar32.f151564b.a().f115082a, this.e.a(jVar32, list2));
    }
}
