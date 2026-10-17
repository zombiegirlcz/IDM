package n50;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a20.a f212491a;

    public l(a20.a chatAuthHeadersProvider, j30.c chatFeatureToggles) {
        Intrinsics.checkNotNullParameter(chatAuthHeadersProvider, "chatAuthHeadersProvider");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        this.f212491a = chatAuthHeadersProvider;
    }

    public static IconNavBarMenuItem b(int i, String str) {
        return IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, str, new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
    }

    public final UrlImage a(String str) {
        return new UrlImage(str, null, null, null, 0L, new UrlImage.LazyCustomHeaders("chat_headers", new mzb.e(this, str, 12)), null, null, null, x40.a.b(), false, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505), null, null, false, false, 504766);
    }
}
