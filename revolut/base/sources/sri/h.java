package sri;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    private h() {
    }

    public static boolean a(AppCompatActivity appCompatActivity, w70.a androidVersion) {
        Intrinsics.checkNotNullParameter(appCompatActivity, "<this>");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        return androidVersion.a(34) || appCompatActivity.hasWindowFocus();
    }

    public h(int i) {
    }
}
