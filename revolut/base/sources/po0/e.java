package po0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieColorOverride;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f237848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f237849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f237850c;

    public e(int i, int i2, int i3) {
        this.f237848a = i;
        this.f237849b = i2;
        this.f237850c = i3;
    }

    @Override // po0.l
    public final int a(boolean z) {
        return 0;
    }

    @Override // po0.l
    public final LottieImage b(boolean z, boolean z3) {
        return LottieImage.Companion.a(LottieImage.INSTANCE, uc0.b.a("mobile/animations/core", "country_colors_bg_android"), false, false, new LottieImage.ColorOverride.Explicit(zhm.v.k(new LottieColorOverride(zhm.v.k("primary", "**"), new Color.SolidInt(this.f237848a), null, null, 12), new LottieColorOverride(zhm.v.k("secondary", "**"), new Color.SolidInt(this.f237849b), null, null, 12), new LottieColorOverride(zhm.v.k("tertiary", "**"), new Color.SolidInt(this.f237850c), null, null, 12))), null, Constants.TAG_BOOT_LOADER_CHECKSUM);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f237848a == eVar.f237848a && this.f237849b == eVar.f237849b && this.f237850c == eVar.f237850c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f237850c) + j6.a.b(this.f237849b, Integer.hashCode(this.f237848a) * 31, 31);
    }
}
