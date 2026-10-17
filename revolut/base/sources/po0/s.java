package po0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieColorOverride;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements l {

    @NotNull
    private static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f237861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f237862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f237863c;
    public final Float d;
    public final int e = R$attr.uikit_colorGroupedBackground;

    public s(int i, int i2, int i3, Float f) {
        this.f237861a = i;
        this.f237862b = i2;
        this.f237863c = i3;
        this.d = f;
    }

    @Override // po0.l
    public final int a(boolean z) {
        Float f = this.d;
        float fFloatValue = (f != null ? f.floatValue() : 1.0f) * 0.25f;
        return z ? io0.a.d(fFloatValue, this.f237861a) : io0.a.d(fFloatValue, this.f237863c);
    }

    @Override // po0.l
    public final LottieImage b(boolean z, boolean z3) {
        String str = z ? "dark" : "light";
        String str2 = z ? "Left Elipse" : "Elipse L";
        String str3 = z ? "Right Elipse" : "Elipse S";
        int i = this.f237863c;
        return new LottieImage(uc0.b.a("mobile/onboarding/animations/".concat(str), z3 ? "default_background_wide" : "default_background"), zhm.v.k(new LottieColorOverride(zhm.v.k(str2, "**"), new Color.SolidInt(z ? io0.a.d(1.0f, this.f237861a) : io0.a.d(1.0f, i)), null, this.d, 4), new LottieColorOverride(zhm.v.k(str3, "**"), new Color.SolidInt(z ? io0.a.d(1.0f, this.f237862b) : io0.a.d(1.0f, i)), null, this.d, 4)), 94);
    }

    @Override // po0.l
    public final Integer c() {
        return Integer.valueOf(this.e);
    }
}
