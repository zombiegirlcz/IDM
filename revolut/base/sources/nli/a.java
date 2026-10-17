package nli;

import android.app.Activity;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t80.e;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t80.c f217138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Activity f217139b;

    public a(t80.c configuration, Activity activity) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f217138a = configuration;
        this.f217139b = activity;
    }

    public final File a(String str) {
        File filesDir;
        t80.e eVar = this.f217138a.f268761a;
        if (eVar instanceof t80.d) {
            filesDir = ((t80.d) eVar).f268763a;
        } else {
            if (!(eVar instanceof e.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str2 = ((e.a) eVar).f268764a;
            Activity activity = this.f217139b;
            filesDir = str2 == null ? activity.getFilesDir() : new File(activity.getFilesDir(), str2);
        }
        if (str != null) {
            filesDir = new File(filesDir, str);
        }
        if (!filesDir.exists()) {
            filesDir.mkdirs();
        }
        return filesDir;
    }
}
