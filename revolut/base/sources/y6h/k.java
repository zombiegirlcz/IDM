package y6h;

import com.revolut.feature.wealth.impl.data.repositories.CollectionsRepository$Companion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {
    private k() {
    }

    public static String a(CollectionsRepository$Companion.CollectionQuoteRequestInfo collectionQuoteRequestInfo) {
        Intrinsics.checkNotNullParameter(collectionQuoteRequestInfo, "<this>");
        return j6.a.q("COLLECTION_QUOTE_KEY_PREFIX", collectionQuoteRequestInfo.f95508a);
    }
}
