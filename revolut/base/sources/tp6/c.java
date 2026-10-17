package tp6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yo6.e f273292b;

    public c(String feedbackId, yo6.e ratingType) {
        Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
        Intrinsics.checkNotNullParameter(ratingType, "ratingType");
        this.f273291a = feedbackId;
        this.f273292b = ratingType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f273291a, cVar.f273291a) && this.f273292b == cVar.f273292b;
    }

    public final int hashCode() {
        return this.f273292b.hashCode() + (this.f273291a.hashCode() * 31);
    }
}
