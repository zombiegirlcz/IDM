package we0;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f296605a = new a();

    private a() {
    }

    @Override // we0.d
    public final boolean a(SharedPreferences sharedPreferences) {
        ij.a prefs = (ij.a) sharedPreferences;
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return prefs.b().isEmpty();
    }
}
