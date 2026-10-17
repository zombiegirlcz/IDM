package oa1;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import ma1.k;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f223495a;

    public b(Context context, gpk.c appVersionNameProvider, k sdkInteractor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appVersionNameProvider, "appVersionNameProvider");
        Intrinsics.checkNotNullParameter(sdkInteractor, "sdkInteractor");
        String string = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        String str = (String) ((Lazy) appVersionNameProvider.f145464b).getValue();
        sdkInteractor.f203887a.getClass();
        this.f223495a = string + " " + str + ", UCube SDK 4.0.9.4";
    }
}
