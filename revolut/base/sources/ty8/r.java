package ty8;

import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f275529a;

    public r(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f275529a = model;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        ((p) this.f275529a).getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.getResources().length == 1 && Intrinsics.f(request.getResources()[0], "android.webkit.resource.VIDEO_CAPTURE")) {
            request.grant(request.getResources());
        } else {
            request.deny();
        }
    }
}
