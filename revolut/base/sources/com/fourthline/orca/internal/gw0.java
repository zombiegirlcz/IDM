package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.ui0;
import com.fourthline.orca.internal.z11;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.qes.internal.error.QesError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gw0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f29037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ui0.b f29038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f29039c;

    public gw0(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f29037a = viewNavigator;
        this.f29038b = ui0.b.f34103a;
        this.f29039c = yhm.j.b(new qm1(imageServiceLocator, 0));
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void a(hq0.c cVar) {
        super.a(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ui0.b b() {
        return this.f29038b;
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.f29039c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(v10 v10Var) {
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_insufficient_face_similarities, 0, 2, null), new kd1.k(null, 1, null), new kd1.f(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void b(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f29037a.b(new z11.a.b(QesError.Canceled.INSTANCE));
    }
}
