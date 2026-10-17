package y45;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements i1j.a {
    @Override // i1j.a
    public final Flow a(List balanceGroupList) {
        Intrinsics.checkNotNullParameter(balanceGroupList, "balanceGroupList");
        return new v1(new l(balanceGroupList, null));
    }
}
