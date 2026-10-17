package we0;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f296610a = new f();

    private f() {
    }

    @Override // we0.d
    public final boolean a(SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return prefs.getAll().isEmpty();
    }
}
