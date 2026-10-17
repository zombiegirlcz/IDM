package gk9;

import java.time.ZonedDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ZonedDateTime f144368a;

    public s(ZonedDateTime date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f144368a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f144368a, ((s) obj2).f144368a);
    }

    public final int hashCode() {
        return this.f144368a.hashCode();
    }
}
