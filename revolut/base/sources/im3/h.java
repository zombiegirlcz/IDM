package im3;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a9e.h f162293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nq9.b f162294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b6k.c f162295c;
    public final yof.a d;

    public h(a9e.h subscriptionsItemMapper, nq9.b groupsMapper, b6k.c analyticsItemMapper, yof.a recipientTrustMapper) {
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        Intrinsics.checkNotNullParameter(groupsMapper, "groupsMapper");
        Intrinsics.checkNotNullParameter(analyticsItemMapper, "analyticsItemMapper");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        this.f162293a = subscriptionsItemMapper;
        this.f162294b = groupsMapper;
        this.f162295c = analyticsItemMapper;
        this.d = recipientTrustMapper;
    }

    public static CellDetailsDelegate.Model a(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return new CellDetailsDelegate.Model("ITEM_DETAILS_ID", yoj.b.w(new TextLocalisedClause(R.string.profile_email, null, null, 14), new TextClause(":", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause(email, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static CellDetailsDelegate.Model b(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        return new CellDetailsDelegate.Model("ITEM_DETAILS_ID", yoj.b.w(new TextLocalisedClause(R.string.profile_phone, null, null, 14), new TextClause(":", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause(phone, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
    }

    public static LargeActionButtonDelegate.Model c(boolean z) {
        return new LargeActionButtonDelegate.Model("SEE_MORE_GROUPS_BUTTON_ID", LargeActionButton.ButtonStyle.o, null, z ? new TextLocalisedClause(R.string.common_action_see_less, null, null, 14) : new TextLocalisedClause(R.string.common_action_see_more, null, null, 14), false, null, null, null, null, 1000);
    }
}
