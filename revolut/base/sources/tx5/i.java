package tx5;

import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        EnumEntries<cw5.e> enumEntriesA = cw5.e.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (cw5.e eVar : enumEntriesA) {
            String strN = a0.d.n("SINGLE_CHOICE_LIST_ID_PREFIX_", eVar.ordinal());
            int i2 = j.f275336a[eVar.ordinal()];
            boolean z = true;
            if (i2 == 1) {
                i = R$string.wealth_trading_topMovers_filters_timeSpan_oneDay;
            } else if (i2 == 2) {
                i = R$string.wealth_trading_topMovers_filters_timeSpan_oneWeek;
            } else if (i2 == 3) {
                i = R$string.wealth_trading_topMovers_filters_timeSpan_oneMonth;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.wealth_trading_topMovers_filters_timeSpan_oneYear;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
            if (eVar != domainState.f275333a) {
                z = false;
            }
            arrayList.add(new SingleChoiceDelegate.Model(strN, textLocalisedClause, z, null, eVar, YearClass.CLASS_2008));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new g(arrayList);
    }
}
