package i1c;

import android.os.Parcelable;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.rev_points.models.RevPointsRichText;
import i0k.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import m1c.k1;
import nkm.y;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f157607a = new Regex("(\\$\\{(\\w+)\\})");

    public static final TextClause a(RevPointsRichText revPointsRichText) {
        Parcelable textClause;
        RevPointsRichText.Placeholder placeholder;
        Intrinsics.checkNotNullParameter(revPointsRichText, "<this>");
        String str = revPointsRichText.f84039a;
        Map map = revPointsRichText.f84040b;
        Regex regex = f157607a;
        List listJ = y.J(Regex.c(regex, str));
        if (listJ.isEmpty()) {
            return new TextClause(revPointsRichText.f84039a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        List<MatchResult> list = listJ;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (MatchResult matchResult : list) {
            String str2 = (String) d0.e0(2, matchResult.c());
            if (str2 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("Invalid match group structure: " + matchResult);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "RevPointsRichText", null, illegalStateException, h0Var);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else if (map == null || (placeholder = (RevPointsRichText.Placeholder) map.get(str2)) == null) {
                IllegalStateException illegalStateException2 = new IllegalStateException("Placeholder for " + str2 + " not found in " + map);
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "RevPointsRichText", null, illegalStateException2, h0Var2);
                textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                k1 k1Var = placeholder.f84041a;
                String str3 = placeholder.f84042b;
                int i = c.f157606a[k1Var.ordinal()];
                if (i == 1) {
                    Double dK = kotlin.text.y.k(str3);
                    if (dK != null) {
                        textClause = nub.a.k(dK.doubleValue(), o9.NON_SENSITIVE, null, null, BitmapDescriptorFactory.HUE_RED, null, 60);
                    } else {
                        IllegalStateException illegalStateException3 = new IllegalStateException("Error converting RevPoints value to Double: ".concat(str3));
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "RevPointsRichText", null, illegalStateException3, h0Var3);
                        textClause = new TextClause(placeholder.f84043c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textClause = new TextClause(placeholder.f84043c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
            }
            arrayList.add(textClause);
        }
        return new TextClause(regex.h(str, new f(14)), (Style) null, (Integer) null, false, (o9) null, (List) arrayList, 94);
    }
}
