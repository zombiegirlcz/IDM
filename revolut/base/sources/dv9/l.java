package dv9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f118075b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String recipientId) {
        super(recipientId);
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        this.f118075b = recipientId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f118075b, ((l) obj2).f118075b);
    }

    public final int hashCode() {
        return this.f118075b.hashCode();
    }
}
