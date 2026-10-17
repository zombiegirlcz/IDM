package tl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f271991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f271992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f271993c;

    public l(String documentId, String documentVideoId, boolean z) {
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        Intrinsics.checkNotNullParameter(documentVideoId, "documentVideoId");
        this.f271991a = documentId;
        this.f271992b = documentVideoId;
        this.f271993c = z;
    }

    @Override // tl.m
    public final String a() {
        return this.f271991a;
    }

    @Override // tl.m
    public final boolean b() {
        return this.f271993c;
    }

    @Override // tl.m
    public final String c() {
        return this.f271992b;
    }
}
