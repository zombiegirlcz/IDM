package edc;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f124971a;
        String str = domainState.f124972b;
        List<AccountPickerItem> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (AccountPickerItem accountPickerItem : list2) {
            boolean zF = Intrinsics.f(accountPickerItem.f84701a, str);
            tf tfVar = null;
            AccentCircleBadge accentCircleBadge = zF ? new AccentCircleBadge(dw0.a.Checked) : null;
            if (!zF && accountPickerItem.e) {
                tfVar = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_link_external_simple, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
            }
            arrayList.add(new RowDelegate.Model(j6.a.q("ACCOUNT_PICKER_ROW_LIST_ID_", accountPickerItem.f84701a), new RowDelegate.Model.MainImage.Image40(accountPickerItem.d, accentCircleBadge, null, false, null, false, 60), accountPickerItem.f84702b, null, 0, accountPickerItem.f84703c, null, null, 0, tfVar, false, null, zF, null, null, null, null, null, null, accountPickerItem, null, 0, 0, 0, 0, 532667352));
        }
        yp0.b.k(arrayList, R$attr.uikit_dp32, R$attr.uikit_dp24, 0, 0, 28);
        return new c(arrayList);
    }
}
