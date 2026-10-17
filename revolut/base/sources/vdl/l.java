package vdl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287994c;

    public l(String ref2, String from, String to6) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f287992a = ref2;
        this.f287993b = from;
        this.f287994c = to6;
    }

    public final String a() {
        return v0.a.i(v0.a.m("RecommendationParams(ref=", this.f287992a, ", from=", this.f287993b, ", to="), this.f287994c, ")");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f287992a, lVar.f287992a) && Intrinsics.f(this.f287993b, lVar.f287993b) && Intrinsics.f(this.f287994c, lVar.f287994c);
    }

    public final int hashCode() {
        return this.f287994c.hashCode() + p.a.c(this.f287992a.hashCode() * 31, 31, this.f287993b);
    }
}
