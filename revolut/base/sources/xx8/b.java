package xx8;

import aii.u;
import android.content.Intent;
import android.net.Uri;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yp.b f309407a;

    public b(yp.b appStoreNavigationFactory) {
        Intrinsics.checkNotNullParameter(appStoreNavigationFactory, "appStoreNavigationFactory");
        this.f309407a = appStoreNavigationFactory;
    }

    @Override // xx8.a
    public final u a(String packageId) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        return this.f309407a.b(new ui0.b(packageId, null));
    }

    @Override // xx8.a
    public final u b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        return new ExternalDestination.ByIntent(new Intent("android.intent.action.VIEW", Uri.parse(url2)), null);
    }
}
