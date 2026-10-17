package vd8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287822b;

    public c(String requestId, String juniorId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f287821a = requestId;
        this.f287822b = juniorId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f287821a, cVar.f287821a) && Intrinsics.f(this.f287822b, cVar.f287822b);
    }

    public final int hashCode() {
        return this.f287822b.hashCode() + (this.f287821a.hashCode() * 31);
    }
}
