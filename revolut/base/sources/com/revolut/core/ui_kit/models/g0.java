package com.revolut.core.ui_kit.models;

import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrCodeImage f58085a;

    public g0(QrCodeImage qrCodeImage) {
        Intrinsics.checkNotNullParameter(qrCodeImage, "qrCodeImage");
        this.f58085a = qrCodeImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && Intrinsics.f(this.f58085a, ((g0) obj2).f58085a);
    }

    public final int hashCode() {
        return this.f58085a.hashCode();
    }
}
