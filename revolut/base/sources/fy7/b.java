package fy7;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f138957a;

    public b(Date selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f138957a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f138957a, ((b) obj2).f138957a);
    }

    public final int hashCode() {
        return this.f138957a.hashCode();
    }
}
