package x80;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f303255a;

    public a(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f303255a = appContext;
    }

    public final String a() {
        String packageName = this.f303255a.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }
}
