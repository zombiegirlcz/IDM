package e4h;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth.assetdetails.ui.impl.R$string;
import e07.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f122560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f122561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f122562c;

    public h(d countriesSectionMapper, e holdingsSectionMapper, f sectorsSectionMapper) {
        Intrinsics.checkNotNullParameter(countriesSectionMapper, "countriesSectionMapper");
        Intrinsics.checkNotNullParameter(holdingsSectionMapper, "holdingsSectionMapper");
        Intrinsics.checkNotNullParameter(sectorsSectionMapper, "sectorsSectionMapper");
        this.f122560a = countriesSectionMapper;
        this.f122561b = holdingsSectionMapper;
        this.f122562c = sectorsSectionMapper;
    }

    public static List b(List list) {
        return list.isEmpty() ? list : ue0.e.J(new ListSubheaderDelegate.Model("exposureoverview.title", (Image) null, (Clause) new TextLocalisedClause(R$string.trading_etf_details_fund_exposure_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), list);
    }

    public final List a(a3h.d domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f1132a;
        List list = data != null ? (List) iii.c.f(data, new e1d.h(this, 19), new k(19), new dn8.k(this, domainState, 9)) : null;
        return list == null ? f0.f322471a : list;
    }
}
