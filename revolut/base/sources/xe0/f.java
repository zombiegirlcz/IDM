package xe0;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f304518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f304519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ye0.b f304520c;

    public f(a clearablesContainer, Context context, ye0.b storageSizeChecker) {
        Intrinsics.checkNotNullParameter(clearablesContainer, "clearablesContainer");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(storageSizeChecker, "storageSizeChecker");
        this.f304518a = clearablesContainer;
        this.f304519b = context;
        this.f304520c = storageSizeChecker;
    }

    public static b a(f fVar, yk0.a dbSessionProvider, String fileName, ke0.a mapper) {
        f0 migrationList = f0.f322471a;
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(migrationList, "migrationList");
        Context context = fVar.f304519b;
        we0.c.Companion.getClass();
        return new b(context, fileName, mapper, we0.b.a(fileName, 1, migrationList, mapper), new qm.e(dbSessionProvider), fVar.f304520c);
    }

    public static e c(f fVar, yk0.a dbSessionProvider, String fileName, je0.d mapper, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new e(fVar.f304519b, fileName, mapper, new a80.e(i), new qm.e(dbSessionProvider), fVar.f304520c);
    }

    public static ve0.c e(f fVar, String str, je0.d dVar, int i) {
        return fVar.d(1, str, f0.f322471a, dVar);
    }

    public static e f(f fVar, yk0.a dbSessionProvider, String fileName, je0.d mapper, int i, List migrationList, int i2) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        if ((i2 & 16) != 0) {
            migrationList = f0.f322471a;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(dbSessionProvider, "dbSessionProvider");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(migrationList, "migrationList");
        Context context = fVar.f304519b;
        we0.c.Companion.getClass();
        return new e(context, fileName, mapper, we0.b.a(fileName, i, migrationList, mapper), new qm.e(dbSessionProvider), fVar.f304520c);
    }

    public static e g(f fVar, yk0.a databaseSessionProvider, String fileName, je0.d mapper, int i, List migrationList, boolean z, int i2) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        if ((i2 & 16) != 0) {
            migrationList = f0.f322471a;
        }
        if ((i2 & 64) != 0) {
            z = true;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(migrationList, "migrationList");
        Context context = fVar.f304519b;
        we0.c.Companion.getClass();
        e storage = new e(context, fileName, mapper, we0.b.a(fileName, i, migrationList, mapper), new qm.e(databaseSessionProvider), fVar.f304520c);
        if (!z) {
            return storage;
        }
        a aVar = fVar.f304518a;
        synchronized (aVar) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            aVar.f304514a.add(storage);
        }
        return storage;
    }

    public final ve0.c b(String fileName, je0.d mapper, int i) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new ve0.c(this.f304519b, fileName, mapper, new a80.e(i), this.f304520c);
    }

    public final ve0.c d(int i, String fileName, List migrationList, je0.d mapper) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(migrationList, "migrationList");
        we0.c.Companion.getClass();
        return new ve0.c(this.f304519b, fileName, mapper, we0.b.b(i, fileName, migrationList, mapper), this.f304520c);
    }
}
