package jzb;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements p {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fub.d f179718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f179719b;

    public r(fub.d revPointsEarningRateItemMapper, b revPointsCreditCardEntryPointMapper) {
        Intrinsics.checkNotNullParameter(revPointsEarningRateItemMapper, "revPointsEarningRateItemMapper");
        Intrinsics.checkNotNullParameter(revPointsCreditCardEntryPointMapper, "revPointsCreditCardEntryPointMapper");
        this.f179718a = revPointsEarningRateItemMapper;
        this.f179719b = revPointsCreditCardEntryPointMapper;
    }

    public static ListSubheaderDelegate.Model a() {
        return new ListSubheaderDelegate.Model("REDEEM_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.rev_points_earn_card_spend_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }
}
