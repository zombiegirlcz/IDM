package p8c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234140a;

    public b(String transactionId) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f234140a = transactionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f234140a, ((b) obj2).f234140a);
    }

    public final int hashCode() {
        return this.f234140a.hashCode();
    }
}
