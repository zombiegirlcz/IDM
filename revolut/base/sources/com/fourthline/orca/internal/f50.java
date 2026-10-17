package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.cf1;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f50 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f28339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f28340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f28341c;
    private final Lazy d;

    public f50(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f28339a = viewNavigator;
        this.f28340b = imageServiceLocator;
        this.f28341c = new cf1.f("not_set");
        this.d = yhm.j.b(new gj1(this, 28));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(f50 f50Var) {
        return new zp0.e(f50Var.f28340b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_not_verified, 0, 2, null), new kd1.f(null, 1, null), null, false, 24, null);
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
        return this.f28341c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f28339a.b(new uf1(popupType.c()));
    }
}
