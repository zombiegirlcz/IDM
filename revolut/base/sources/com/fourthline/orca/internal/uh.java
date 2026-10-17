package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.t2;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class uh implements yw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f34091a;

    public uh(v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f34091a = yhm.j.b(new qm1(imageServiceLocator, 2));
    }

    @Override // com.fourthline.orca.internal.yw
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public zp0 buildStateFor(t2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (error instanceof t2.a) {
            return a();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final zp0 a() {
        return (zp0) this.f34091a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.e a(v10 v10Var) {
        c81.a aVar = c81.f27404a;
        return new zp0.e(v10Var.a(r10.D0), c81.a.a(aVar, R.string.shared_dialog_error_unsupported_issuing_country_title, 0, 2, null), new kd1.j(c81.a.a(aVar, R.string.shared_button_change_issuing_country, 0, 2, null)), new kd1.f(null, 1, null), true);
    }
}
