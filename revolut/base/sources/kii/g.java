package kii;

import android.app.Activity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class g {
    private g() {
    }

    public static List a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return v.k(new b(activity), new f(activity), new mii.d(activity), new lii.a(activity));
    }
}
