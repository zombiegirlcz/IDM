package fe4;

import aii.r;
import cv3.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f134438a;

    public f(u offerParameters) {
        Intrinsics.checkNotNullParameter(offerParameters, "offerParameters");
        this.f134438a = offerParameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f134438a, ((f) obj2).f134438a);
    }

    public final int hashCode() {
        return this.f134438a.f109270a.hashCode();
    }
}
