package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.t30;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p30 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function1 f31816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f31817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f31818c;
    private final Lazy d;

    public p30(Function1 onPrimaryClicked, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(onPrimaryClicked, "onPrimaryClicked");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f31816a = onPrimaryClicked;
        this.f31817b = imageServiceLocator;
        this.f31818c = t30.a.f33188a;
        this.d = yhm.j.b(new ko1(this, 22));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(p30 p30Var) {
        return new zp0.e(p30Var.f31817b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_exit, 0, 2, null), new kd1.f(null, 1, null), new kd1.a(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public zp0.e getState() {
        return (zp0.e) this.d.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.f31818c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f31816a.invoke(popupType);
    }
}
