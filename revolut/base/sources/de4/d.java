package de4;

import aii.r;
import cv3.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f113287a;

    public d(u offerParameters) {
        Intrinsics.checkNotNullParameter(offerParameters, "offerParameters");
        this.f113287a = offerParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f113287a, ((d) obj2).f113287a);
    }

    public final int hashCode() {
        return this.f113287a.f109270a.hashCode();
    }
}
