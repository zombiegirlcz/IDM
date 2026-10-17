package re6;

import dj0.d;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import yte.n;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f253528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f253529c;

    public a(d amount, String mandateId, n contextType) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        this.f253527a = mandateId;
        this.f253528b = amount;
        this.f253529c = contextType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f253527a, aVar.f253527a) && Intrinsics.f(this.f253528b, aVar.f253528b) && this.f253529c == aVar.f253529c;
    }

    public final int hashCode() {
        return this.f253529c.hashCode() + v7.c(this.f253527a.hashCode() * 31, 31, this.f253528b);
    }
}
