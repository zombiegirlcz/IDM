package c3a;

import jq9.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f20923b;

    public c(String requestId, t recipient) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        this.f20922a = requestId;
        this.f20923b = recipient;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f20922a, cVar.f20922a) && Intrinsics.f(this.f20923b, cVar.f20923b);
    }

    public final int hashCode() {
        return this.f20923b.hashCode() + (this.f20922a.hashCode() * 31);
    }
}
