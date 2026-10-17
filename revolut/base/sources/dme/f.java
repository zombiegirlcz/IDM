package dme;

import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import dkk.m;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k19.h;
import k19.i;
import k19.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import nkm.y;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f116114a = new Regex("(\\$\\{(\\w+)\\})");

    public static final TextClause a(j jVar) {
        Parcelable textClause;
        i iVar;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        String str = jVar.f180157a;
        Map map = jVar.f180158b;
        Regex regex = f116114a;
        List listJ = y.J(Regex.c(regex, str));
        if (listJ.isEmpty()) {
            return new TextClause(jVar.f180157a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        List<MatchResult> list = listJ;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (MatchResult matchResult : list) {
            String str2 = (String) d0.e0(2, matchResult.c());
            if (str2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Invalid match group structure: " + matchResult);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "LifestyleHomeRichText", null, illegalStateException, h0Var);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else if (map == null || (iVar = (i) map.get(str2)) == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Placeholder for " + str2 + " not found in " + map);
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "LifestyleHomeRichText", null, illegalStateException2, h0Var2);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                h hVar = iVar.f180153a;
                String str3 = iVar.f180154b;
                int i = e.f116113a[hVar.ordinal()];
                if (i == 1) {
                    BigDecimal bigDecimalI = kotlin.text.y.i(str3);
                    if (bigDecimalI != null) {
                        textClause = nub.a.l(qvb.a.e(bigDecimalI), o9.NON_SENSITIVE, null, Integer.valueOf(R$attr.uikit_colorWhite), BitmapDescriptorFactory.HUE_RED, 52);
                    } else {
                        IllegalStateException illegalStateException3 = new IllegalStateException("Error converting RevPoints value: ".concat(str3));
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "LifestyleHomeRichText", null, illegalStateException3, h0Var3);
                        textClause = new TextClause(iVar.f180155c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textClause = new TextClause(iVar.f180155c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
            }
            arrayList.add(textClause);
        }
        return new TextClause(regex.h(jVar.f180157a, new m(29)), (Style) null, (Integer) null, false, (o9) null, (List) arrayList, 94);
    }
}
