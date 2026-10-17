package x71;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.ReadableDateTime;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReadableDateTime f303137a;

    public c(ReadableDateTime readableDateTime) {
        this.f303137a = readableDateTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f303137a, ((c) obj2).f303137a);
    }

    public final int hashCode() {
        ReadableDateTime readableDateTime = this.f303137a;
        if (readableDateTime == null) {
            return 0;
        }
        return readableDateTime.hashCode();
    }
}
