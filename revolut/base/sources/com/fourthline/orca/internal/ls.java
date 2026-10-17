package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ls implements l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bs f30736a;

    public ls(bs eidBundle) {
        Intrinsics.checkNotNullParameter(eidBundle, "eidBundle");
        this.f30736a = eidBundle;
    }

    @Override // com.fourthline.orca.internal.l9
    public String a() {
        return this.f30736a.c();
    }
}
