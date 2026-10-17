package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.wr0;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class yr0 implements yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f35422a;

    public yr0(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f35422a = yhm.j.b(new qm1(imageServiceLocator, 4));
    }

    @Override // com.fourthline.orca.internal.yw
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zp0 buildStateFor(wr0 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof wr0.a) {
            return a();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final zp0 a() {
        return (zp0) this.f35422a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(v10 v10Var) {
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(c81.f27404a, R.string.shared_dialog_error_download_failed, 0, 2, null), new kd1.k(null, 1, null), null, true, 8, null);
    }
}
