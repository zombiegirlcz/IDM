package ial;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f160056b;

    public d(String transactionId, String source) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f160055a = transactionId;
        this.f160056b = source;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f160055a, dVar.f160055a) && Intrinsics.f(this.f160056b, dVar.f160056b);
    }

    public final int hashCode() {
        return this.f160056b.hashCode() + (this.f160055a.hashCode() * 31);
    }
}
