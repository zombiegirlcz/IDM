package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class y3 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f35149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f35150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f35151c;
    private final Lazy d;

    public y3(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f35149a = viewNavigator;
        this.f35150b = imageServiceLocator;
        this.f35151c = BavError.KycRequired.INSTANCE;
        this.d = yhm.j.b(new ht1(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(y3 y3Var) {
        return new zp0.e(y3Var.f35150b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new kd1.f(null, 1, null), null, false, 24, null);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.f35151c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f35149a.b(new j6(BavError.KycRequired.INSTANCE));
    }
}
