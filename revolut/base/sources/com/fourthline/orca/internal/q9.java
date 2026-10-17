package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class q9 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f32354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f32355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hq0 f32356c;
    private final Lazy d;

    public q9(c81 exitResource, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(exitResource, "exitResource");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f32354a = exitResource;
        this.f32355b = imageServiceLocator;
        this.f32356c = hq0.b.f29374a;
        this.d = yhm.j.b(new ko1(this, 26));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f32356c;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void d() {
        super.d();
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(q9 q9Var) {
        return new zp0.e(q9Var.f32355b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_exit, 0, 2, null), new kd1.f(q9Var.f32354a), new kd1.a(null, 1, null), false, 16, null);
    }

    public /* synthetic */ q9(c81 c81Var, v10 v10Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? c81.a.a(c81.f27404a, R.string.shared_button_exit_idv, 0, 2, null) : c81Var, v10Var);
    }
}
