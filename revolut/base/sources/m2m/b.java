package m2m;

import android.content.Context;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lim.o;
import u1m.f0;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f202243a;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f202243a = context;
    }

    public final File a() {
        String str = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss-SSS", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        File file = new File(this.f202243a.getFilesDir(), "tmp-coreekyc");
        file.mkdirs();
        return new File(file, str + ".jpg");
    }

    public final void b() {
        synchronized (this) {
            try {
                File file = new File(this.f202243a.getFilesDir(), "tmp-coreekyc");
                try {
                    if (file.exists() && file.isDirectory()) {
                        String message = "temporary directory deletion: ".concat(o.m(file) ? "success" : "failure");
                        Intrinsics.checkNotNullParameter(message, "message");
                        f0 f0Var = f0.VERBOSE;
                    }
                } catch (SecurityException unused) {
                    Intrinsics.checkNotNullParameter("failed to delete tmp file.", "message");
                    f0 f0Var2 = f0.VERBOSE;
                }
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
