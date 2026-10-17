package com.fourthline.orca.internal;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class fr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fd f28620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f28621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final di f28622c;

    public fr(fd country, Date date, di details) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f28620a = country;
        this.f28621b = date;
        this.f28622c = details;
    }

    public final fd a() {
        return this.f28620a;
    }

    public final di b() {
        return this.f28622c;
    }

    public final Date c() {
        return this.f28621b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof fr)) {
            return false;
        }
        fr frVar = (fr) obj2;
        return Intrinsics.f(this.f28620a, frVar.f28620a) && Intrinsics.f(this.f28621b, frVar.f28621b) && Intrinsics.f(this.f28622c, frVar.f28622c);
    }

    public int hashCode() {
        int iHashCode = this.f28620a.hashCode() * 31;
        Date date = this.f28621b;
        return ((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + this.f28622c.hashCode();
    }

    public String toString() {
        return "DocumentVersion(country=" + this.f28620a + ", issueDate=" + this.f28621b + ", details=" + this.f28622c + ")";
    }
}
