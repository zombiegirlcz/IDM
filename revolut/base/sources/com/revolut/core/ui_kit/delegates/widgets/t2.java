package com.revolut.core.ui_kit.delegates.widgets;

import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t2 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrCodeImage f55513a;

    public t2(QrCodeImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f55513a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t2) && this.f55513a.equals(((t2) obj2).f55513a);
    }

    public final int hashCode() {
        return this.f55513a.hashCode();
    }
}
