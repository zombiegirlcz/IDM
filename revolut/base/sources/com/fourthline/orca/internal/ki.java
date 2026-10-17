package com.fourthline.orca.internal;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ki implements ge1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f30279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f30280c;

    public ki(String str, Date date, Date date2) {
        this.f30278a = str;
        this.f30279b = date;
        this.f30280c = date2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ki)) {
            return false;
        }
        ki kiVar = (ki) obj2;
        return Intrinsics.f(this.f30278a, kiVar.f30278a) && Intrinsics.f(this.f30279b, kiVar.f30279b) && Intrinsics.f(this.f30280c, kiVar.f30280c);
    }

    public int hashCode() {
        String str = this.f30278a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.f30279b;
        int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.f30280c;
        return iHashCode2 + (date2 != null ? date2.hashCode() : 0);
    }

    public String toString() {
        return "Result(documentNumber=" + this.f30278a + ", expirationDate=" + this.f30279b + ", birthDate=" + this.f30280c + ")";
    }
}
