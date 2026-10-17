package we0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {
    private b() {
    }

    public static c a(String fileName, int i, List migrationList, je0.b mapper) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(migrationList, "migrationList");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new c(fileName, i, migrationList, mapper, a.f296605a);
    }

    public static c b(int i, String fileName, List migrationList, je0.d mapper) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(migrationList, "migrationList");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new c(fileName, i, migrationList, mapper, f.f296610a);
    }
}
