package kbb;

import aii.u;
import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$InputData;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSlideFlowContract$InputData;
import com.revolut.feature.rev10_main_screen.impl.ui.slide.MainContainerSliderFlow;
import com.revolut.kompot.bridge.navigation.MainScreenDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f182555a;

    public g(a destinationDecorator) {
        Intrinsics.checkNotNullParameter(destinationDecorator, "destinationDecorator");
        this.f182555a = destinationDecorator;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof MainContainerScreenDestination.JustShow) {
            MainContainerScreenDestination.JustShow justShow = (MainContainerScreenDestination.JustShow) destination;
            return new MainContainerSliderFlow(new MainContainerSlideFlowContract$InputData(new MainContainerFlowContract$InputData.Launch(new MainScreenTab(justShow.f83414a), justShow.f83415b, justShow.f83416c)));
        }
        if (destination instanceof MainContainerScreenDestination.Action) {
            return new MainContainerSliderFlow(new MainContainerSlideFlowContract$InputData(new MainContainerFlowContract$InputData.Action(ibb.c.a(), ((MainContainerScreenDestination.Action) destination).f83412a)));
        }
        return null;
    }

    @Override // nhi.f
    public final u i(u destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (destination instanceof MainScreenDestination) {
            return new MainContainerScreenDestination.JustShow(ibb.c.a().getF83420a(), (SliderLayout.SlidingSpec) null, (Parcelable) null, 14);
        }
        if (destination instanceof MainContainerScreenDestination.JustShow) {
            return this.f182555a.a((MainContainerScreenDestination.JustShow) destination);
        }
        return null;
    }
}
