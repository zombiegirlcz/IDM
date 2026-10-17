package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.le0;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class uf0 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr f34076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l70 f34077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final hq0 f34078c;
    private final Lazy d;

    public uf0(wr effectHandler, l70 lottieServiceLocator) {
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        this.f34076a = effectHandler;
        this.f34077b = lottieServiceLocator;
        this.f34078c = oe0.f31654a;
        this.d = yhm.j.b(new xr1(this, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final le0 f() {
        return le0.b.f30595a;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.f34078c;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f34076a.a(new nr1(23));
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zp0.a getState() {
        return (zp0.a) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.a a(uf0 uf0Var) {
        p70 p70VarA = uf0Var.f34077b.a(k70.f30171w);
        c81.a aVar = c81.f27404a;
        return new zp0.a(c81.a.a(aVar, R.string.shared_dialog_permission_nfc_header, 0, 2, null), p70VarA, c81.a.a(aVar, R.string.shared_dialog_permission_nfc_message, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new kd1.a(null, 1, null), false, 32, null);
    }
}
