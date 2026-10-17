package vph;

import com.google.android.material.internal.ViewUtils;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth_discovery.impl.screener.screens.common.ScreenerIconOption;
import ip0.xk;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f291214a;

    public j(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f291214a = uiKitResources;
    }

    public final List a(String str, List icons) {
        ProgressStyle progressStyle;
        Intrinsics.checkNotNullParameter(icons, "icons");
        List<String> list = icons;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (String str2 : list) {
            String strQ = j6.a.q("list-id-", str2);
            LayeredImage layeredImageK = LayeredImage.INSTANCE.k(this.f291214a.a(str2), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10);
            if (str2.equals(str)) {
                int i = R$attr.uikit_colorAccent;
                progressStyle = new ProgressStyle(1, 1, i, i, i, 2.0f, 2.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS);
            } else {
                progressStyle = null;
            }
            arrayList.add(new ReferralContactDelegate.Model(strQ, new AvatarModel.Default(layeredImageK, null, null, progressStyle, null, null, LDSFile.EF_DG4_TAG), null, null, null, null, new ScreenerIconOption(str2), null, 6136));
        }
        List listC = u.c(new xk("icon-grid-list-id", arrayList, 4, null, null, 56));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
