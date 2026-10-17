package ub3;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.z9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.api.models.LockedStatus;
import com.revolut.feature.cash_topup.api.models.OpenInterval;
import com.revolut.feature.cash_topup.impl.R$string;
import ip0.wy;
import ip0.xy;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f278735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f278736b;

    public e(g distanceMapper, h imageMapper, j statusMapper, i mapIconMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(distanceMapper, "distanceMapper");
        Intrinsics.checkNotNullParameter(imageMapper, "imageMapper");
        Intrinsics.checkNotNullParameter(statusMapper, "statusMapper");
        Intrinsics.checkNotNullParameter(mapIconMapper, "mapIconMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f278735a = distanceMapper;
        this.f278736b = dateProvider;
    }

    public static wy b(xy xyVar) {
        return new wy(new TextLocalisedClause(R$string.topup_cash_map_navigate, null, null, 14), xyVar, new ResourceImage(R$drawable.uikit_icn_24_arrow_navigation, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246));
    }

    public final RowDelegate.Model a(CashTopUpLocationInfo location) {
        Intrinsics.checkNotNullParameter(location, "location");
        String str = location.f;
        Image imageA = h.a(location);
        TextClause textClause = new TextClause(location.f65590a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Clause[] elements = {e(location), new TextClause(location.f65591b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), j.a(location)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new RowDelegate.Model(str, imageA, null, null, textClause, new CompositeClause(kotlin.collections.d.L(elements), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, null, 0, new RowDelegate.Model.c.b(this.f278735a.a(location.f65595j), null, null, false, 126), true, false, null, null, null, null, null, location, null, 0, 0, 0, 0, 1056958316);
    }

    public final z9 c(CashTopUpLocationInfo cashTopUpLocationInfo) {
        return new z9(this.f278735a.a(cashTopUpLocationInfo.f65595j), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    public final yv0.i d(CashTopUpLocationInfo location, boolean z, yv0.e iconSize) {
        int i;
        yv0.d cVar;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(iconSize, "iconSize");
        LockedStatus lockedStatus = location.f65597m;
        if ((lockedStatus instanceof LockedStatus.NotApplicable) || (lockedStatus instanceof LockedStatus.Unlocked)) {
            i = R$attr.uikit_colorTransparent;
        } else {
            if (!(lockedStatus instanceof LockedStatus.Locked)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.uikit_colorGreyTone50_10;
        }
        int i2 = i;
        int i3 = z ? R$attr.uikit_colorAccent : R$attr.uikit_colorBackground;
        Intrinsics.checkNotNullParameter(location, "location");
        LockedStatus lockedStatus2 = location.f65597m;
        if (lockedStatus2 instanceof LockedStatus.Locked) {
            cVar = new yv0.b(new ResourceImage(R$drawable.uikit_icn_24_lock_closed, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), true);
        } else {
            if (!(lockedStatus2 instanceof LockedStatus.NotApplicable) && !(lockedStatus2 instanceof LockedStatus.Unlocked)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = location.k;
            cVar = str != null ? new yv0.c(new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), false, false, (Integer) null, (Integer) null, (Integer) null, 501), null, null, false, false, 507902)) : new yv0.b(new ResourceImage(R$drawable.uikit_icn_24_cash, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccentNeutral), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
        }
        return new yv0.i(new ah0.a(location.d, location.e), cVar, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) null, iconSize, i2, i3, location.f);
    }

    public final Clause e(CashTopUpLocationInfo cashTopUpLocationInfo) {
        if (!cashTopUpLocationInfo.f65598n) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_cash_map_open_now, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), 10);
        List list = (List) cashTopUpLocationInfo.o.get(((l80.f) this.f278736b).e().getDayOfWeek());
        return (list == null || list.isEmpty()) ? textLocalisedClause : new CompositeClause(v.k(textLocalisedClause, new TextLocalisedClause(R$string.topup_cash_map_closes_at, u.c(((OpenInterval) d0.m0(list)).f65603b), null, 12)), new DotDividerClause((Integer) null), null, null, 12);
    }
}
