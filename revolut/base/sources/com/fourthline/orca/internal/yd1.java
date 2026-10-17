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
public final class yd1 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o80 f35270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xq0 f35271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f35272c;
    private final kh0 d;
    private final Lazy e;

    public yd1(o80 navigationChannel, xq0 errorProvider, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(navigationChannel, "navigationChannel");
        Intrinsics.checkNotNullParameter(errorProvider, "errorProvider");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f35270a = navigationChannel;
        this.f35271b = errorProvider;
        this.f35272c = imageServiceLocator;
        this.d = re1.a.f32703a;
        this.e = yhm.j.b(new ht1(this, 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(yd1 yd1Var) {
        return new zp0.e(yd1Var.f35272c.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_offline, 0, 2, null), new kd1.k(null, 1, null), new kd1.f(null, 1, null), false, 16, null);
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
        this.f35270a.mo3647trySendJP2dKIU(new q80.l(this.f35271b.a()));
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        popupType.d().invoke();
    }
}
