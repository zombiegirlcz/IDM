package wy3;

import cv3.s;
import cv3.u;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f301077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f301078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f301079c;

    public j(u offerParameters, s initialScreen, Map additionalScreens) {
        Intrinsics.checkNotNullParameter(offerParameters, "offerParameters");
        Intrinsics.checkNotNullParameter(initialScreen, "initialScreen");
        Intrinsics.checkNotNullParameter(additionalScreens, "additionalScreens");
        this.f301077a = offerParameters;
        this.f301078b = initialScreen;
        this.f301079c = additionalScreens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f301077a.equals(jVar.f301077a) && this.f301078b.equals(jVar.f301078b) && this.f301079c.equals(jVar.f301079c);
    }

    public final int hashCode() {
        return this.f301079c.hashCode() + ((this.f301078b.hashCode() + (this.f301077a.f109270a.hashCode() * 31)) * 31);
    }
}
