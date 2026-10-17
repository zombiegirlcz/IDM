package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.qes.internal.error.QesError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class zv0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f35731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f35732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final QesError.QtspInvalidSession f35733c;
    private final Lazy d;

    public zv0(v10 imageServiceLocator, Function1 finishWithError) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(finishWithError, "finishWithError");
        this.f35731a = imageServiceLocator;
        this.f35732b = finishWithError;
        this.f35733c = new QesError.QtspInvalidSession(null, null, 3, null);
        this.d = yhm.j.b(new ht1(this, 19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(zv0 zv0Var) {
        return new zp0.e(zv0Var.f35731a.a(r10.E0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_qtsp_multi_session, 0, 2, null), new kd1.f(null, 1, null), null, false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public QesError.QtspInvalidSession b() {
        return this.f35733c;
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f35732b.invoke(popupType.c());
    }
}
