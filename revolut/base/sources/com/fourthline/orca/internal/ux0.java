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
public final class ux0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f34211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f34212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f34213c;
    private final Lazy d;

    public ux0(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f34211a = viewNavigator;
        this.f34212b = imageServiceLocator;
        this.f34213c = new re1.b("not_set");
        this.d = yhm.j.b(new xr1(this, 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(ux0 ux0Var) {
        return new zp0.e(ux0Var.f34212b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new kd1.f(null, 1, null), null, false, 24, null);
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
        return this.f34213c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        String message;
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        QesError.Unexpected.Companion companion = QesError.Unexpected.INSTANCE;
        kh0 kh0VarC = popupType.c();
        re1.b bVar = kh0VarC instanceof re1.b ? (re1.b) kh0VarC : null;
        if (bVar == null || (message = bVar.getMessage()) == null) {
            message = "An unrecoverable error occurred.";
        }
        this.f34211a.b(new et0(QesError.Unexpected.Companion.create$default(companion, message, null, 2, null)));
    }
}
