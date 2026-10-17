package qh4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh4.e f246480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f246481b;

    public w(sh4.e type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f246480a = type;
        this.f246481b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f246480a == wVar.f246480a && this.f246481b == wVar.f246481b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f246481b) + (this.f246480a.hashCode() * 31);
    }
}
