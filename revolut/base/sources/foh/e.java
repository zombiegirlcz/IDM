package foh;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth_discovery.api.declaration.collection.TopMoversDestination;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.l0;
import xzg.n0;
import zhm.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f136963a = zhm.v.k(n0.ALL, n0.GAINERS, n0.LOSERS);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f136964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f136965c;

    public static final class a {
        private a() {
        }
    }

    static {
        l0 l0Var = l0.ONE_DAY;
        l0 l0Var2 = l0.ONE_WEEK;
        l0 l0Var3 = l0.ONE_MONTH;
        l0 l0Var4 = l0.ONE_YEAR;
        l0 l0Var5 = l0.FIVE_YEARS;
        List listK = zhm.v.k(l0Var, l0Var2, l0Var3, l0Var4, l0Var5);
        f136964b = listK;
        f136965c = d0.A0(listK, l0Var5);
    }

    public static eii.c a(TextLocalisedClause textLocalisedClause, List list, Enum r162, Function1 function1, TopMoversDestination topMoversDestination) {
        k9 k9Var;
        lw0.a aVar = new lw0.a(textLocalisedClause, null, null, null, false, 30);
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (Object obj2 : list2) {
            arrayList.add(new eii.l((Clause) function1.invoke(obj2), (Clause) null, (RowDelegate.Model.MainImage) null, true, Intrinsics.f(obj2, r162), (RowDelegate.Model.c) null, obj2, 200));
        }
        if (topMoversDestination instanceof TopMoversDestination.Crypto) {
            k9Var = k9.Crypto;
        } else {
            if (!(topMoversDestination instanceof TopMoversDestination.Trading)) {
                throw new NoWhenBranchMatchedException();
            }
            k9Var = k9.Wealth;
        }
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new eii.c(aVar, null, arrayList, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null);
    }
}
