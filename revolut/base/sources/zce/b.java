package zce;

import bde.q;
import java.lang.reflect.Type;
import kg.u;
import kg.y;
import kg.z;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type type, y context) {
        q src2 = (q) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(context, "context");
        throw new NotImplementedError("TroubleshootingDto is not supposed to be serialized.");
    }
}
