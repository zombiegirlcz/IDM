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
public final class g70 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final wr f28776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f28777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w60.d f28778c;
    private final Lazy d;

    public g70(wr effectHandler, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f28776a = effectHandler;
        this.f28777b = imageServiceLocator;
        this.f28778c = w60.d.f34533a;
        this.d = yhm.j.b(new ul1(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y60 g() {
        return y60.b.f35175a;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public void d() {
        this.f28776a.a(new dl1(15));
    }

    @Override // com.fourthline.orca.internal.gq0.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public w60.d c() {
        return this.f28778c;
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
    /* JADX WARN: Multi-variable type inference failed */
    public static final zp0.e a(g70 g70Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(g70Var.f28777b.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_location_services_off_title_android, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new kd1.a(null, 1, 0 == true ? 1 : 0), false, 16, null);
    }
}
