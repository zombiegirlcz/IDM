package svi;

import java.io.Serializable;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f265965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f265966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f265967c;

    public q0(int i, String description, Instant expirationDate) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        this.f265965a = i;
        this.f265966b = description;
        this.f265967c = expirationDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj2;
        return this.f265965a == q0Var.f265965a && Intrinsics.f(this.f265966b, q0Var.f265966b) && Intrinsics.f(this.f265967c, q0Var.f265967c);
    }

    public final int hashCode() {
        return this.f265967c.hashCode() + p.a.c(Integer.hashCode(this.f265965a) * 31, 31, this.f265966b);
    }
}
