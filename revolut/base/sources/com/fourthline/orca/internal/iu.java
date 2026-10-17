package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class iu implements hu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bs f29709a;

    public iu(bs eidBundle) {
        Intrinsics.checkNotNullParameter(eidBundle, "eidBundle");
        this.f29709a = eidBundle;
    }

    @Override // com.fourthline.orca.internal.hu
    public void a(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f29709a.c(pin);
    }

    @Override // com.fourthline.orca.internal.hu
    public String b() {
        return this.f29709a.e();
    }

    @Override // com.fourthline.orca.internal.hu
    public String a() {
        return this.f29709a.f();
    }
}
