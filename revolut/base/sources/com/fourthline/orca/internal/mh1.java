package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.cf1;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class mh1 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f31190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f31191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f31192c;
    private final Lazy d;

    public mh1(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f31190a = viewNavigator;
        this.f31191b = imageServiceLocator;
        this.f31192c = new re1.b("");
        this.d = yhm.j.b(new ko1(this, 15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(mh1 mh1Var) {
        return new zp0.e(mh1Var.f31191b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_unrecoverable_title, 0, 2, null), new kd1.f(null, 1, null), null, false, 24, null);
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
        return this.f31192c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        fe1 fe1Var = this.f31190a;
        cf1.h.a aVar = cf1.h.f;
        String message = popupType.c().getMessage();
        if (message == null) {
            message = "FL Developer error. Throwable message was not provided";
        }
        fe1Var.b(new uf1(cf1.h.a.a(aVar, message, null, 2, null)));
    }
}
