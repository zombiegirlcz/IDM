package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ov0 implements nv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lr0 f31773a;

    public ov0(lr0 bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f31773a = bundle;
    }

    @Override // com.fourthline.orca.internal.nv0
    public String a() {
        String strA = this.f31773a.a();
        if (strA != null) {
            return strA;
        }
        throw new IllegalStateException("PDF path must be present at this moment!");
    }

    @Override // com.fourthline.orca.internal.nv0
    public String b() {
        String strB = this.f31773a.b();
        if (strB != null) {
            return strB;
        }
        throw new IllegalStateException("PDF title must be present at this moment!");
    }
}
