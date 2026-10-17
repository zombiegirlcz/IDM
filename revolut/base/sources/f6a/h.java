package f6a;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h {
    public static final String a(String str, String childId) {
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-payments_migration-impl-models-providers-BlockId$-$this$childListId$0");
        Intrinsics.checkNotNullParameter(childId, "childId");
        return a0.d.u(new StringBuilder("block_"), str, "_item_", childId);
    }

    public static final UrlImage b(Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "<this>");
        String str = provider.d;
        if (str == null) {
            str = "";
        }
        return new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
    }
}
