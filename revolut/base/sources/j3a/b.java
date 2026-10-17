package j3a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a f170990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f170991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170992c;

    public b(com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.a transferActionsFactory, c avatarItemsMapper, d commonWidgetsMapper) {
        Intrinsics.checkNotNullParameter(transferActionsFactory, "transferActionsFactory");
        Intrinsics.checkNotNullParameter(avatarItemsMapper, "avatarItemsMapper");
        Intrinsics.checkNotNullParameter(commonWidgetsMapper, "commonWidgetsMapper");
        this.f170990a = transferActionsFactory;
        this.f170991b = avatarItemsMapper;
        this.f170992c = v.k(null, WhoToTransferFilter.Revolut.f80005a);
    }

    public final RowDelegate.Model a(boolean z, WhoToTransferFilter whoToTransferFilter) {
        List listK = v.k(WhoToTransferFilter.Revolut.f80005a, WhoToTransferFilter.Groups.f80003a, WhoToTransferFilter.Device.f80002a, null);
        if (z || !listK.contains(whoToTransferFilter)) {
            return null;
        }
        RowDelegate.Model modelA = this.f170990a.a(R$string.who_to_pay_widget_permission_contacts_title, Integer.valueOf(R$string.who_to_pay_widget_permission_contacts_subtitle), LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_profile, R$attr.uikit_colorForeground, R$attr.uikit_colorGreyTone10), WhoToTransferActionItem.PermissionContact.f80098a);
        yp0.b.l(modelA, R$attr.uikit_dp24, R$attr.uikit_dp0, 0, 0, null, false, 60);
        return modelA;
    }
}
