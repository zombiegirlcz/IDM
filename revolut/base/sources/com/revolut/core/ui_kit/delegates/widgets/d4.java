package com.revolut.core.ui_kit.delegates.widgets;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d4 implements f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55331a;

    public d4(List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f55331a = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d4) && Intrinsics.f(this.f55331a, ((d4) obj2).f55331a);
    }

    public final int hashCode() {
        return this.f55331a.hashCode();
    }
}
