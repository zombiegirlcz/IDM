package u3e;

import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.me;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.store.api.model.StoreLogoBadge;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class i {
    public static final RewardDelegate.a a(StoreLogoBadge storeLogoBadge, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(storeLogoBadge, "<this>");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        String str = storeLogoBadge.f88533a;
        return str != null ? new me(LayeredImage.Companion.b(LayeredImage.INSTANCE, uiKitResources.a(str), Integer.valueOf(R$attr.uikit_colorBlack), R$attr.uikit_colorWhite, 4.0f, Float.valueOf(16.0f), null, 32)) : RewardDelegate.a.b.f53196a;
    }
}
