package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.cv;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class qu implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f32540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f32541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kh0 f32542c;
    private final Lazy d;

    public qu(fe1 viewNavigator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f32540a = viewNavigator;
        this.f32541b = imageServiceLocator;
        this.f32542c = re1.c.f32706a;
        this.d = yhm.j.b(new ko1(this, 27));
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void a(hq0.c cVar) {
        super.a(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(qu quVar) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(quVar.f32541b.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_generic_error_title, 0, 2, null), new kd1.k(null, 1, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_choose_another_verification_type, 0, 2, null)), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.f32542c;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void b(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f32540a.b(cv.c.f27559a);
    }
}
