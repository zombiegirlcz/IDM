package lv6;

import com.revolut.core.ui_kit_core.displayers.image.models.BulletImage;
import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C1136a Companion = new C1136a();

    /* JADX INFO: renamed from: lv6.a$a, reason: collision with other inner class name */
    public static final class C1136a {
        private C1136a() {
        }
    }

    public static BulletImage a(int i) {
        return com.revolut.core.ui_kit_core.displayers.image.models.a.b(i, Integer.valueOf(R$attr.uikit_colorForeground), Integer.valueOf(R$attr.uikit_colorBackground), null, 8);
    }
}
