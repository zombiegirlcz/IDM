package fci;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f133819a;

    public v0(List purposes) {
        Intrinsics.checkNotNullParameter(purposes, "purposes");
        this.f133819a = purposes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v0) && Intrinsics.f(this.f133819a, ((v0) obj2).f133819a);
    }

    public final int hashCode() {
        return this.f133819a.hashCode();
    }
}
