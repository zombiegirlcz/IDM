package vw;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f292589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f292590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f292591c;

    public h(double d, Double d5, ArrayList samples) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        this.f292589a = d;
        this.f292590b = d5;
        this.f292591c = samples;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Double.compare(this.f292589a, hVar.f292589a) == 0 && Intrinsics.f(this.f292590b, hVar.f292590b) && this.f292591c.equals(hVar.f292591c);
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f292589a) * 31;
        Double d = this.f292590b;
        return this.f292591c.hashCode() + ((iHashCode + (d == null ? 0 : d.hashCode())) * 31);
    }
}
