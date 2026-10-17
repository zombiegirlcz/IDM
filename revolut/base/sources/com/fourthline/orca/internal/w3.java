package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class w3 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fe1 f34497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v10 f34498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f34499c;
    private final kh0 d;
    private final Lazy e;

    public w3(fe1 viewNavigator, v10 imageServiceLocator, boolean z) {
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f34497a = viewNavigator;
        this.f34498b = imageServiceLocator;
        this.f34499c = z;
        this.d = BavError.Generic.INSTANCE;
        this.e = yhm.j.b(new xr1(this, 23));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(w3 w3Var) {
        return new zp0.e(w3Var.f34498b.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_bav_required_title, 0, 2, null), new kd1.k(null, 1, null), new kd1.f(null, 1, null), false, 16, null);
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.e.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public kh0 b() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void b(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        this.f34497a.b(new j6(BavError.Canceled.INSTANCE));
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public void a(hq0.c popupType) {
        Intrinsics.checkNotNullParameter(popupType, "popupType");
        if (this.f34499c) {
            this.f34497a.b(l6.f30526a);
        } else {
            popupType.d().invoke();
        }
    }
}
