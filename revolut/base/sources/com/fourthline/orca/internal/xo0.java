package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xo0 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f35062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final hq0 f35063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f35064c;

    public xo0(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f35062a = imageServiceLocator;
        this.f35063b = lm0.f30678a;
        this.f35064c = yhm.j.b(new ht1(this, 5));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f35063b;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void d() {
        super.d();
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.f35064c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.f a(xo0 xo0Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.f(zhm.v.k(new Pair(c81.a.a(aVar, R.string.step_poa_type_sheet_upload_photo, 0, 2, null), xo0Var.f35062a.a(r10.R0)), new Pair(c81.a.a(aVar, R.string.step_poa_type_sheet_take_photo, 0, 2, null), xo0Var.f35062a.a(r10.S0))), c81.a.a(aVar, R.string.shared_dialog_error_exit, 0, 2, null), new kd1.f(null, 1, null), new kd1.a(null, 1, null), false, 16, null);
    }
}
