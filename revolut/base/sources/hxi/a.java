package hxi;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    @NotNull
    public static final C0897a Companion = new C0897a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TextClause f156597b = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final TextClause f156598c = new TextClause(", ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f156599a = w.y0(new hul.c(16));

    /* JADX INFO: renamed from: hxi.a$a, reason: collision with other inner class name */
    public static final class C0897a {
        private C0897a() {
        }
    }

    public static ArrayList b(int i) {
        IntRange intRangeO = kotlin.ranges.f.o(0, i);
        ArrayList arrayList = new ArrayList(zhm.w.t(intRangeO, 10));
        vim.f it8 = intRangeO.iterator();
        while (it8.f289625c) {
            arrayList.add(new pb0(a0.d.n("ID_AIRPORT_", it8.nextInt())));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public final ArrayList a(String airportItemIdPrefix, String airportItemIdSuffix, List airports) {
        Intrinsics.checkNotNullParameter(airportItemIdPrefix, "airportItemIdPrefix");
        Intrinsics.checkNotNullParameter(airportItemIdSuffix, "airportItemIdSuffix");
        Intrinsics.checkNotNullParameter(airports, "airports");
        List<svi.a> list = airports;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (svi.a aVar : list) {
            String strO = com.google.android.gms.internal.mlkit_vision_face.a.o(airportItemIdPrefix, aVar.f265868a, airportItemIdSuffix);
            CompositeClause compositeClauseM = yoj.b.m(f156597b, v.k(new TextClause(aVar.f265870c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(p.a.p("(", aVar.f265869b, ")"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)));
            TextClause[] elements = {aVar.d.length() > 0 ? new TextClause(aVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, aVar.e.length() > 0 ? new TextClause(aVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null};
            Intrinsics.checkNotNullParameter(elements, "elements");
            arrayList.add(new RowDelegate.Model(strO, new RowDelegate.Model.MainImage.Image40(new CountryImage(aVar.f, (Integer) null, (ez0.e) null, 14), (Image) this.f156599a.getValue(), null, false, 28), compositeClauseM, null, 0, yoj.b.m(f156598c, kotlin.collections.d.L(elements)), null, null, 0, null, false, null, false, null, null, null, null, null, null, aVar.f265868a, null, 0, 0, 0, 0, 532676568));
        }
        return arrayList;
    }
}
