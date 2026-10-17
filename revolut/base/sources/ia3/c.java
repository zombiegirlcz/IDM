package ia3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ip0.ky;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements m93.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.b f159929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.c f159930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c90.c f159931c;

    public c(m93.b cardDetailsDesignConfigMapper, f01.c uiKitResources, c90.c uiResources) {
        Intrinsics.checkNotNullParameter(cardDetailsDesignConfigMapper, "cardDetailsDesignConfigMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(uiResources, "uiResources");
        this.f159929a = cardDetailsDesignConfigMapper;
        this.f159930b = uiKitResources;
        this.f159931c = uiResources;
    }

    public final ky b(String id10, int i, CustomColors customColors) {
        Intrinsics.checkNotNullParameter(id10, "id");
        return new ky(id10, new ResourceImage(R$drawable.uikit_pic_602_card_placeholder, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, customColors, gz0.b.Undefined, null, null, null, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG), (Clause) null, 190), i, R$attr.uikit_dp16, 48);
    }
}
