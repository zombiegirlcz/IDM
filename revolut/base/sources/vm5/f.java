package vm5;

import aii.r;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f290537a;

    public f(Date dateOfBirth) {
        Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
        this.f290537a = dateOfBirth;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f290537a, ((f) obj2).f290537a);
    }

    public final int hashCode() {
        return this.f290537a.hashCode();
    }
}
