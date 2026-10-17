package ttl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f274460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f274461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f274462c;

    public o(String securityRef, n expiryDateTypeWrapper, List calendarExcludeDates) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(expiryDateTypeWrapper, "expiryDateTypeWrapper");
        Intrinsics.checkNotNullParameter(calendarExcludeDates, "calendarExcludeDates");
        this.f274460a = securityRef;
        this.f274461b = expiryDateTypeWrapper;
        this.f274462c = calendarExcludeDates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f274460a, oVar.f274460a) && Intrinsics.f(this.f274461b, oVar.f274461b) && Intrinsics.f(this.f274462c, oVar.f274462c);
    }

    public final int hashCode() {
        return this.f274462c.hashCode() + ((this.f274461b.hashCode() + (this.f274460a.hashCode() * 31)) * 31);
    }
}
