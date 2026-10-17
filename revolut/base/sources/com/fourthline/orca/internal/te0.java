package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.DocumentType;
import com.fourthline.nfc.NfcScannerComposableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class te0 implements se0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj f33754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f33755c;

    public te0(Context context, gj bundle, boolean z, gd0 gd0Var) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        this.f33753a = context;
        this.f33754b = bundle;
        this.f33755c = z;
        if (bundle.e() == null) {
            bundle.a(gd0Var);
        }
    }

    @Override // com.fourthline.orca.internal.se0
    public fd a() {
        return this.f33754b.g();
    }

    @Override // com.fourthline.orca.internal.se0
    public DocumentType b() {
        return ij.b(this.f33754b).c();
    }

    @Override // com.fourthline.orca.internal.se0
    public boolean c() {
        return NfcScannerComposableKt.isNfcEnabled(this.f33753a);
    }

    @Override // com.fourthline.orca.internal.se0
    public gd0 d() {
        return this.f33754b.e();
    }

    @Override // com.fourthline.orca.internal.se0
    public void e() {
        this.f33754b.a((ad0) null);
    }

    @Override // com.fourthline.orca.internal.se0
    public boolean f() {
        return this.f33755c;
    }
}
