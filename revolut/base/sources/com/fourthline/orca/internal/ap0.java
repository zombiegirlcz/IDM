package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ap0 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f26863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq0 f26864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f26865c;

    public ap0(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f26863a = imageServiceLocator;
        this.f26864b = om0.f31693a;
        this.f26865c = yhm.j.b(new gj1(this, 4));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f26864b;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void d() {
        super.d();
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f26865c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(ap0 ap0Var) {
        return new zp0.e(ap0Var.f26863a.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_error_dialog_poa_unsupported_filetype, 0, 2, null), new kd1.k(null, 1, null), new kd1.a(null, 1, null), false, 16, null);
    }
}
