package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.w60;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class kq0 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l70 f30360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w60.e f30361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f30362c;

    public kq0(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        this.f30360a = lottieServiceLocator;
        this.f30361b = w60.e.f34535a;
        this.f30362c = yhm.j.b(new ko1(this, 8));
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
    public w60.e c() {
        return this.f30361b;
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zp0.a getState() {
        return (zp0.a) this.f30362c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.a a(kq0 kq0Var) {
        p70 p70VarA = kq0Var.f30360a.a(k70.o);
        c81.a aVar = c81.f27404a;
        return new zp0.a(c81.a.a(aVar, R.string.shared_dialog_permission_precise_location_header, 0, 2, null), p70VarA, c81.a.a(aVar, R.string.shared_dialog_permission_precise_location_message, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_dialog_permission_shared_button_precise_location, 0, 2, null)), new kd1.p(c81.a.a(aVar, R.string.shared_button_continue_anyway, 0, 2, null)), false, 32, null);
    }
}
