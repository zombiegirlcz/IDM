package hnh;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.retail.wealth.resources.R$string;
import gnh.g;
import gnh.i;
import gnh.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    /* JADX WARN: Type inference failed for: r8v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static ListSubheaderDelegate.Model a(i state, g config) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(config, "config");
        String str = config.f144998a;
        String strP = p.a.p("trade-widget-", str, "_subheader");
        ?? r87 = config.f144999b;
        boolean z = config.d;
        return new ListSubheaderDelegate.Model(strP, (Image) null, (Clause) r87, (Image) null, (Clause) (z ? new TextLocalisedClause(R$string.wealth_invest_common_see_all, null, null, 14) : null), p.a.p("trade-widget-", str, "-see-all"), (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, z, 3), false, false, (Object) new u(state.f145002a), (Parcelable) null, 0, 0, 0, 0, 64394);
    }
}
