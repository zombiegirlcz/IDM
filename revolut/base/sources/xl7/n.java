package xl7;

import aw0.ka;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import yp0.e0;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n {
    public static final TextLocalisedClause a(ZonedDateTime startDateTime, ZonedDateTime endDateTime, boolean z) {
        Intrinsics.checkNotNullParameter(startDateTime, "startDateTime");
        Intrinsics.checkNotNullParameter(endDateTime, "endDateTime");
        int i = R$string.car_insurance_common_date_from_x_to_y;
        ka kaVar = ka.SHORT;
        return new TextLocalisedClause(i, v.k(f(startDateTime, new TimeClause.Format.DayAndMonth(kaVar), z, 4), f(endDateTime, new TimeClause.Format.DayAndMonth(kaVar), z, 4)), null, 12);
    }

    public static final RowDelegate.Model.MainImage.Image24 b(int i) {
        BulletImage bulletImage = new BulletImage(new BulletImage.Content.Number(i), (Integer) null, (Integer) null, (Integer) null, BitmapDescriptorFactory.HUE_RED, 62);
        boolean z = false;
        return new RowDelegate.Model.MainImage.Image24(bulletImage, z, z, 6);
    }

    public static final tf c() {
        return new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
    }

    public static final LayeredImage d(int i, int i2) {
        return LayeredImage.Companion.f(LayeredImage.INSTANCE, i, i2, R$attr.uikit_colorBackground, null, 2.0f, BitmapDescriptorFactory.HUE_RED, Float.valueOf(12.0f), 40);
    }

    public static final TimeClause e(LocalDate localDate, TimeClause.Format format) {
        Intrinsics.checkNotNullParameter(localDate, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new TimeClause(ebm.a.P(localDate), format, null, null, 12);
    }

    public static Clause f(ZonedDateTime zonedDateTime, TimeClause.Format format, boolean z, int i) {
        if ((i & 1) != 0) {
            TimeClause.Format.INSTANCE.getClass();
            format = TimeClause.Format.f57959a;
        }
        TimeClause.Format format2 = format;
        if ((i & 2) != 0) {
            z = false;
        }
        m70.a.t(t0.f186434a);
        TextClause separator = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(zonedDateTime, "<this>");
        Intrinsics.checkNotNullParameter(format2, "format");
        Intrinsics.checkNotNullParameter(separator, "separator");
        return z ? new CompositeClause(v.k(new TimeClause(zonedDateTime.toInstant().toEpochMilli(), format2, null, zonedDateTime.getZone(), 4), new TimeClause(zonedDateTime.toInstant().toEpochMilli(), TimeClause.Format.TimeDefault.f57977b, null, zonedDateTime.getZone(), 4)), separator, null, null, 12) : new TimeClause(zonedDateTime.toInstant().toEpochMilli(), format2, null, zonedDateTime.getZone(), 4);
    }

    public static MoneyClause g(dj0.d dVar, MoneyClause.Format.Defaults defaults, Custom custom, int i) {
        MoneyClause.Format.Defaults format = (i & 1) != 0 ? new MoneyClause.Format.Defaults(null, null, false, false, 15) : defaults;
        if ((i & 2) != 0) {
            custom = null;
        }
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return new MoneyClause(dVar, format, custom, null, 8);
    }

    public static TimeClause h(LocalDate localDate) {
        TimeClause.Format.INSTANCE.getClass();
        return e(localDate, TimeClause.Format.f57959a);
    }

    public static final RowDelegate.Model.MainImage.Image24 i(int i, Integer num) {
        ResourceImage resourceImage = new ResourceImage(i, (Integer) null, (Integer) null, num, (List) null, (ImageTransformations) null, (Clause) null, 246);
        boolean z = false;
        return new RowDelegate.Model.MainImage.Image24(resourceImage, z, z, 6);
    }

    public static RowDelegate.Model.MainImage.Image40 k(int i, boolean z, LayeredImage layeredImage, int i2) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, z ? R$attr.uikit_colorAccent : R$attr.uikit_colorGreyTone50, z ? R$attr.uikit_colorAccent_10 : R$attr.uikit_colorGreyTone50_10), (i2 & 4) != 0 ? null : layeredImage, null, false, 16);
    }

    public static List l(List list, ListSubheaderDelegate.Model subheader) {
        int i = R$attr.uikit_dp8;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(subheader, "subheader");
        return list.isEmpty() ? list : yp0.b.g(list, subheader, e0.OUTSIDE_BOX, i, i, 112);
    }

    public static final CompositeClause m(Clause clause, int i, int i2, Style style, TextClause separator) {
        Intrinsics.checkNotNullParameter(clause, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Integer numValueOf = Integer.valueOf(i2);
        Float fValueOf = Float.valueOf(16.0f);
        return new CompositeClause(v.k(new ImageClause(i, numValueOf, fValueOf, fValueOf, 16), clause), separator, style, null, 8);
    }

    public static CompositeClause n(Clause clause, int i, int i2, Custom custom, TextClause textClause, int i3) {
        if ((i3 & 2) != 0) {
            i2 = R$attr.uikit_colorGreyTone50_50;
        }
        if ((i3 & 4) != 0) {
            custom = null;
        }
        if ((i3 & 8) != 0) {
            Intrinsics.checkNotNullParameter(t0.f186434a, "<this>");
            textClause = new TextClause("   ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return m(clause, i, i2, custom, textClause);
    }
}
