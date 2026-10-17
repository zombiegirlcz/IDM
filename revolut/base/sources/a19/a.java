package a19;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.a f562a;

    public a(z70.a contextProvider, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                this.f562a = contextProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
                this.f562a = contextProvider;
                break;
        }
    }

    public boolean a(kad.e app) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intent intent = new Intent(app.f182464b);
        intent.setPackage(app.f182463a);
        intent.setType("image/png");
        Intrinsics.checkNotNullExpressionValue(this.f562a.getContext().getPackageManager().queryIntentActivities(intent, 65536), "queryIntentActivities(...)");
        return !r3.isEmpty();
    }
}
