package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class zo0 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f35655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq0 f35656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f35657c;

    public zo0(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f35655a = imageServiceLocator;
        this.f35656b = nm0.f31453a;
        this.f35657c = yhm.j.b(new ht1(this, 17));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f35656b;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void d() {
        super.d();
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f35657c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(zo0 zo0Var) {
        return new zp0.e(zo0Var.f35655a.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_error_dialog_poa_unsupported_filesize, 0, 2, null), new kd1.k(null, 1, null), new kd1.a(null, 1, null), false, 16, null);
    }
}
