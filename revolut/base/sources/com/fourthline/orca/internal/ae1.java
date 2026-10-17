package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.q80;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ae1 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f26773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xq0 f26774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f26775c;
    private final kh0 d;
    private final Lazy e;

    public ae1(o80 navigationChannel, xq0 errorProvider, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(errorProvider, "errorProvider");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f26773a = navigationChannel;
        this.f26774b = errorProvider;
        this.f26775c = imageServiceLocator;
        this.d = re1.c.f32706a;
        this.e = yhm.j.b(new gj1(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(ae1 ae1Var) {
        return new zp0.e(ae1Var.f26775c.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new kd1.k(null, 1, null), new kd1.f(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.e.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void b(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f26773a.mo3647trySendJP2dKIU(new q80.l(this.f26774b.a()));
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        popupType.d().invoke();
    }
}
