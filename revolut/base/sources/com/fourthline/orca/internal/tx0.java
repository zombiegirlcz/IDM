package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.qes.internal.error.QesError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class tx0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f33889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f33890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f33891c;
    private final Lazy d;

    public tx0(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f33889a = viewNavigator;
        this.f33890b = imageServiceLocator;
        this.f33891c = re1.a.f32703a;
        this.d = yhm.j.b(new xr1(this, 11));
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void a(hq0.c cVar) {
        super.a(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(tx0 tx0Var) {
        return new zp0.e(tx0Var.f33890b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_offline, 0, 2, null), new kd1.k(null, 1, null), new kd1.f(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.f33891c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void b(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f33889a.b(new et0(QesError.Canceled.INSTANCE));
    }
}
