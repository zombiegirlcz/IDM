package hdk;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.retail.feature.plan_rewards.api.model.MonthlyDrawHub$BottomSheet;
import grl.k9;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f151467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k9 f151468b;

    public c(f01.c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f151467a = uiKitResources;
        k9 value = k9.Premium;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.f151468b = value;
    }

    public static aw0.e a(MonthlyDrawHub$BottomSheet monthlyDrawHub$BottomSheet) {
        return new aw0.e(false, null, null, new n6(new TextClause(monthlyDrawHub$BottomSheet.f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
    }

    public final lw0.a b(MonthlyDrawHub$BottomSheet monthlyDrawHub$BottomSheet) {
        Integer numG;
        TextClause textClause = new TextClause(monthlyDrawHub$BottomSheet.f102526c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = monthlyDrawHub$BottomSheet.d;
        TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        String str2 = monthlyDrawHub$BottomSheet.f102525b;
        return new lw0.a(textClause, textClause2, (str2 == null || (numG = io3.h.g(this.f151467a, str2)) == null) ? null : new lw0.b(new ResourceImage(numG.intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null), null, false, 24);
    }
}
