package j4j;

import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.AccountFieldsScreenContract$InputData;
import j3c.y;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountFieldsScreenContract$InputData f171417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f171418b;

    public f(AccountFieldsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f171417a = inputData;
        this.f171418b = yhm.j.b(new y(8));
    }

    public final FixedTabsDelegate.Model a(u2j.d dVar) {
        return new FixedTabsDelegate.Model("ITEM_ACCOUNT_TYPE_TABS_ID", (List) this.f171418b.getValue(), dVar.name(), null, null, null, R$attr.uikit_dp0, 0, 3800);
    }
}
