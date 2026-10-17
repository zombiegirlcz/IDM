package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.ui0;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class f21 implements yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f28323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f28324b;

    public f21(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f28323a = imageServiceLocator;
        this.f28324b = yhm.j.b(new gj1(this, 26));
    }

    @Override // com.fourthline.orca.internal.yw
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zp0 buildStateFor(ui0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof ui0.c) {
            return a();
        }
        if (!(error instanceof ui0.d)) {
            throw new IllegalStateException("FL developer error. Unique error cases must be handled elsewhere");
        }
        return new zp0.e(this.f28323a.a(r10.D0), g21.b(((ui0.d) error).a()), new kd1.k(null, 1, null), new kd1.a(null, 1, null), true);
    }

    private final zp0 a() {
        return (zp0) this.f28324b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(f21 f21Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(f21Var.f28323a.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_camera_permission_blocked_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_settings, 0, 2, null)), new kd1.a(null, 1, null), true);
    }
}
