package f7d;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f132589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qv0.i f132590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f132591c;

    public a(Instant updatedAt, qv0.i item, boolean z) {
        Intrinsics.checkNotNullParameter(updatedAt, "updatedAt");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f132589a = updatedAt;
        this.f132590b = item;
        this.f132591c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f132589a, aVar.f132589a) && Intrinsics.f(this.f132590b, aVar.f132590b) && this.f132591c == aVar.f132591c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f132591c) + ((this.f132590b.hashCode() + (this.f132589a.hashCode() * 31)) * 31);
    }
}
