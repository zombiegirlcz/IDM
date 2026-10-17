package iag;

import android.os.Parcelable;
import aw0.d0;
import aw0.y4;
import cfg.e;
import cfi.g;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.hotels.api.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements e {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f160021b = new d0(167, 202);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cfg.b f160022a;

    public c(cfg.b suggestedExperienceTileItemMapper) {
        Intrinsics.checkNotNullParameter(suggestedExperienceTileItemMapper, "suggestedExperienceTileItemMapper");
        this.f160022a = suggestedExperienceTileItemMapper;
    }

    @Override // cfg.e
    public final List a(List experiences, boolean z) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        cfi.a aVar = (cfi.a) zhm.d0.d0(experiences);
        if (aVar == null) {
            return f0.f322471a;
        }
        g gVar = aVar.f23696h;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("SUGGESTED_EXPERIENCES_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_booking_details_suggested_experiences_title, u.c(gVar.f23708b), null, 12), (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_common_action_see_all, null, null, 14), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(false, false, true, 3), false, false, (Object) gVar, (Parcelable) null, 0, 0, 0, 0, 64426);
        List list = experiences;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            VoucherSmallTileDelegate.Model modelA = this.f160022a.a((cfi.a) it8.next(), z, null);
            yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
            arrayList.add(modelA);
        }
        return v.k(model, new hg("SUGGESTED_EXPERIENCES_SCROLLER_ITEM_ID", arrayList, 2, new y4(f160021b), null, new gg.c(0), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28624));
    }
}
