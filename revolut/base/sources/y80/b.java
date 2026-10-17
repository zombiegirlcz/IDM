package y80;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import androidx.core.app.ActivityCompat;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f311614b = ViewConfiguration.getDoubleTapTimeout();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f311615a;

    public static final class a {
        private a() {
        }
    }

    public final c a(Activity activity, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        boolean z = SystemClock.elapsedRealtime() - this.f311615a > 600;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = permissions.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = permissions[i];
            int i3 = i2 + 1;
            SharedPreferences sharedPreferences = activity.getSharedPreferences("permissions_requesting", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str, true);
            editorEdit.apply();
            Integer numV = kotlin.collections.d.V(i2, grantResults);
            linkedHashMap.put(str, (numV != null && numV.intValue() == 0) ? d.GRANTED : ActivityCompat.shouldShowRequestPermissionRationale(activity, str) ? d.DENIED : d.DENIED_PERMANENTLY);
            i++;
            i2 = i3;
        }
        return new c(linkedHashMap, z);
    }

    public final void b(Activity activity, String[] permissions, int i) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        cli.b bVar = new cli.b(activity, permissions, i, 5);
        if (SystemClock.elapsedRealtime() - this.f311615a > f311614b) {
            this.f311615a = SystemClock.elapsedRealtime();
            bVar.invoke();
        }
    }
}
