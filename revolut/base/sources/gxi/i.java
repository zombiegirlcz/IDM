package gxi;

import kotlin.jvm.internal.Intrinsics;
import q7c.m;
import u6c.t;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7c.g f147753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f147754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f147755c;

    public i(q7c.g paymentMethodsInteractor, m quoteInteractor, t productEntryPoint) {
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(productEntryPoint, "productEntryPoint");
        this.f147753a = paymentMethodsInteractor;
        this.f147754b = quoteInteractor;
        this.f147755c = productEntryPoint;
    }
}
