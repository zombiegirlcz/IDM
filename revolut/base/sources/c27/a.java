package c27;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final C0135a Companion = new C0135a();

    /* JADX INFO: renamed from: c27.a$a, reason: collision with other inner class name */
    public static final class C0135a {
        private C0135a() {
        }
    }

    public static RowDelegate.Model a(int i, int i2, Integer num, Object obj2, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, i2, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 10.0f, Float.valueOf(20.0f), null, 32), null, null, false, null, false, 62), new TextLocalisedClause(i, null, null, 14), null, 0, new TextLocalisedClause(num.intValue(), null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, obj2, null, 0, 0, 0, 0, 532676568);
    }
}
