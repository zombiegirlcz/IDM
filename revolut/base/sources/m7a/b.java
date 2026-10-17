package m7a;

import com.revolut.feature.period_chooser.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import l80.e;
import t70.g;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f203363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f203364b;

    public b(e dateProvider, g localization) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(localization, "localization");
        int i = R$string.period_chooser_period_weekday_monday;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string = localization.getString(i);
        int i2 = R$string.period_chooser_period_weekday_tuesday;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string2 = localization.getString(i2);
        int i3 = R$string.period_chooser_period_weekday_wednesday;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string3 = localization.getString(i3);
        int i5 = R$string.period_chooser_period_weekday_thursday;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string4 = localization.getString(i5);
        int i6 = R$string.period_chooser_period_weekday_friday;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string5 = localization.getString(i6);
        int i21 = R$string.period_chooser_period_weekday_saturday;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string6 = localization.getString(i21);
        int i22 = R$string.period_chooser_period_weekday_sunday;
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f203363a = v.k(string, string2, string3, string4, string5, string6, localization.getString(i22));
        int i32 = R$string.period_chooser_period_weekday_monday_short;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string7 = localization.getString(i32);
        int i33 = R$string.period_chooser_period_weekday_tuesday_short;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string8 = localization.getString(i33);
        int i43 = R$string.period_chooser_period_weekday_wednesday_short;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string9 = localization.getString(i43);
        int i59 = R$string.period_chooser_period_weekday_thursday_short;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string10 = localization.getString(i59);
        int i66 = R$string.period_chooser_period_weekday_friday_short;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string11 = localization.getString(i66);
        int i74 = R$string.period_chooser_period_weekday_saturday_short;
        Intrinsics.checkNotNullParameter(localization, "localization");
        String string12 = localization.getString(i74);
        int i92 = R$string.period_chooser_period_weekday_sunday_short;
        Intrinsics.checkNotNullParameter(localization, "localization");
        this.f203364b = v.k(string7, string8, string9, string10, string11, string12, localization.getString(i92));
    }

    public final String a(int i) {
        String str = (String) d0.e0(f.h(i - 1, new IntRange(0, 6, 1)), this.f203364b);
        if (str != null) {
            return str;
        }
        m70.a.c(t0.f186434a);
        return "";
    }
}
