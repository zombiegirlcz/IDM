package lvl;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import kvl.d;
import xea.g;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f200381a;

    public a(g pocketPickerMapper) {
        Intrinsics.checkNotNullParameter(pocketPickerMapper, "pocketPickerMapper");
        this.f200381a = pocketPickerMapper;
    }

    public static RowDelegate.Model.MainImage.Image40 a(int i) {
        return new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, i, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorActionBackground, 8.0f, null, null, 48), null, null, false, null, false, 62);
    }
}
