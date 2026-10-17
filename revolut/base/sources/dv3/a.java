package dv3;

import cv3.s;
import cv3.u;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f118023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f118024b;

    public a(u offerParameters, s offerContent) {
        Intrinsics.checkNotNullParameter(offerParameters, "offerParameters");
        Intrinsics.checkNotNullParameter(offerContent, "offerContent");
        this.f118023a = offerParameters;
        this.f118024b = offerContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f118023a, aVar.f118023a) && Intrinsics.f(this.f118024b, aVar.f118024b);
    }

    public final int hashCode() {
        return this.f118024b.hashCode() + (this.f118023a.f109270a.hashCode() * 31);
    }
}
