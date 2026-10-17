package yy0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ i f317754a = new i();

    private i() {
    }

    public static l a(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Clause f60029s = image.getD();
        return f60029s == null ? new j(image) : new g(f60029s, image);
    }
}
