package com.google.android.material.sidesheet;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.pipe.core.AndroidThreads;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.core.widget.NestedScrollView;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.MotionCaptureFragment;
import com.onfido.android.sdk.capture.utils.ToolbarHost;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardTabs;
import com.revolut.core.ui_kit.views.LightboxGalleryView;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import com.revolut.feature.travel.miles.impl.ui.screen.transaction.TravelMilesTransactionsListScreen;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49135c;

    public /* synthetic */ b(int i, Runnable runnable) {
        this.f49133a = 15;
        this.f49134b = i;
        this.f49135c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f49133a;
        Object obj2 = this.f49135c;
        int i2 = this.f49134b;
        switch (i) {
            case 0:
                ((SideSheetBehavior) obj2).lambda$setState$0(i2);
                break;
            case 1:
                MotionCaptureFragment.setColorsForCaptureScreen$lambda$0((Toolbar) obj2, i2);
                break;
            case 2:
                ToolbarHost.DefaultImpls.setToolbarColor$lambda$0((ToolbarHost) obj2, i2);
                break;
            case 3:
                ((NestedScrollView) obj2).smoothScrollBy(0, i2);
                break;
            case 4:
                ((TakePictureRequest) obj2).lambda$onCaptureProcessProgressed$3(i2);
                break;
            case 5:
                ReactionsKeyboardTabs.b((ReactionsKeyboardTabs) obj2, i2);
                break;
            case 6:
                ((View) obj2).setVisibility(i2);
                break;
            case 7:
                ((LightboxGalleryView) obj2).i.onNext(Integer.valueOf(i2));
                break;
            case 8:
                Tabs.Companion companion = Tabs.INSTANCE;
                ((Tabs) obj2).setScrollPosition(i2, BitmapDescriptorFactory.HUE_RED, true, true);
                break;
            case 9:
                LoanRepaymentsListScreen loanRepaymentsListScreen = (LoanRepaymentsListScreen) obj2;
                KProperty[] kPropertyArr = LoanRepaymentsListScreen.f70576e0;
                RecyclerView.LayoutManager layoutManager = loanRepaymentsListScreen.h().getLayoutManager();
                Intrinsics.i(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i2, loanRepaymentsListScreen.h3().e.getHeight());
                break;
            case 10:
                KProperty[] kPropertyArr2 = TravelMilesTransactionsListScreen.U;
                ((TravelMilesTransactionsListScreen) obj2).d3().f253788c.smoothScrollToPosition(i2);
                break;
            case 11:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$audioSessionIdChanged$12(i2);
                break;
            case 12:
                TripsListController.Companion aVar = TripsListController.INSTANCE;
                ((TripsListController) obj2).e3().e.getRecyclerView().smoothScrollToPosition(i2);
                break;
            case 13:
                ((CameraCaptureCallback) obj2).onCaptureCancelled(i2);
                break;
            case 14:
                ((BufferedAudioStream) obj2).lambda$updateCollectionBufferSizeAsync$4(i2);
                break;
            default:
                AndroidThreads.withAndroidPriority$lambda$0$0(i2, (Runnable) obj2);
                break;
        }
    }

    public /* synthetic */ b(Object obj2, int i, int i2) {
        this.f49133a = i2;
        this.f49135c = obj2;
        this.f49134b = i;
    }
}
