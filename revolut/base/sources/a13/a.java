package a13;

import aim.e;
import aw0.o9;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import dj0.d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final CompositeClause a(d dVar, Integer num) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        e eVarB = u.b();
        int i = R$drawable.uikit_icn_24_rev_points_default;
        Float fValueOf = Float.valueOf(16.0f);
        eVarB.add(new ImageClause(i, num, fValueOf, fValueOf, 16));
        m70.a.t(t0.f186434a);
        eVarB.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        eVarB.add(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), true, false, 9), null, null, 12));
        return new CompositeClause(u.a(eVarB), null, new Custom(num, false, null, false, null, 254), null, 10);
    }
}
