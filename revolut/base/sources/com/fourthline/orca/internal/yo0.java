package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.jm0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.vo0;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yo0 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f35402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qg0 f35403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f35404c;
    private final hq0 d;
    private final Lazy e;

    public yo0(fe1 viewNavigator, qg0 analytics, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f35402a = viewNavigator;
        this.f35403b = analytics;
        this.f35404c = imageServiceLocator;
        this.d = mm0.f31223a;
        this.e = yhm.j.b(new ht1(this, 11));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f35403b.track(vo0.a.b.f34412b);
        this.f35402a.b(new jm0.a.b(KycError.Canceled.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.e.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(yo0 yo0Var) {
        return new zp0.e(yo0Var.f35404c.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_exit, 0, 2, null), new kd1.f(null, 1, null), new kd1.a(null, 1, null), false, 16, null);
    }
}
