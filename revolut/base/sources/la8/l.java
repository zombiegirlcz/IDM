package la8;

import kotlin.jvm.internal.Intrinsics;
import rfm.n;
import sri.m;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements rjg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f193356b;

    public l(String phone, m navigator) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f193355a = phone;
        this.f193356b = navigator;
    }

    @Override // rjg.a
    public final efm.k a(tjg.e method, Throwable throwable) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (k.f193354a[method.ordinal()] == 1) {
            return new n(new j(this, method, 0));
        }
        return null;
    }
}
