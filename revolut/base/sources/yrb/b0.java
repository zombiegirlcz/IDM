package yrb;

import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.retail.wealth.resources.R$string;
import d9.e1;
import ip0.wq;
import ip0.xq;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nel.s0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class b0 implements j0b.d {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vdf.d f316210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f316211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f316212c;

    public b0(vdf.d assetFormatter, Map infoMappers, Map centeredAmountMappers) {
        Intrinsics.checkNotNullParameter(assetFormatter, "assetFormatter");
        Intrinsics.checkNotNullParameter(infoMappers, "infoMappers");
        Intrinsics.checkNotNullParameter(centeredAmountMappers, "centeredAmountMappers");
        this.f316210a = assetFormatter;
        this.f316211b = infoMappers;
        this.f316212c = centeredAmountMappers;
    }

    public static koi.j b(boolean z, bfl.g gVar, BigDecimal bigDecimal, Data data, u uVar) {
        boolean zBooleanValue = (z && e1.G(bigDecimal)) ? ((Boolean) iii.c.f(data, new ypd.i(23), new ypg.h(10), new y5g.l(13))).booleanValue() : false;
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LARGE_ACTION_BUTTON_LIST_ID", LargeActionButton.ButtonStyle.f58725a, null, d(gVar), zBooleanValue, "LARGE_BUTTON_LOADING_TAG", gVar + "_BUTTON_E2E_TEST_ID", uVar, null, 520);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }

    public static InputSliderDelegate.Model c(boolean z, w wVar, u uVar) {
        wVar.getClass();
        ArrayList arrayList = new ArrayList(3);
        int i = 0;
        while (i < 3) {
            i++;
            arrayList.add(new wq(null, 25 * i));
        }
        xq xqVar = new xq(arrayList);
        int i2 = wVar.f316249a;
        int i3 = R$attr.uikit_dp0;
        return new InputSliderDelegate.Model("INPUT_SLIDER_LIST_ID", 100, i2, xqVar, z, uVar, i3, i3, 15504);
    }

    public static TextLocalisedClause d(bfl.g gVar) {
        int i = a0.f316208a[gVar.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.wealth_action_buy, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.wealth_action_sell, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // j0b.d
    public final List a(x orderFormState) {
        String str;
        Intrinsics.checkNotNullParameter(orderFormState, "orderFormState");
        if (orderFormState == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        s0 s0Var = orderFormState.f316256j;
        if (s0Var == null) {
            return f0.f322471a;
        }
        bfl.g gVar = orderFormState.f316252b;
        nel.n nVar = s0Var.e;
        List listK = zhm.v.k(new FixedTabs.Item("BUY_TAB_LIST_ID", d(bfl.g.BUY), (AnalyticsContext) null, 12), new FixedTabs.Item("SELL_TAB_LIST_ID", d(bfl.g.SELL), (AnalyticsContext) null, 12));
        FixedTabsDelegate.ExtraButton.Icon icon = new FixedTabsDelegate.ExtraButton.Icon(new ResourceImage(R$drawable.uikit_icn_24_expand, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        int i = a0.f316208a[gVar.ordinal()];
        if (i == 1) {
            str = "BUY_TAB_LIST_ID";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "SELL_TAB_LIST_ID";
        }
        FixedTabsDelegate.Model model = new FixedTabsDelegate.Model("TRADING_TABS_LIST_ID", listK, str, nVar, icon, 0, 0, 0, 0, DefaultFrameSampler.DESIRED_FRAME_WIDTH);
        Data data = orderFormState.k;
        List list = data != null ? (List) iii.c.f(data, new i(this, orderFormState, 2), new ypg.h(9), new soc.f(this, 21, orderFormState, s0Var)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return ue0.e.J(model, list);
    }
}
