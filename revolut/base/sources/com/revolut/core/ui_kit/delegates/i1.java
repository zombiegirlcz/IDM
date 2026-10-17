package com.revolut.core.ui_kit.delegates;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f54270a;

    public i1(ArrayList images) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.f54270a = images;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i1) && this.f54270a.equals(((i1) obj2).f54270a);
    }

    public final int hashCode() {
        return this.f54270a.hashCode();
    }
}
