package ny0;

import android.content.res.Configuration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f220590a = new b();

    private b() {
    }

    @Override // ny0.c
    public final boolean a(Configuration oldConfig, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(oldConfig, "oldConfig");
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        return (oldConfig.orientation == newConfig.orientation && oldConfig.screenLayout == newConfig.screenLayout && oldConfig.screenHeightDp == newConfig.screenHeightDp && oldConfig.screenWidthDp == newConfig.screenWidthDp && oldConfig.smallestScreenWidthDp == newConfig.smallestScreenWidthDp) ? false : true;
    }
}
