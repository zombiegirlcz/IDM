package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i9 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l70 f29527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq0.a f29528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f29529c;

    public i9(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        this.f29527a = lottieServiceLocator;
        this.f29528b = hq0.a.f29371a;
        this.f29529c = yhm.j.b(new ul1(this, 23));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void d() {
        super.d();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public hq0.a c() {
        return this.f29528b;
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f29529c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.a a(i9 i9Var) {
        p70 p70VarA = i9Var.f29527a.a(k70.f30155j);
        c81.a aVar = c81.f27404a;
        return new zp0.a(c81.a.a(aVar, R.string.shared_dialog_permission_camera_header, 0, 2, null), p70VarA, c81.a.a(aVar, R.string.shared_dialog_permission_camera_message, 0, 2, null), new kd1.d(null, 1, null), new kd1.a(null, 1, null), false, 32, null);
    }
}
