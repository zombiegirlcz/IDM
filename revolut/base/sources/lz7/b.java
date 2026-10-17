package lz7;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f200944a;

    public b(Date selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f200944a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f200944a, ((b) obj2).f200944a);
    }

    public final int hashCode() {
        return this.f200944a.hashCode();
    }
}
