package vaf;

import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.navigation.MainContainerScreenFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.k;
import kotlin.jvm.internal.Intrinsics;
import qc0.f1;
import rfm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends f1 {
    @Override // qc0.f1
    public final k i() {
        u uVarG = k.g(new FeatureCommand(new MainContainerScreenFeatureConfig(new MainContainerScreenDestination.JustShow(ibb.c.f160141b.f83420a, (SliderLayout.SlidingSpec) null, (Parcelable) null, 14), 335577088, false)));
        Intrinsics.checkNotNullExpressionValue(uVarG, "just(...)");
        return uVarG;
    }
}
