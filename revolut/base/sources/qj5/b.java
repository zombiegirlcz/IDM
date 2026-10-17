package qj5;

import kotlin.jvm.internal.Intrinsics;
import wk5.e;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f246765c;
    public final a d;

    public b(String address, String hostingPlatform, e ownershipMethod, a ownershipPayload) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(hostingPlatform, "hostingPlatform");
        Intrinsics.checkNotNullParameter(ownershipMethod, "ownershipMethod");
        Intrinsics.checkNotNullParameter(ownershipPayload, "ownershipPayload");
        this.f246763a = address;
        this.f246764b = hostingPlatform;
        this.f246765c = ownershipMethod;
        this.d = ownershipPayload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f246763a, bVar.f246763a) && Intrinsics.f(this.f246764b, bVar.f246764b) && this.f246765c == bVar.f246765c && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.f246762a.hashCode() + ((this.f246765c.hashCode() + p.a.c(this.f246763a.hashCode() * 31, 31, this.f246764b)) * 31);
    }
}
