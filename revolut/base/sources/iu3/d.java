package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168466c;

    public d(String fullName, String phoneNumber, String userId) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f168464a = fullName;
        this.f168465b = phoneNumber;
        this.f168466c = userId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f168464a, dVar.f168464a) && Intrinsics.f(this.f168465b, dVar.f168465b) && Intrinsics.f(this.f168466c, dVar.f168466c);
    }

    public final int hashCode() {
        return this.f168466c.hashCode() + p.a.c(this.f168464a.hashCode() * 31, 31, this.f168465b);
    }
}
