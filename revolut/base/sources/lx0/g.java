package lx0;

import android.content.Context;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.cache.SimpleCache;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f200511a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f200512b = TimeUnit.DAYS.toMillis(7);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SimpleCache f200513c;

    private g() {
    }

    public final synchronized f a(Context context) {
        try {
            Intrinsics.checkNotNullParameter(context, "context");
            if (f200513c == null) {
                f200513c = new SimpleCache(new File(context.getCacheDir(), "video"), new e(52428800L, f200512b), new StandaloneDatabaseProvider(context));
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return new f();
    }
}
