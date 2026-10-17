package q1i;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature_exchange.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f241451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f241452b;

    public e(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f241451a = featureToggleInteractor;
        List listK = v.k(10, 25, 50, 100);
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            int iIntValue = ((Number) it8.next()).intValue();
            arrayList.add(new d01.b(a0.d.n("PERCENT_SUGGESTION_", iIntValue), iIntValue == 100 ? new TextLocalisedClause(R$string.fx_orders_editor_suggestion_sell_all, null, null, 14) : new TextClause(a0.d.h(iIntValue, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), Integer.valueOf(iIntValue), false, null, null, 56));
        }
        this.f241452b = arrayList;
    }
}
