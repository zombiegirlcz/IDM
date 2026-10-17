package xge;

import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 {
    private d0() {
    }

    public static String a(ProductSpaceIdentifier spaceIdentifier, pie.v subSpaceIdentifier) {
        Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
        Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
        return com.google.android.gms.internal.mlkit_vision_face.a.o(spaceIdentifier.getF89742b(), "_:_", subSpaceIdentifier.getId());
    }
}
