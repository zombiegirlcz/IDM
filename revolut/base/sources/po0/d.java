package po0;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f237847a = new d();

    private d() {
    }

    @Override // po0.l
    public final int a(boolean z) {
        int i;
        float f;
        if (z) {
            i = 1255165;
            f = 0.15f;
        } else {
            i = 6919167;
            f = 0.2f;
        }
        return io0.a.d(f, i);
    }

    @Override // po0.l
    public final LottieImage b(boolean z, boolean z3) {
        return new LottieImage(uc0.b.a("mobile/cx/animations/".concat(z ? "dark" : "light"), "cx_background"), (List) null, 126);
    }
}
