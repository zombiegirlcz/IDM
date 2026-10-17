package pfe;

import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public interface i {
    default boolean F(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        return false;
    }

    Flow t(ProductAccountDescriptor$Value productAccountDescriptor$Value);
}
