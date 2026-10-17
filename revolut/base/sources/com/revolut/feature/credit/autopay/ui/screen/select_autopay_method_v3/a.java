package com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3ScreenContract$SelectAutopayConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uk4.d;
import uk4.g;
import uk4.h;
import yp0.b;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements n {

    @NotNull
    public static final C0476a Companion = new C0476a();

    /* JADX INFO: renamed from: com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.a$a, reason: collision with other inner class name */
    public static final class C0476a {
        private C0476a() {
        }
    }

    public static RowDelegate.Model a(SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ItemConfig itemConfig, String str) {
        if (!(itemConfig instanceof SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ItemConfig.ChevronItem)) {
            throw new NoWhenBranchMatchedException();
        }
        SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ItemConfig.ChevronItem chevronItem = (SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ItemConfig.ChevronItem) itemConfig;
        RowDelegate.Model model = new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image56(chevronItem.f68660a, (CircleBadgeModel) null, false, 14), chevronItem.f68661b, null, 0, chevronItem.f68662c, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
        b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ToolbarConfig toolbarConfig = domainState.f280676a.f68657a;
        g gVar = new g(toolbarConfig.f68663a, toolbarConfig.f68664b, new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        SelectAutopayMethodV3ScreenContract$SelectAutopayConfig selectAutopayMethodV3ScreenContract$SelectAutopayConfig = domainState.f280676a;
        SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ItemConfig itemConfig = selectAutopayMethodV3ScreenContract$SelectAutopayConfig.f68658b;
        RowDelegate.Model modelA = itemConfig != null ? a(itemConfig, "id_select_autopay_revolut_account") : null;
        SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.ItemConfig itemConfig2 = selectAutopayMethodV3ScreenContract$SelectAutopayConfig.f68659c;
        RowDelegate.Model[] elements = {modelA, itemConfig2 != null ? a(itemConfig2, "id_select_autopay_external_account") : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new h(gVar, kotlin.collections.d.L(elements));
    }
}
