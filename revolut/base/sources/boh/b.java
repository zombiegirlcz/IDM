package boh;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.b0;
import xzg.d0;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f17461a = zhm.v.k(d0.MOST_TRADED, d0.MOST_BOUGHT, d0.MOST_SOLD);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f17462b = zhm.v.k(b0.ONE_DAY, b0.ONE_WEEK, b0.ONE_MONTH, b0.ONE_YEAR);

    public static final class a {
        private a() {
        }
    }

    public static eii.c a(TextLocalisedClause textLocalisedClause, List list, Enum r152, Function1 function1) {
        lw0.a aVar = new lw0.a(textLocalisedClause, null, null, null, false, 30);
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (Object obj2 : list2) {
            arrayList.add(new eii.l((Clause) function1.invoke(obj2), (Clause) null, (RowDelegate.Model.MainImage) null, true, Intrinsics.f(obj2, r152), (RowDelegate.Model.c) null, obj2, 200));
        }
        k9 k9Var = k9.Wealth;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new eii.c(aVar, null, arrayList, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null);
    }
}
