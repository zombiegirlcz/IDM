package brc;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.salary_switch.impl.R$string;
import ip0.c50;
import ip0.d50;
import ip0.j50;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes6.dex */
public final class e {
    private e() {
    }

    public static d50 a() {
        j50 style = j50.FAILED;
        c50 position = c50.LAST;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(position, "position");
        int i = R$drawable.uikit_icn_24_retry;
        Float fValueOf = Float.valueOf(16.0f);
        List listK = zhm.v.k(new ImageClause(i, (Integer) null, fValueOf, fValueOf, 18), new TextLocalisedClause(R$string.salary_switch_br_status_error_try_again, null, null, 14));
        m70.a.t(t0.f186434a);
        return new d50(null, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), style, position, 1);
    }
}
