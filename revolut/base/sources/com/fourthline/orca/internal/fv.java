package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.nfc.NfcScannerComposableKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fv implements ev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bs f28668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f28669b;

    public fv(bs bundle, Context context) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28668a = bundle;
        this.f28669b = context;
    }

    @Override // com.fourthline.orca.internal.ev
    public void a(as value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f28668a.a(value);
    }

    @Override // com.fourthline.orca.internal.ev
    public void b(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f28668a.d(url2);
    }

    @Override // com.fourthline.orca.internal.ev
    public boolean c() {
        return NfcScannerComposableKt.isNfcEnabled(this.f28669b);
    }

    @Override // com.fourthline.orca.internal.ev
    public as d() {
        return this.f28668a.b();
    }

    @Override // com.fourthline.orca.internal.ev
    public String e() {
        return cs.b(this.f28668a);
    }

    @Override // com.fourthline.orca.internal.ev
    public void a(String pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f28668a.b(pin);
    }
}
