package jzb;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.rev_points.api.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f179716a;

    public n(i bonusPointsItemMapper) {
        Intrinsics.checkNotNullParameter(bonusPointsItemMapper, "bonusPointsItemMapper");
        this.f179716a = bonusPointsItemMapper;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("BONUS_POINTS_HEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.rev_points_earn_hub_bonus_points_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
