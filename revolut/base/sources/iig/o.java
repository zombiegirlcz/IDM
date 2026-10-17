package iig;

import android.os.Parcelable;
import aw0.x4;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.travel.miles.api.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(ArrayList arrayList) {
        return v.k(new ListSubheaderDelegate.Model("RECOMMENDED_FLIGHTS_TITLE_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_recommended_flights_flights_section_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), new hg("RECOMMENDED_FLIGHTS_CAROUSEL_ID", arrayList, 1, x4.c.f10604a, null, new gg.b(true, 2), false, false, null, null, 0, 0, 0, 0, 32720));
    }
}
