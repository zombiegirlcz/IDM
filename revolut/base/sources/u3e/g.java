package u3e;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.store.api.model.StoreGenericBadge;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t1e.t;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g {
    public static final TagViewData a(StoreGenericBadge storeGenericBadge, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(storeGenericBadge, "<this>");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        t tVar = storeGenericBadge.f88522a;
        String str = storeGenericBadge.f88524c;
        if (tVar != t.UNKNOWN) {
            int i = f.f276925a[tVar.ordinal()];
            if (i == 1) {
                return TagViewData.Companion.f(TagViewData.INSTANCE, str, 4);
            }
            if (i == 2) {
                TagViewData tagViewDataD = TagViewData.Companion.d(TagViewData.INSTANCE, str, R$attr.uikit_colorWhite_20, R$attr.uikit_colorWhite);
                String str2 = storeGenericBadge.f88523b;
                return TagViewData.a(tagViewDataD, str2 != null ? new ResourceImage(uiKitResources.a(str2), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246) : null);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
