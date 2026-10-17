package ica;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160227a;

    public h(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f160227a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f160227a, ((h) obj2).f160227a);
    }

    public final int hashCode() {
        return this.f160227a.hashCode();
    }
}
