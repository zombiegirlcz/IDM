package po0;

import androidx.core.graphics.ColorUtils;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f237854a = new k();

    private k() {
    }

    @Override // po0.l
    public final int a(boolean z) {
        return z ? ColorUtils.blendARGB(io0.a.d(0.2f, 1203), io0.a.d(0.1f, 14361624), 0.5f) : ColorUtils.blendARGB(io0.a.d(0.1f, 1203), io0.a.d(0.1f, 14361624), 0.5f);
    }

    @Override // po0.l
    public final LottieImage b(boolean z, boolean z3) {
        return new LottieImage(uc0.b.a("mobile/revolut_x/animations/".concat(z ? "dark" : "light"), "revx_background"), (List) null, 126);
    }
}
