package vz4;

import android.view.View;
import androidx.arch.core.util.Function;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.TrackGroup;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.penny_verification.PennyAuthorisationResult;
import com.revolut.feature.payments.transfers.personalisation.impl.ui.gif.TransferPersonalisationGifSelector;
import com.revolut.feature_exchange.impl.ui.exchange.order_settings.OrderSettingsActivity;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.w;
import java.util.List;
import java.util.Set;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vrl.n;
import vx9.v;
import w38.x;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements o, Function, kfm.g, OnApplyWindowInsetsListener, DefaultTrackSelector.TrackInfo.Factory, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f293385b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f293384a = i;
        this.f293385b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f293384a) {
            case 10:
                ((v) this.f293385b).invoke(obj2);
                break;
            case 11:
                ((n) this.f293385b).invoke(obj2);
                break;
            case 12:
            case 13:
            case 14:
            default:
                ((w4l.a) this.f293385b).invoke(obj2);
                break;
            case 15:
                ((sc7.b) this.f293385b).invoke(obj2);
                break;
            case 16:
                ((w21.b) this.f293385b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f293384a;
        Object obj2 = this.f293385b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((vz1.h) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((d) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((d) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((n) obj2).invoke(p0);
            case 4:
                return Long.valueOf(((EncoderImpl) obj2).toPresentationTimeUsByCaptureEncodeRatio(((Long) p0).longValue()));
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((vz1.h) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((vsl.f) obj2).invoke(p0);
            case 7:
                int i2 = OrderSettingsActivity.f96904w0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((vz1.h) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((w1i.h) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((w1i.h) obj2).invoke(p0);
            case 10:
            case 11:
            case 15:
            case 16:
            case 21:
            case 24:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((sc7.b) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x61.e) ((vsl.f) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((w2.c) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PennyAuthorisationResult) ((w2.c) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x61.e) ((vsl.f) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (io3.d) ((w21.b) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((w2.c) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((w2.c) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((x) obj2).invoke(p0);
            case 23:
                return (Data) ((hsd.d) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((w29.a) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Set) ((w29.a) obj2).invoke(p0);
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, TrackGroup trackGroup, int[] iArr) {
        return DefaultTrackSelector.lambda$selectImageTrack$5((DefaultTrackSelector.Parameters) this.f293385b, i, trackGroup, iArr);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        TransferPersonalisationGifSelector transferPersonalisationGifSelector = (TransferPersonalisationGifSelector) this.f293385b;
        KProperty[] kPropertyArr = TransferPersonalisationGifSelector.V;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        Insets insets2 = insets.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.top;
        ControllerContainerConstraintLayout controllerContainerConstraintLayout = transferPersonalisationGifSelector.d3().f191722a;
        Intrinsics.checkNotNullExpressionValue(controllerContainerConstraintLayout, "getRoot(...)");
        knm.b.y(kli.a.k(transferPersonalisationGifSelector.m2(), 68.0f) + i, controllerContainerConstraintLayout);
        Insets insetsOf = Insets.of(insets.getSystemWindowInsetLeft(), 0, insets.getSystemWindowInsetRight(), insets.getSystemWindowInsetBottom());
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setSystemWindowInsets(insetsOf).setInsets(iSystemBars, Insets.of(insets2.left, 0, insets2.right, insets2.bottom)).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        return windowInsetsCompatBuild;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        w29.a aVar = (w29.a) this.f293385b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) aVar.invoke(p0)).booleanValue();
    }
}
