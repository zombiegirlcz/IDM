package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class nr0 implements mr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lr0 f31469a;

    public nr0(lr0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f31469a = bundle;
    }

    @Override // com.fourthline.orca.internal.mr0
    public void a(String title, String path) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(path, "path");
        this.f31469a.b(title);
        this.f31469a.a(path);
    }
}
