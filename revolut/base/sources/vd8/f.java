package vd8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f287823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f287824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f287825c;
    public final String d;

    public f(String invitationId, String ownerFirstName, String ownerLastName, String juniorFirstName) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        Intrinsics.checkNotNullParameter(ownerFirstName, "ownerFirstName");
        Intrinsics.checkNotNullParameter(ownerLastName, "ownerLastName");
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        this.f287823a = invitationId;
        this.f287824b = ownerFirstName;
        this.f287825c = ownerLastName;
        this.d = juniorFirstName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f287823a, fVar.f287823a) && Intrinsics.f(this.f287824b, fVar.f287824b) && Intrinsics.f(this.f287825c, fVar.f287825c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f287823a.hashCode() * 31, 31, this.f287824b), 31, this.f287825c);
    }
}
