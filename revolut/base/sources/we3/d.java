package we3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f296619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f296620b;

    public d(double d, ArrayList boosts) {
        Intrinsics.checkNotNullParameter(boosts, "boosts");
        this.f296619a = boosts;
        this.f296620b = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f296619a.equals(dVar.f296619a) && Double.compare(this.f296620b, dVar.f296620b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f296620b) + (this.f296619a.hashCode() * 31);
    }
}
