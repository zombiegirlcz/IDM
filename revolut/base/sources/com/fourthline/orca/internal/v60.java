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
public final class v60 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l70 f34256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w60.b f34257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f34258c;

    public v60(l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        this.f34256a = lottieServiceLocator;
        this.f34257b = w60.b.f34529a;
        this.f34258c = yhm.j.b(new xr1(this, 17));
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
    public w60.b c() {
        return this.f34257b;
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public zp0.a getState() {
        return (zp0.a) this.f34258c.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.a a(v60 v60Var) {
        p70 p70VarA = v60Var.f34256a.a(k70.f30159n);
        c81.a aVar = c81.f27404a;
        return new zp0.a(c81.a.a(aVar, R.string.shared_dialog_permission_location_header, 0, 2, null), p70VarA, c81.a.a(aVar, R.string.shared_dialog_permission_location_message, 0, 2, null), new kd1.d(null, 1, null), new kd1.a(null, 1, null), false, 32, null);
    }
}
