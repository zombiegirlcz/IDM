package myf;

import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f210467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f210468c;

    public c(String experienceId, DateTime dateTime, DateTime dateTime2) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        this.f210466a = experienceId;
        this.f210467b = dateTime;
        this.f210468c = dateTime2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f210466a, cVar.f210466a) && Intrinsics.f(this.f210467b, cVar.f210467b) && Intrinsics.f(this.f210468c, cVar.f210468c);
    }

    public final int hashCode() {
        int iHashCode = this.f210466a.hashCode() * 31;
        DateTime dateTime = this.f210467b;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f210468c;
        return iHashCode2 + (dateTime2 != null ? dateTime2.hashCode() : 0);
    }
}
