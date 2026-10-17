package sx4;

import android.view.View;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.revolut.camerakit.revolut.ui.flow.steps.camera.CameraKitCameraScreen;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.TransferAmountScreen;
import com.revolut.feature.freelancer.impl.ui.onboarding.validation.OnboardingInputDataValidator$ValidationState;
import com.revolut.retail.core.navigation.CompositeCommand;
import efm.h0;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import sx2.h;
import sxi.i;
import sy.j;
import t33.n;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements o, OnApplyWindowInsetsListener, CallbackToFutureAdapter.Resolver, kfm.g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f266359b;

    public /* synthetic */ c(Object obj2, int i) {
        this.f266358a = i;
        this.f266359b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((n) this.f266359b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f266358a;
        Object obj2 = this.f266359b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((js7.c) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((sx2.g) obj2).invoke(p0);
            case 2:
            case 10:
            case 17:
            case 21:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CompositeCommand) ((ec9.a) obj2).invoke(p0);
            case 3:
                KProperty[] kPropertyArr = CameraKitCameraScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (j) ((sx2.g) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((sx8.a) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((sz3.d) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (OnboardingInputDataValidator$ValidationState) ((sef.j) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((sx2.g) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((szb.g) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((szb.g) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((szb.g) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((t1i.j) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lrf.a) ((szb.g) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((sx8.a) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((n) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n) obj2).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((n) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((szb.g) obj2).invoke(p0);
            case 22:
                KProperty[] kPropertyArr2 = TransferAmountScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (t42.a) ((t3b.g) obj2).invoke(p0);
            case 23:
                KProperty[] kPropertyArr3 = TransferAmountScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (t42.a) ((t3b.g) obj2).invoke(p0);
            case 24:
                KProperty[] kPropertyArr4 = TransferAmountScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (t42.a) ((t3b.g) obj2).invoke(p0);
            case 25:
                KProperty[] kPropertyArr5 = TransferAmountScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (t42.a) ((t3b.g) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((h) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((sx8.a) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((pud.b) obj2).invoke(p0);
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((AudioSource) this.f266359b).lambda$release$5(completer);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        CameraKitCameraScreen cameraKitCameraScreen = (CameraKitCameraScreen) this.f266359b;
        KProperty[] kPropertyArr = CameraKitCameraScreen.U;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        if (cameraKitCameraScreen.R == -1) {
            cameraKitCameraScreen.R = cameraKitCameraScreen.d3().d.getPaddingBottom();
        }
        FooterTextView cameraKitCameraScreenFooterText = cameraKitCameraScreen.d3().d;
        Intrinsics.checkNotNullExpressionValue(cameraKitCameraScreenFooterText, "cameraKitCameraScreenFooterText");
        cameraKitCameraScreenFooterText.setPadding(cameraKitCameraScreenFooterText.getPaddingLeft(), cameraKitCameraScreenFooterText.getPaddingTop(), cameraKitCameraScreenFooterText.getPaddingRight(), insets2.bottom + cameraKitCameraScreen.R);
        return insets;
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        szb.g gVar = (szb.g) this.f266359b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) gVar.invoke(p0)).booleanValue();
    }
}
