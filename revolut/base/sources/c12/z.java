package c12;

import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes20.dex */
public interface z {
    default void K(hrf.f transferDirection, String listId) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        Intrinsics.checkNotNullParameter(listId, "listId");
    }

    default void W0(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
    }

    void X(y yVar);

    default void d(String item) {
        Intrinsics.checkNotNullParameter(item, "item");
    }

    void e1(ApmRecipient apmRecipient, hrf.f fVar);

    Flow g2(hrf.f fVar);

    n02.b l1();

    default List o0(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return zhm.f0.f322471a;
    }

    void y0(hrf.f fVar, zm3.f fVar2);
}
