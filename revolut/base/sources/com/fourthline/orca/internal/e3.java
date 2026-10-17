package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.g3;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e3 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f27980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f27981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f27982c;
    private final kh0 d;
    private final Lazy e;

    public e3(fe1 viewNavigator, v10 imageServiceLocator, boolean z) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f27980a = viewNavigator;
        this.f27981b = imageServiceLocator;
        this.f27982c = z;
        this.d = g3.a.f28736a;
        this.e = yhm.j.b(new gj1(this, 20));
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void a(hq0.c cVar) {
        super.a(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(e3 e3Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(e3Var.f27981b.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_account_name_not_matching_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_edit_iban, 0, 2, null)), e3Var.f27982c ? new kd1.j(c81.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)) : new kd1.f(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void b(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        if (this.f27982c) {
            this.f27980a.b(l3.f30510a);
        } else {
            this.f27980a.b(new m3(popupType.c()));
        }
    }
}
