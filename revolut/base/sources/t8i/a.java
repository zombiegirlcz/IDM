package t8i;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import n8i.w;
import n8i.z;
import vkm.h;
import vkm.q;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements z {
    @Override // n8i.z
    public final Flow a(h contentFlow) {
        Intrinsics.checkNotNullParameter(contentFlow, "contentFlow");
        return q.H(new qkg.a(2, 28, null), contentFlow);
    }

    @Override // n8i.z
    public final Class getType() {
        return w.class;
    }
}
