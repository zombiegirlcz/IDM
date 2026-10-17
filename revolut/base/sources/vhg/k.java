package vhg;

import android.os.Parcelable;
import aw0.v4;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.miles.api.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static List a(ArrayList arrayList) {
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("SUGGESTED_DATES_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.miles_search_results_suggested_dates_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        hg hgVar = new hg("SUGGESTED_DATES_SCROLLER_ID", arrayList, 3, new v4(64.0f), null, null, false, false, null, null, 0, 0, 0, 0, 32752);
        int i = R$attr.uikit_dp0;
        yp0.b.r(hgVar, i, 0, i, i, 2);
        return v.k(model, hgVar);
    }
}
