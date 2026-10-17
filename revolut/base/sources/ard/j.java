package ard;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8656b;

    public j(String transactionId, i action) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f8655a = transactionId;
        this.f8656b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f8655a, jVar.f8655a) && this.f8656b == jVar.f8656b;
    }

    public final int hashCode() {
        return this.f8656b.hashCode() + (this.f8655a.hashCode() * 31);
    }
}
