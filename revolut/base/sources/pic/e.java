package pic;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rewards.api.model.rewards.OutletAvailabilityInterval;
import com.revolut.feature.rewards.impl.R$string;
import ggc.h;
import ggc.j;
import java.util.List;
import kgm.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalTime;
import t70.g;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f236465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f236466b;

    public e(i localizedWeekdaysProvider, g localization) {
        Intrinsics.checkNotNullParameter(localizedWeekdaysProvider, "localizedWeekdaysProvider");
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f236465a = localizedWeekdaysProvider;
        this.f236466b = localization;
    }

    public final c a(j outletAvailability) {
        Intrinsics.checkNotNullParameter(outletAvailability, "outletAvailability");
        if (outletAvailability instanceof ggc.i) {
            OutletAvailabilityInterval outletAvailabilityInterval = ((ggc.i) outletAvailability).f143637a;
            return new c(new TextClause(b(outletAvailabilityInterval), (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122), new TextLocalisedClause(R$string.perks_availability_status_now, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 10));
        }
        if (outletAvailability instanceof h) {
            OutletAvailabilityInterval outletAvailabilityInterval2 = ((h) outletAvailability).f143630a;
            return new c(new TextClause(b(outletAvailabilityInterval2), (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122), new TextLocalisedClause(R$string.perks_availability_status_next, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
        }
        if (!(outletAvailability instanceof ggc.g)) {
            throw new NoWhenBranchMatchedException();
        }
        ggc.g gVar = (ggc.g) outletAvailability;
        String str = gVar.f143625a;
        OutletAvailabilityInterval outletAvailabilityInterval3 = gVar.f143626b;
        String strO = this.f236465a.o(str);
        return new c(new CompositeClause(v.k(new TextClause(strO, (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122), new TextClause(b(outletAvailabilityInterval3), (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122)), new TextClause(", ", (Style) null, Integer.valueOf(R$attr.uikit_colorGrey50), false, (o9) null, (List) null, 122), null, null, 12), new TextLocalisedClause(R$string.perks_availability_status_next, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10));
    }

    public final String b(OutletAvailabilityInterval interval) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        OutletAvailabilityInterval outletAvailabilityInterval = ggc.v.f143671a;
        Intrinsics.checkNotNullParameter(interval, "<this>");
        if (Intrinsics.f(interval, ggc.v.f143671a)) {
            return this.f236466b.getString(R$string.perks_availability_period_all_day);
        }
        d dVar = Companion;
        LocalTime localTime = interval.f84810a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(localTime, "<this>");
        String string = localTime.toString("HH:mm");
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        LocalTime localTime2 = interval.f84811b;
        Intrinsics.checkNotNullParameter(localTime2, "<this>");
        String string2 = localTime2.toString("HH:mm");
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(string, " - ", string2);
    }
}
