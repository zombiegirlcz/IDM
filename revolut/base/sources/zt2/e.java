package zt2;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.call_security_info.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import z9h.n;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements st2.e {

    @NotNull
    private static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f325056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f325057b;

    public e(y80.a permissionProvider, ue0.c storage) {
        Intrinsics.checkNotNullParameter(permissionProvider, "permissionProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f325056a = storage;
        List list = null;
        if (!permissionProvider.c("android.permission.READ_PHONE_STATE")) {
            if (!((Boolean) n.h(Boolean.TYPE, storage, "KEY_DISMISSED_CALL_SECURITY_INFO", Boolean.FALSE)).booleanValue()) {
                List listC = u.c(new ActionWidgetDelegate.Model("PERMISSION_REQUEST_LIST_ITEM_ID", new TextLocalisedClause(R$string.in_app_calls_screen_call_permission_banner_title, null, null, 14), new TextLocalisedClause(R$string.in_app_calls_screen_call_permission_banner_subtitle, null, null, 14), new m(new GlyphImage(R$drawable.uikit_icn_24_call, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), new ActionWidgetDelegate.Model.b.a(null), ActionWidgetDelegate.Model.a.C0393a.f51604a, null, null, null, true, 6080));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                list = listC;
            }
        }
        this.f325057b = q.c(list);
    }
}
