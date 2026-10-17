package com.revolut.core.ui_kit.delegates;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class z implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f55658b;

    public z(String pattern, List customNotations) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(customNotations, "customNotations");
        this.f55657a = pattern;
        this.f55658b = customNotations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return Intrinsics.f(this.f55657a, zVar.f55657a) && Intrinsics.f(this.f55658b, zVar.f55658b);
    }

    public final int hashCode() {
        return this.f55658b.hashCode() + (this.f55657a.hashCode() * 31);
    }

    public z() {
        this("[90]", zhm.f0.f322471a);
    }
}
