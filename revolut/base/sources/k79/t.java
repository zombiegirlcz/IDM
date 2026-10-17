package k79;

import android.webkit.MimeTypeMap;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.AvatarNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.Iterator;
import java.util.List;
import k50.a4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f61.a f181942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f181943b;

    public t(h79.a analyticsMapper, f61.a revolutFeedProductArticleMapper, a helper) {
        Intrinsics.checkNotNullParameter(analyticsMapper, "analyticsMapper");
        Intrinsics.checkNotNullParameter(revolutFeedProductArticleMapper, "revolutFeedProductArticleMapper");
        Intrinsics.checkNotNullParameter(helper, "helper");
        this.f181942a = revolutFeedProductArticleMapper;
        this.f181943b = helper;
    }

    public static List b(boolean z) {
        return u.c(new FullScreenStateDelegate.Model("ERROR_STATE_LIST_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), zj.REGULAR, z, null, null, null, 1860));
    }

    public final kp0.r a(String asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(asset));
        return new kp0.r(mimeTypeFromExtension != null ? d0.J(mimeTypeFromExtension, "video", false) : false ? new UrlVideo(asset, (String) null, false, oz0.b.CENTER_CROP, false, (oz0.c) null, LDSFile.EF_DG4_TAG) : new UrlImage(asset, null, null, null, 0L, null, null, null, ez0.h.CenterCrop, null, false, null, null, null, false, false, 523774), new Color.Solid(R$attr.uikit_colorGroupedBackground), new aw0.d0(343, 321));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f181918a, new a4(this, 29), new k1f.n(this), new joa.j(this, domainState, 17));
        int i = -1;
        if (!domainState.f181920c) {
            Iterator it8 = list.iterator();
            int i2 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (Intrinsics.f(((koi.j) it8.next()).getF52222a(), "NEW_MESSAGE_SECTION")) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        return new i(list, i, u.c(AvatarNavBarMenuItem.Companion.a(AvatarNavBarMenuItem.INSTANCE, "AVATAR_MENU_ITEM_ID", LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_megaphone, R$attr.uikit_colorForeground, R$attr.uikit_colorForeground_10), null, 28)));
    }
}
