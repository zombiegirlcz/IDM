package w10;

import java.lang.reflect.Type;
import kg.u;
import kg.x;
import kg.y;
import kg.z;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes.dex */
public final class l implements z {
    @Override // kg.z
    public final u serialize(Object obj2, Type typeOfSrc, y context) {
        Instant src2 = (Instant) obj2;
        Intrinsics.checkNotNullParameter(src2, "src");
        Intrinsics.checkNotNullParameter(typeOfSrc, "typeOfSrc");
        Intrinsics.checkNotNullParameter(context, "context");
        return new x(src2.toString());
    }
}
