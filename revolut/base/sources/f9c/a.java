package f9c;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f80.a f132912a;

    public a(f80.a uriHelper) {
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f132912a = uriHelper;
    }

    public final Intent a(String redirectUrl, String packageName) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intent intent = new Intent("android.intent.action.VIEW", ((f80.b) this.f132912a).f(redirectUrl));
        intent.setPackage(packageName);
        return intent;
    }
}
