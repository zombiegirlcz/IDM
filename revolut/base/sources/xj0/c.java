package xj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bk0.e f306439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ij0.c f306440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jj0.a f306441c;

    public c(bk0.e headersProvider, x60.a accountRegionProvider, ij0.c revolutHostChecker, jj0.a defaultRequestAuthorizer) {
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        Intrinsics.checkNotNullParameter(accountRegionProvider, "accountRegionProvider");
        Intrinsics.checkNotNullParameter(revolutHostChecker, "revolutHostChecker");
        Intrinsics.checkNotNullParameter(defaultRequestAuthorizer, "defaultRequestAuthorizer");
        this.f306439a = headersProvider;
        this.f306440b = revolutHostChecker;
        this.f306441c = defaultRequestAuthorizer;
    }
}
