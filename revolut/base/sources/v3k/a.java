package v3k;

import a0.d;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CountryClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import d2k.h;
import ez0.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import wi0.b;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    @NotNull
    public static final C1578a Companion = new C1578a();

    /* JADX INFO: renamed from: v3k.a$a, reason: collision with other inner class name */
    public static final class C1578a {
        private C1578a() {
        }
    }

    public static List a(int i, List list) {
        List<h> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (h hVar : list2) {
            b bVar = hVar.f110878a;
            String str = bVar.f297794a;
            CountryClause countryClause = new CountryClause(bVar, null);
            Locale locale = Locale.ROOT;
            arrayList.add(new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(new CountryImage(str, (Integer) null, (e) null, 14), null, null, false, null, false, 62), countryClause, null, 0, new TextClause(v0.a.j(locale, "ROOT", str, locale, "toUpperCase(...)"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, true, null, false, null, null, null, null, null, null, hVar, null, 0, 0, 0, 0, 532674520));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return !arrayList.isEmpty() ? i2b.a.q(new ListSubheaderDelegate.Model(d.n("ID_HEADER_", i), (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), arrayList) : f0.f322471a;
    }
}
