package yy3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f317805b;

    public w(String processId, v inProgressConfig) {
        Intrinsics.checkNotNullParameter(processId, "processId");
        Intrinsics.checkNotNullParameter(inProgressConfig, "inProgressConfig");
        this.f317804a = processId;
        this.f317805b = inProgressConfig;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f317804a, wVar.f317804a) && Intrinsics.f(this.f317805b, wVar.f317805b);
    }

    public final int hashCode() {
        return this.f317805b.hashCode() + (this.f317804a.hashCode() * 31);
    }
}
