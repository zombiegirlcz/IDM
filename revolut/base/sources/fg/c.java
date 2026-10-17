package fg;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f134861a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f134862b = Collections.synchronizedMap(new LinkedHashMap());

    public static a a(d dVar) {
        Map dependencies = f134862b;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        Object obj2 = dependencies.get(dVar);
        if (obj2 != null) {
            Intrinsics.checkNotNullExpressionValue(obj2, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return (a) obj2;
        }
        throw new IllegalStateException("Cannot get dependency " + dVar + ". Dependencies should be added at class load time.");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[Catch: all -> 0x00ca, TRY_ENTER, TryCatch #0 {all -> 0x00ca, blocks: (B:21:0x009b, B:24:0x00b1, B:25:0x00c9), top: B:30:0x009b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009a -> B:30:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.c.b(gim.c):java.lang.Object");
    }
}
