package sqa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ldd.b f265036a;

    public e(a idGenerator, ldd.b focusRequesterDelegate, tqa.c maskUtils) {
        Intrinsics.checkNotNullParameter(idGenerator, "idGenerator");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(maskUtils, "maskUtils");
        this.f265036a = focusRequesterDelegate;
    }
}
