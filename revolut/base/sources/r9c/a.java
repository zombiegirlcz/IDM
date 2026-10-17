package r9c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.extension.SummaryAccountPickerExtension$AccountPickerConfiguration;
import com.revolut.feature.revolutpay.shared.ui.account_picker.AccountPickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o9c.x0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    @NotNull
    public static final C1391a Companion = new C1391a();

    /* JADX INFO: renamed from: r9c.a$a, reason: collision with other inner class name */
    public static final class C1391a {
        private C1391a() {
        }
    }

    public static List a(Data accountPickerConfiguration) {
        AccountPickerItem accountPickerItem;
        Intrinsics.checkNotNullParameter(accountPickerConfiguration, "accountPickerConfiguration");
        SummaryAccountPickerExtension$AccountPickerConfiguration summaryAccountPickerExtension$AccountPickerConfiguration = (SummaryAccountPickerExtension$AccountPickerConfiguration) accountPickerConfiguration.getContent();
        return (summaryAccountPickerExtension$AccountPickerConfiguration == null || (accountPickerItem = summaryAccountPickerExtension$AccountPickerConfiguration.f84570b) == null) ? f0.f322471a : u.c(new RowDelegate.Model("USER_PROFILE_LIST_ID", new RowDelegate.Model.MainImage.Image24(accountPickerItem.d, false, false, 4), accountPickerItem.f84702b, null, 0, accountPickerItem.f84703c, null, null, 0, x0.a(), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848));
    }
}
