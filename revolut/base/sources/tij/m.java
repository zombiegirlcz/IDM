package tij;

import aw0.x4;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f271559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f271560b;

    public m(gte.a toggleInteractor, e homeBannerBuilder, w unfreezeBannerBuilder) {
        Intrinsics.checkNotNullParameter(toggleInteractor, "toggleInteractor");
        Intrinsics.checkNotNullParameter(homeBannerBuilder, "homeBannerBuilder");
        Intrinsics.checkNotNullParameter(unfreezeBannerBuilder, "unfreezeBannerBuilder");
        this.f271559a = toggleInteractor;
        this.f271560b = homeBannerBuilder;
    }

    public static final List a(m mVar, Data userCompany, Data onlyManualInstallationAvailable, Data esimSubscriptions, Data esimHomeBanners) {
        List listB;
        e eVar = mVar.f271560b;
        Intrinsics.checkNotNullParameter(esimHomeBanners, "esimHomeBanners");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        Intrinsics.checkNotNullParameter(onlyManualInstallationAvailable, "onlyManualInstallationAvailable");
        Intrinsics.checkNotNullParameter(esimSubscriptions, "esimSubscriptions");
        List list = (List) iii.c.f(t1.v(esimHomeBanners, userCompany, onlyManualInstallationAvailable, esimSubscriptions), new tif.g(1), new tc6.b(29), new tch.c(eVar, 2));
        List list2 = null;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null && (listB = b(list)) != null) {
            int i = R$attr.uikit_dp8;
            int i2 = R$attr.uikit_dp0;
            yp0.b.o(i, i, i2, i2, listB);
            list2 = listB;
        }
        return list2 == null ? f0.f322471a : list2;
    }

    public static List b(List list) {
        return zhm.u.c(new hg("ID_BANNERS_CAROUSEL", list, 1, x4.c.f10604a, null, new gg.b(list.size() > 1, 2), false, false, null, null, 0, 0, 0, 0, 32720));
    }
}
