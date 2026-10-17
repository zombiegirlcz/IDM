package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.fourthline.orca.qes.internal.error.QesError;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class dt0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fh0 f27913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f27914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f27915c;
    private final Lazy d;

    public dt0(fh0 orcaDestroyer, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(orcaDestroyer, "orcaDestroyer");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f27913a = orcaDestroyer;
        this.f27914b = imageServiceLocator;
        this.f27915c = QesError.Canceled.INSTANCE;
        this.d = yhm.j.b(new gj1(this, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(dt0 dt0Var) {
        return new zp0.e(dt0Var.f27914b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_exit, 0, 2, null), new kd1.f(null, 1, null), new kd1.a(null, 1, null), false, 16, null);
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
        return this.f27915c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        m.Companion companion = yhm.m.INSTANCE;
        this.f27913a.a(yhm.o.a(popupType.c()));
    }
}
