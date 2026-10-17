package lz7;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f200945a;

    public c(Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.f200945a = date;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f200945a, ((c) obj2).f200945a);
    }

    public final int hashCode() {
        return this.f200945a.hashCode();
    }
}
