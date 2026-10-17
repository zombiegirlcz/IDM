package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e50 implements f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yj0 f27998a;

    public e50(yj0 personBundle) {
        Intrinsics.checkNotNullParameter(personBundle, "personBundle");
        this.f27998a = personBundle;
    }

    @Override // com.fourthline.orca.internal.f8
    public String a() {
        return this.f27998a.q();
    }
}
