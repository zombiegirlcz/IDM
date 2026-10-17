package po0;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f237851a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f237852b = R$attr.uikit_colorGroupedBackground;

    private f() {
    }

    @Override // po0.l
    public final int a(boolean z) {
        return 0;
    }

    @Override // po0.l
    public final LottieImage b(boolean z, boolean z3) {
        return LottieImage.Companion.a(LottieImage.INSTANCE, uc0.b.a("mobile/onboarding/animations", "background_onboarding"), false, false, null, null, 254);
    }

    @Override // po0.l
    public final Integer c() {
        return Integer.valueOf(f237852b);
    }
}
