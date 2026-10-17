package f0c;

import android.os.Parcelable;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.rev_points.api.R$string;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements fub.i {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f131074a;

    public d(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f131074a = uiKitResources;
    }

    public static hg a(ArrayList arrayList) {
        gg.c cVar = new gg.c(0);
        VoucherSmallTileDelegate.INSTANCE.getClass();
        hg hgVar = new hg("FEATURED_REWARDS_VOUCHERS_LIST_ID", arrayList, 2, new y4(VoucherSmallTileDelegate.e), null, cVar, false, false, null, null, 0, 0, 0, 0, 32720);
        int i = R$attr.uikit_dp0;
        yp0.b.p(hgVar, i, R$attr.uikit_dp8, i, i);
        return hgVar;
    }

    public static ListSubheaderDelegate.Model b(Clause clause) {
        boolean z = false;
        return new ListSubheaderDelegate.Model("REDEEM_HEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.rev_points_redeem_featured_rewards_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (Image) null, clause, (String) null, (ListSubheaderDelegate.Model.a) (clause != null ? new ListSubheaderDelegate.Model.a.b(z, z, true, 3) : null), false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp16, R$attr.uikit_dp12, 0, 0, 53162);
    }
}
