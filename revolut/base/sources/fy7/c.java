package fy7;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f138958a;

    public c(Date selected) {
        Intrinsics.checkNotNullParameter(selected, "selected");
        this.f138958a = selected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f138958a, ((c) obj2).f138958a);
    }

    public final int hashCode() {
        return this.f138958a.hashCode();
    }
}
