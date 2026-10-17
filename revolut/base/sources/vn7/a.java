package vn7;

import aim.e;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.insurance_car.impl.R$string;
import ip0.tm0;
import ip0.um0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    @NotNull
    public static final C1609a Companion = new C1609a();

    /* JADX INFO: renamed from: vn7.a$a, reason: collision with other inner class name */
    public static final class C1609a {
        private C1609a() {
        }
    }

    public static y a(int i, int i2, int i3, Integer num) {
        String str = null;
        return new y(u.c(new um0("TWIN_BUTTON", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(i3, null, null, 14), false, null, str, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(i2, null, null, 14), false, str, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, R$attr.uikit_dp8, 0, 0, 888)), new t(new TextLocalisedClause(i, null, null, 14), num != null ? new TextLocalisedClause(num.intValue(), null, null, 14) : null, null, 28), l.WINDOW, null, null, null, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, null, 3320);
    }

    public static /* synthetic */ y b(a aVar, int i, Integer num, int i2, int i3) {
        if ((i3 & 2) != 0) {
            num = null;
        }
        if ((i3 & 4) != 0) {
            i2 = R$string.car_insurance_common_continue;
        }
        int i5 = R$string.car_insurance_common_cancel;
        aVar.getClass();
        return a(i, i2, i5, num);
    }

    public static y c(Clause clause, Clause clause2, Integer num, Integer num2) {
        t tVar = new t(clause, null, null, 30);
        l lVar = l.WINDOW;
        e eVarB = u.b();
        eVarB.add(new PlainTextDelegate.Model(clause2.toString(), (Clause) null, clause2, (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, R$attr.uikit_dp0, 0, 0, 0, 61422));
        if (num != null) {
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(num.intValue(), null, null, 14);
            int i = R$attr.uikit_dp16;
            eVarB.add(new LargeActionButtonDelegate.Model("PRIMARY_BUTTON", defaultFilledButton, null, textLocalisedClause, false, null, null, i, num2 != null ? R$attr.uikit_dp8 : R$attr.uikit_dp24, i, i, 496));
        }
        if (num2 != null) {
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton2 = LargeActionButton.ButtonStyle.f58726b;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(num2.intValue(), null, null, 14);
            int i2 = num != null ? R$attr.uikit_dp8 : R$attr.uikit_dp16;
            int i3 = R$attr.uikit_dp24;
            int i5 = R$attr.uikit_dp16;
            eVarB.add(new LargeActionButtonDelegate.Model("SECONDARY_BUTTON", defaultFilledButton2, null, textLocalisedClause2, false, null, null, i2, i3, i5, i5, 496));
        }
        return new y(u.a(eVarB), tVar, lVar, null, null, null, null, new AnalyticsProduct.Retail(zl7.a.f323191b), null, null, 3320);
    }

    public static y d(a aVar, int i, int i2, List descriptionArgs, Integer num, Integer num2, int i3) {
        if ((i3 & 4) != 0) {
            descriptionArgs = f0.f322471a;
        }
        if ((i3 & 8) != 0) {
            num = Integer.valueOf(R$string.car_insurance_common_close);
        }
        if ((i3 & 32) != 0) {
            num2 = null;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(descriptionArgs, "descriptionArgs");
        Intrinsics.checkNotNullParameter("PRIMARY_BUTTON", "primaryButtonId");
        Intrinsics.checkNotNullParameter("SECONDARY_BUTTON", "secondaryButtonId");
        return c(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, descriptionArgs, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8), num, num2);
    }

    public static y e(a aVar, String title, String description) {
        Integer numValueOf = Integer.valueOf(R$string.car_insurance_common_close);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter("PRIMARY_BUTTON", "primaryButtonId");
        Intrinsics.checkNotNullParameter("SECONDARY_BUTTON", "secondaryButtonId");
        return c(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(description, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124), numValueOf, null);
    }
}
