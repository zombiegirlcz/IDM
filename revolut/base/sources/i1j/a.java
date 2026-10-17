package i1j;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes10.dex */
public interface a {
    Flow a(List list);

    default boolean b(k1j.c balanceGroupType) {
        Intrinsics.checkNotNullParameter(balanceGroupType, "balanceGroupType");
        return true;
    }
}
