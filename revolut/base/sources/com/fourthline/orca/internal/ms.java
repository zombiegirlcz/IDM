package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ms implements n9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bs f31256a;

    public ms(bs eidBundle) {
        Intrinsics.checkNotNullParameter(eidBundle, "eidBundle");
        this.f31256a = eidBundle;
    }

    @Override // com.fourthline.orca.internal.n9
    public void a(String canNumber) {
        Intrinsics.checkNotNullParameter(canNumber, "canNumber");
        this.f31256a.a(canNumber);
    }
}
