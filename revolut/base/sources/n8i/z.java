package n8i;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public interface z {
    default Flow a(vkm.h contentFlow) {
        Intrinsics.checkNotNullParameter(contentFlow, "contentFlow");
        return new go.g(new Data(null, null, false, 7, null), 2);
    }

    Class getType();
}
