package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f55646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f55647b;

    public yc(Clause title, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f55646a = title;
        this.f55647b = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yc)) {
            return false;
        }
        yc ycVar = (yc) obj2;
        return this.f55646a.equals(ycVar.f55646a) && this.f55647b.equals(ycVar.f55647b);
    }

    public final int hashCode() {
        return this.f55647b.hashCode() + (this.f55646a.hashCode() * 31);
    }
}
