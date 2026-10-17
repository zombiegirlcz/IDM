package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.si;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class rm implements yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f32774a;

    public rm(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f32774a = yhm.j.b(new qm1(imageServiceLocator, 1));
    }

    @Override // com.fourthline.orca.internal.yw
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zp0 buildStateFor(si.d error) {
        Intrinsics.checkNotNullParameter(error, "error");
        return a();
    }

    private final zp0 a() {
        return (zp0) this.f32774a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(v10 v10Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_camera_permission_blocked_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new kd1.a(null, 1, null), true);
    }
}
