package kx7;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f190487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Date f190488b;

    public r0(String petId, Date startDate) {
        Intrinsics.checkNotNullParameter(petId, "petId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f190487a = petId;
        this.f190488b = startDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f190487a, r0Var.f190487a) && Intrinsics.f(this.f190488b, r0Var.f190488b);
    }

    public final int hashCode() {
        return this.f190488b.hashCode() + (this.f190487a.hashCode() * 31);
    }
}
