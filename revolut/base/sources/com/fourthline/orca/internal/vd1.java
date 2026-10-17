package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class vd1 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fh0 f34341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f34342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f34343c;
    private final Lazy d;

    public vd1(fh0 orcaDestroyer, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f34341a = orcaDestroyer;
        this.f34342b = imageServiceLocator;
        this.f34343c = KycError.Canceled.INSTANCE;
        this.d = yhm.j.b(new xr1(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(vd1 vd1Var) {
        return new zp0.e(vd1Var.f34342b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_exit, 0, 2, null), new kd1.f(null, 1, null), new kd1.a(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.f34343c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        fh0 fh0Var = this.f34341a;
        m.Companion companion = yhm.m.INSTANCE;
        fh0Var.a(yhm.o.a(b()));
    }
}
