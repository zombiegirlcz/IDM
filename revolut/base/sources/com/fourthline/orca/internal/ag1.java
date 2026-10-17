package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ag1 implements zf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26793b;

    public ag1(gf1 bundle, String languageCode) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        this.f26792a = languageCode;
        this.f26793b = bundle.c();
    }

    @Override // com.fourthline.orca.internal.zf1
    public String a() {
        return this.f26793b;
    }

    @Override // com.fourthline.orca.internal.zf1
    public String b() {
        return this.f26792a;
    }
}
