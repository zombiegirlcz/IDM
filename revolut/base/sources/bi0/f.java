package bi0;

import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import di0.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends gi0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci0.a f15365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ei0.b f15366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15367c;

    public f(ci0.a mlKitInputImageCreator, ei0.b moduleInstaller, di0.e textRecognizerClientProvider) {
        Intrinsics.checkNotNullParameter(mlKitInputImageCreator, "mlKitInputImageCreator");
        Intrinsics.checkNotNullParameter(moduleInstaller, "moduleInstaller");
        Intrinsics.checkNotNullParameter(textRecognizerClientProvider, "textRecognizerClientProvider");
        this.f15365a = mlKitInputImageCreator;
        this.f15366b = moduleInstaller;
        this.f15367c = textRecognizerClientProvider;
    }

    public e a(MsBarcodeDetectorSettings settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        return new e(settings, (g) this.f15367c, this.f15366b, this.f15365a);
    }

    public i b(eh0.c supportedScript) {
        Intrinsics.checkNotNullParameter(supportedScript, "supportedScript");
        return new i(this.f15365a, this.f15366b, (di0.e) this.f15367c, supportedScript);
    }

    public f(ei0.b moduleInstaller, g barcodeScannerFactory, ci0.a mlKitInputImageCreator) {
        Intrinsics.checkNotNullParameter(moduleInstaller, "moduleInstaller");
        Intrinsics.checkNotNullParameter(barcodeScannerFactory, "barcodeScannerFactory");
        Intrinsics.checkNotNullParameter(mlKitInputImageCreator, "mlKitInputImageCreator");
        this.f15366b = moduleInstaller;
        this.f15367c = barcodeScannerFactory;
        this.f15365a = mlKitInputImageCreator;
    }
}
