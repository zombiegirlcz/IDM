package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.wv;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bw implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f27241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f27242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f27243c;
    private final Lazy d;

    public bw(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f27241a = viewNavigator;
        this.f27242b = imageServiceLocator;
        this.f27243c = re1.a.f32703a;
        this.d = yhm.j.b(new gj1(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(bw bwVar) {
        return new zp0.e(bwVar.f27242b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_offline, 0, 2, null), new kd1.k(null, 1, null), new kd1.f(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.f27243c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void b(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f27241a.b(new wv.a(KycError.Canceled.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        popupType.d().invoke();
    }
}
