package com.revolut.core.ui_kit.delegates.widgets;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t1 implements v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f55512a;

    public t1(List images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f55512a = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t1) && Intrinsics.f(this.f55512a, ((t1) obj2).f55512a);
    }

    public final int hashCode() {
        return this.f55512a.hashCode();
    }
}
