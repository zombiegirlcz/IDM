package e3e;

import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ImageTransformations f122249b = new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, true, 7), null, null, null, 48, 48, 29);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f122250a;

    public b(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f122250a = uiKitResources;
    }
}
