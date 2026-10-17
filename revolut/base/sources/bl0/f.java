package bl0;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.f0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16449c;
    public final c d;
    public final zk0.b e;
    public final h31.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l80.e f16450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f16451h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CountDownLatch f16452j;
    public volatile boolean k;

    public f(Context context, String databaseName, String passphrase, c encryptedSqlDatabaseWrapper, zk0.b fileSystemRepository, h31.b databaseMigrationAnalyticsTracker, l80.e dateProvider, a databaseMigrationProcessChecker, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseName, "databaseName");
        Intrinsics.checkNotNullParameter(passphrase, "passphrase");
        Intrinsics.checkNotNullParameter(encryptedSqlDatabaseWrapper, "encryptedSqlDatabaseWrapper");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(databaseMigrationAnalyticsTracker, "databaseMigrationAnalyticsTracker");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(databaseMigrationProcessChecker, "databaseMigrationProcessChecker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f16447a = context;
        this.f16448b = databaseName;
        this.f16449c = passphrase;
        this.d = encryptedSqlDatabaseWrapper;
        this.e = fileSystemRepository;
        this.f = databaseMigrationAnalyticsTracker;
        this.f16450g = dateProvider;
        this.f16451h = databaseMigrationProcessChecker;
        this.i = j.b(new bc1.b(this, 11));
        this.f16452j = new CountDownLatch(1);
        this.k = true;
        p0 p0Var = p0.f264001a;
        e0.C(coroutineScope, elm.f.f127540b, null, new bf5.a(this, null, 10), 2);
    }

    public final void a() {
        Boolean boolValueOf;
        String strP = null;
        try {
            boolValueOf = Boolean.valueOf(this.f16452j.await(1000L, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            boolValueOf = null;
        }
        String dbName = this.f16448b;
        if (boolValueOf == null) {
            strP = p.a.p("Migration status check of ", dbName, " was interrupted");
        } else if (boolValueOf.equals(Boolean.FALSE)) {
            strP = p.a.p("Failed to read migration status of ", dbName, " for 1000 ms.");
        } else if (!boolValueOf.equals(Boolean.TRUE)) {
            throw new NoWhenBranchMatchedException();
        }
        String reason = strP;
        if (reason != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "RetailDatabaseEncryptionMigrator", reason, null, null, 16);
            h31.b bVar = this.f;
            Intrinsics.checkNotNullParameter(dbName, "dbName");
            Intrinsics.checkNotNullParameter(reason, "reason");
            ((com.revolut.analytics.tracking.v3.f) bVar.f149003a).k(0L, dbName, "Warning", reason);
        }
    }

    public final String b() {
        return this.f16448b;
    }

    public final String c() {
        byte[] bytes = this.f16449c.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strG = kotlin.text.e.g(bytes);
        return p.a.p("x'", strG.length() >= 64 ? f0.U0(64, strG) : f0.U0(64, a0.C(strG, (64 / strG.length()) + 1)), "'");
    }

    public final String d() {
        a();
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "RetailDatabaseEncryptionMigrator", "getPassphrase for " + this.f16448b + ", alreadyMigrated: " + this.k, null, null, 16);
        if (!this.k && !((Boolean) this.i.getValue()).booleanValue()) {
            return this.f16449c;
        }
        return c();
    }

    public final boolean e() {
        a();
        return !this.k;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01e5 A[Catch: all -> 0x01eb, TryCatch #8 {all -> 0x01eb, blocks: (B:52:0x01af, B:54:0x01e5, B:58:0x01ed), top: B:69:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020d A[Catch: all -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0013, B:6:0x0021, B:11:0x0039, B:13:0x003d, B:16:0x0052, B:34:0x018f, B:64:0x0214, B:65:0x0217, B:60:0x020d), top: B:68:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0214 A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #5 {, blocks: (B:4:0x0013, B:6:0x0021, B:11:0x0039, B:13:0x003d, B:16:0x0052, B:34:0x018f, B:64:0x0214, B:65:0x0217, B:60:0x020d), top: B:68:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f() {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bl0.f.f():void");
    }

    public final boolean g() {
        a();
        return !this.k && ((Boolean) this.i.getValue()).booleanValue();
    }

    public final void h(SQLiteException reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        StringBuilder sb6 = new StringBuilder();
        String dbName = this.f16448b;
        sb6.append(dbName);
        sb6.append(" deleted because of ");
        sb6.append(reason);
        String reason2 = sb6.toString();
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.WARNING, "RetailDatabaseEncryptionMigrator", reason2, null, null, 16);
        h31.b bVar = this.f;
        Intrinsics.checkNotNullParameter(dbName, "dbName");
        Intrinsics.checkNotNullParameter(reason2, "reason");
        ((com.revolut.analytics.tracking.v3.f) bVar.f149003a).k(0L, dbName, "Warning", reason2);
    }
}
