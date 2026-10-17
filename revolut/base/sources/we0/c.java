package we0;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.revolut.core.data.storage.migrator.StorageMigrationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t70.x;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements xql.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f296607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f296608c;
    public final je0.b d;
    public final d e;
    public final ReentrantLock f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f296609g;

    public c(String fileName, int i, List migrationList, je0.b mapper, d emptinessChecker) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(migrationList, "migrationList");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(emptinessChecker, "emptinessChecker");
        this.f296606a = fileName;
        this.f296607b = i;
        this.f296608c = migrationList;
        this.d = mapper;
        this.e = emptinessChecker;
        this.f = new ReentrantLock();
        this.f296609g = -1;
    }

    @Override // xql.a
    public final void a(SharedPreferences prefs) {
        int i = this.f296607b;
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        ReentrantLock reentrantLock = this.f;
        reentrantLock.lock();
        try {
            try {
                if (this.f296609g == -1) {
                    int i2 = 1;
                    if (prefs.contains("file_version")) {
                        i2 = prefs.getInt("file_version", 1);
                    } else if (this.e.a(prefs)) {
                        prefs.edit().putInt("file_version", i).commit();
                        i2 = i;
                    }
                    this.f296609g = i2;
                    if (i2 == i) {
                        reentrantLock.unlock();
                        return;
                    } else {
                        Iterator it8 = this.f296608c.iterator();
                        while (it8.hasNext()) {
                            b((g) it8.next(), prefs);
                        }
                    }
                }
            } catch (Exception e) {
                od0.a aVar = od0.a.f224253a;
                if ((od0.a.e() || od0.a.i()) && (e instanceof StorageMigrationException)) {
                    new Handler(Looper.getMainLooper()).post(new x(e, 25));
                } else {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    prefs.edit().clear().putInt("file_version", i).commit();
                }
            }
            Unit unit = Unit.f186387a;
            reentrantLock.unlock();
        } catch (Throwable th10) {
            reentrantLock.unlock();
            throw th10;
        }
    }

    public final void b(g gVar, SharedPreferences sharedPreferences) throws StorageMigrationException {
        if (this.f296609g != gVar.b() || gVar.b() >= gVar.a()) {
            return;
        }
        try {
            je0.b mapper = this.d;
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            gVar.c(sharedPreferences, (je0.d) mapper);
            sharedPreferences.edit().putInt("file_version", gVar.a()).commit();
            this.f296609g = gVar.a();
        } catch (Throwable cause) {
            int iB = gVar.b();
            int iA = gVar.a();
            StringBuilder sbK = v0.a.k(iB, "StorageMigrator, can't migrate ", this.f296606a, " from ", " to ");
            sbK.append(iA);
            String message = sbK.toString();
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(cause, "cause");
            throw new StorageMigrationException(message, cause);
        }
    }
}
