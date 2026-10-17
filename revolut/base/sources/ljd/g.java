package ljd;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shops.api.model.ShopsOutletAvailabilityInterval;
import com.revolut.feature.shops.impl.R$string;
import h30.l;
import java.text.DateFormatSymbols;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalTime;
import yhm.j;
import zhm.r0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.c f195658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f195659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t70.g f195660c;
    public final Lazy d;
    public final Object e;

    public g(qd0.c localizedDistanceUnitFactory, qd0.b languageProvider, t70.g localization) {
        Intrinsics.checkNotNullParameter(localizedDistanceUnitFactory, "localizedDistanceUnitFactory");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f195658a = localizedDistanceUnitFactory;
        this.f195659b = languageProvider;
        this.f195660c = localization;
        this.d = j.b(new e(this, 0));
        this.e = r0.k(new Pair(mid.b.MONDAY.getCode(), 2), new Pair(mid.b.TUESDAY.getCode(), 3), new Pair(mid.b.WEDNESDAY.getCode(), 4), new Pair(mid.b.THURSDAY.getCode(), 5), new Pair(mid.b.FRIDAY.getCode(), 6), new Pair(mid.b.SATURDAY.getCode(), 7), new Pair(mid.b.SUNDAY.getCode(), 1));
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.Map] */
    public final a a(mid.f outletAvailability) {
        Intrinsics.checkNotNullParameter(outletAvailability, "outletAvailability");
        if (outletAvailability instanceof mid.e) {
            ShopsOutletAvailabilityInterval shopsOutletAvailabilityInterval = ((mid.e) outletAvailability).f205697a;
            return new a(new TextClause(b(shopsOutletAvailabilityInterval), (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122), new TextLocalisedClause(R$string.shops_availability_status_now, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 10));
        }
        if (outletAvailability instanceof mid.d) {
            ShopsOutletAvailabilityInterval shopsOutletAvailabilityInterval2 = ((mid.d) outletAvailability).f205690a;
            return new a(new TextClause(b(shopsOutletAvailabilityInterval2), (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122), new TextLocalisedClause(R$string.shops_availability_status_next, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
        }
        if (!(outletAvailability instanceof mid.c)) {
            throw new NoWhenBranchMatchedException();
        }
        mid.c cVar = (mid.c) outletAvailability;
        String str = cVar.f205688a;
        ShopsOutletAvailabilityInterval shopsOutletAvailabilityInterval3 = cVar.f205689b;
        String[] shortWeekdays = ((DateFormatSymbols) this.d.getValue()).getShortWeekdays();
        Integer num = (Integer) this.e.get(str);
        if (num == null) {
            throw new IllegalStateException(l.r("Unsupported day ", str));
        }
        String str2 = shortWeekdays[num.intValue()];
        Intrinsics.checkNotNullExpressionValue(str2, "get(...)");
        return new a(new CompositeClause(v.k(new TextClause(str2, (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122), new TextClause(b(shopsOutletAvailabilityInterval3), (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122)), new TextClause(", ", (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122), null, null, 12), new TextLocalisedClause(R$string.shops_availability_status_next, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
    }

    public final String b(ShopsOutletAvailabilityInterval shopsOutletAvailabilityInterval) {
        if (shopsOutletAvailabilityInterval.f87061c) {
            return this.f195660c.getString(R$string.shops_availability_period_all_day);
        }
        f fVar = Companion;
        LocalTime localTime = shopsOutletAvailabilityInterval.f87059a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(localTime, "<this>");
        String string = localTime.toString("HH:mm");
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        LocalTime localTime2 = shopsOutletAvailabilityInterval.f87060b;
        Intrinsics.checkNotNullParameter(localTime2, "<this>");
        String string2 = localTime2.toString("HH:mm");
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(string, " - ", string2);
    }
}
