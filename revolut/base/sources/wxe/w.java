package wxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f300926c;

    public w(String storedMethodAccountId, String mandateId, String institutionName) {
        Intrinsics.checkNotNullParameter(storedMethodAccountId, "storedMethodAccountId");
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f300924a = storedMethodAccountId;
        this.f300925b = mandateId;
        this.f300926c = institutionName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f300924a, wVar.f300924a) && Intrinsics.f(this.f300925b, wVar.f300925b) && Intrinsics.f(this.f300926c, wVar.f300926c);
    }

    public final int hashCode() {
        return this.f300926c.hashCode() + p.a.c(this.f300924a.hashCode() * 31, 31, this.f300925b);
    }
}
