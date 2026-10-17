package n2;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class c implements DoubleFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransferParameters f211418b;

    public /* synthetic */ c(TransferParameters transferParameters, int i) {
        this.f211417a = i;
        this.f211418b = transferParameters;
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        switch (this.f211417a) {
            case 0:
                return Rgb.Companion.generateEotf$lambda$0(this.f211418b, d);
            case 1:
                return Rgb.Companion.generateEotf$lambda$1(this.f211418b, d);
            case 2:
                return Rgb.Companion.generateEotf$lambda$2(this.f211418b, d);
            case 3:
                return Rgb.Companion.generateEotf$lambda$3(this.f211418b, d);
            case 4:
                return Rgb.Companion.generateOetf$lambda$0(this.f211418b, d);
            case 5:
                return Rgb.Companion.generateOetf$lambda$1(this.f211418b, d);
            case 6:
                return Rgb.Companion.generateOetf$lambda$2(this.f211418b, d);
            default:
                return Rgb.Companion.generateOetf$lambda$3(this.f211418b, d);
        }
    }
}
