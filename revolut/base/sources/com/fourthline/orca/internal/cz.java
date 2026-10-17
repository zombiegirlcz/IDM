package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.uy;
import com.fourthline.orca.internal.wy;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class cz implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f27591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qg0 f27592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f27593c;
    private final hq0 d;
    private final Lazy e;

    public cz(fe1 viewNavigator, qg0 analytics, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f27591a = viewNavigator;
        this.f27592b = analytics;
        this.f27593c = imageServiceLocator;
        this.d = zy.f35748a;
        this.e = yhm.j.b(new gj1(this, 13));
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
        this.f27592b.track(uy.a.f.f34220b);
        this.f27591a.b(new wy.b(KycError.Canceled.INSTANCE));
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
    public static final zp0.e a(cz czVar) {
        return new zp0.e(czVar.f27593c.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_exit, 0, 2, null), new kd1.f(null, 1, null), new kd1.a(null, 1, null), false, 16, null);
    }
}
