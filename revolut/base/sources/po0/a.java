package po0;

import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f237843a = new a();

    private a() {
    }

    @Override // po0.l
    public final int a(boolean z) {
        return io0.a.d(0.25f, z ? 4547699 : 11657462);
    }

    @Override // po0.l
    public final LottieImage b(boolean z, boolean z3) {
        return new LottieImage(uc0.b.a("mobile/cx/animations/".concat(z ? "dark" : "light"), z ? "air_background_v3" : "air_background"), (List) null, 126);
    }
}
