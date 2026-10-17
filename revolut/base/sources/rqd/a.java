package rqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f256521b;

    public a(String executionId, String incomeSorterId) {
        Intrinsics.checkNotNullParameter(executionId, "executionId");
        Intrinsics.checkNotNullParameter(incomeSorterId, "incomeSorterId");
        this.f256520a = executionId;
        this.f256521b = incomeSorterId;
    }

    @Override // rqd.c
    public final String a() {
        return this.f256520a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f256520a, aVar.f256520a) && Intrinsics.f(this.f256521b, aVar.f256521b);
    }

    public final int hashCode() {
        return this.f256521b.hashCode() + (this.f256520a.hashCode() * 31);
    }
}
