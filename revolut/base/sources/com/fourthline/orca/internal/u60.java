package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.w60;
import com.fourthline.orca.internal.y60;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class u60 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr f33966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f33967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w60.c f33968c;
    private final Lazy d;

    public u60(wr effectHandler, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f33966a = effectHandler;
        this.f33967b = imageServiceLocator;
        this.f33968c = w60.c.f34531a;
        this.d = yhm.j.b(new xr1(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y60 g() {
        return y60.c.f35176a;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f33966a.a(new nr1(20));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public w60.c c() {
        return this.f33968c;
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(u60 u60Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(u60Var.f33967b.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_location_permission_blocked_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new kd1.a(null, 1, null), false, 16, null);
    }
}
