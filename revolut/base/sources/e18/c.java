package e18;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f121911b;

    public c(String feedId, b type) {
        Intrinsics.checkNotNullParameter(feedId, "feedId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f121910a = feedId;
        this.f121911b = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f121910a, cVar.f121910a) && this.f121911b == cVar.f121911b;
    }

    public final int hashCode() {
        return this.f121911b.hashCode() + (this.f121910a.hashCode() * 31);
    }
}
