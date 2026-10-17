package bl0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements de0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f16454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.b f16455c;
    public final h31.b d;
    public final l80.e e;
    public final a f;

    public g(Context context, c encryptedSqlDatabaseWrapper, zk0.b fileSystemRepository, h31.b databaseMigrationAnalyticsTracker, l80.e dateProvider, a databaseMigrationProcessChecker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(encryptedSqlDatabaseWrapper, "encryptedSqlDatabaseWrapper");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(databaseMigrationAnalyticsTracker, "databaseMigrationAnalyticsTracker");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(databaseMigrationProcessChecker, "databaseMigrationProcessChecker");
        this.f16453a = context;
        this.f16454b = encryptedSqlDatabaseWrapper;
        this.f16455c = fileSystemRepository;
        this.d = databaseMigrationAnalyticsTracker;
        this.e = dateProvider;
        this.f = databaseMigrationProcessChecker;
    }

    public final f a(String databaseName, String passphrase) {
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(passphrase, "passphrase");
        return new f(this.f16453a, databaseName, passphrase, this.f16454b, this.f16455c, this.d, this.e, this.f, rd0.e.a(p0.f264002b));
    }
}
