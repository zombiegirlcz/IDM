package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bm;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.kyc.internal.error.KycError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class el0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f28178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f28179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f28180c;
    private final Lazy d;

    public el0(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f28178a = viewNavigator;
        this.f28179b = imageServiceLocator;
        this.f28180c = gm.f28932a;
        this.d = yhm.j.b(new gj1(this, 23));
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
    public static final zp0.e a(el0 el0Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(el0Var.f28179b.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_different_nationality, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_change_nationality, 0, 2, null)), new kd1.f(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.f28180c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void b(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f28178a.b(new bm.c.b(KycError.NationalityNotSupported.INSTANCE));
    }
}
