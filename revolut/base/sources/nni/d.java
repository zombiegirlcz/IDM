package nni;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mni.b f217685a;

    public d(mni.b method) {
        Intrinsics.checkNotNullParameter(method, "method");
        this.f217685a = method;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f217685a == ((d) obj2).f217685a;
    }

    public final int hashCode() {
        return this.f217685a.hashCode();
    }
}
