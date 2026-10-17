package avi;

import cli.j;
import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f10041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f10042b;

    public c(LocalDate localDate, Set set) {
        this.f10041a = localDate;
        this.f10042b = set;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f10041a, cVar.f10041a) && Intrinsics.f(this.f10042b, cVar.f10042b);
    }

    public final int hashCode() {
        LocalDate localDate = this.f10041a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Set set = this.f10042b;
        return iHashCode + (set != null ? set.hashCode() : 0);
    }
}
