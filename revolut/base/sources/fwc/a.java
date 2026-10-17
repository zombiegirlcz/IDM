package fwc;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.repository.OutboundTransactionLimit;
import com.revolut.feature.security_hub.impl.repository.ReadOnlyDialog;
import com.revolut.kompot.common.bottom_sheet.row_actions.RowActionsBottomSheetController;
import grl.k9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xtc.d f138600a;

    public a(xtc.d securityHubIconMapper) {
        Intrinsics.checkNotNullParameter(securityHubIconMapper, "securityHubIconMapper");
        this.f138600a = securityHubIconMapper;
    }

    public final RowActionsBottomSheetController a(OutboundTransactionLimit limit) {
        eii.c cVar;
        Intrinsics.checkNotNullParameter(limit, "limit");
        ReadOnlyDialog readOnlyDialog = limit.f85487s;
        if (readOnlyDialog != null) {
            TextClause textClause = new TextClause(readOnlyDialog.f85494a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            String str = readOnlyDialog.f85495b;
            lw0.a aVar = new lw0.a(textClause, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, false, 28);
            ArrayList<ReadOnlyDialog.Item> arrayList = readOnlyDialog.f85496c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            for (ReadOnlyDialog.Item item : arrayList) {
                TextClause textClause2 = new TextClause(item.f85500b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str2 = item.f85501c;
                TextClause textClause3 = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                Integer numA = this.f138600a.a(item.f85499a);
                arrayList2.add(new eii.l((Clause) textClause2, (Clause) textClause3, (RowDelegate.Model.MainImage) (numA != null ? new RowDelegate.Model.MainImage.Image24(new ResourceImage(numA.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6) : null), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
            }
            ReadOnlyDialog.Button button = readOnlyDialog.d;
            aw0.e eVar = button != null ? new aw0.e(false, null, null, new n6(new TextClause(button.f85497a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55) : null;
            k9 value = k9.SecurityHub;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value, "value");
            cVar = new eii.c(aVar, eVar, arrayList2, new AnalyticsProduct.Retail(value), null);
        } else {
            lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.security_hub_transactions_limits_dialog_read_only_title, zhm.u.c(new TextClause(limit.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), null, null, null, false, 30);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.security_hub_transactions_limits_dialog_read_only_item_money_title, zhm.u.c(com.revolut.feature.security_hub.impl.repository.a.a(limit.f85476b)), null, 12);
            String str3 = limit.u;
            List listK = zhm.v.k(new eii.l((Clause) textLocalisedClause, (Clause) (str3 == null ? new TextLocalisedClause(R$string.security_hub_transactions_limits_dialog_read_only_item_money_subtitle, null, null, 14) : null), (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488), new eii.l((Clause) new TextLocalisedClause(R$string.security_hub_transactions_limits_dialog_read_only_item_accounts_title, null, null, 14), (Clause) null, (RowDelegate.Model.MainImage) new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), false, false, (RowDelegate.Model.c) null, (Object) null, 488));
            aw0.e eVar2 = str3 != null ? new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.security_hub_transactions_limits_dialog_read_only_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55) : null;
            k9 value2 = k9.SecurityHub;
            Parcelable.Creator<AnalyticsProduct.Retail> creator2 = AnalyticsProduct.Retail.CREATOR;
            Intrinsics.checkNotNullParameter(value2, "value");
            cVar = new eii.c(aVar2, eVar2, listK, new AnalyticsProduct.Retail(value2), null);
        }
        return new RowActionsBottomSheetController(cVar);
    }
}
