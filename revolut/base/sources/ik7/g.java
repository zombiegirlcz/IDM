package ik7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    public static qv0.i a(CFACCancellationReason reason, boolean z) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (!ue0.e.n(reason.d) || z) {
            return new CellDetailsChevronDelegate.Model(reason.f74968b, new TextClause(reason.f74969c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, false, reason, null, null, 2028);
        }
        String str = reason.f74968b;
        TextClause textClause = new TextClause(reason.f74969c, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122);
        m70.a.c(t0.f186434a);
        return new CellDetailsDelegate.Model(str, textClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, reason, null, null, null, null, false, 0, 0, 32744);
    }
}
