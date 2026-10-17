package ck5;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@g
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24783c;
    public final e d;

    public /* synthetic */ f(int i, String str, String str2, String str3, e eVar) {
        if (15 != (i & 15)) {
            j1.f(a.f24778a.getDescriptor(), i, 15);
            throw null;
        }
        this.f24781a = str;
        this.f24782b = str2;
        this.f24783c = str3;
        this.d = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f24781a, fVar.f24781a) && Intrinsics.f(this.f24782b, fVar.f24782b) && Intrinsics.f(this.f24783c, fVar.f24783c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.f24780a.hashCode() + p.a.c(p.a.c(this.f24781a.hashCode() * 31, 31, this.f24782b), 31, this.f24783c);
    }

    public f(String address, String hostingPlatform, String ownershipMethod, e ownershipPayload) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(hostingPlatform, "hostingPlatform");
        Intrinsics.checkNotNullParameter(ownershipMethod, "ownershipMethod");
        Intrinsics.checkNotNullParameter(ownershipPayload, "ownershipPayload");
        this.f24781a = address;
        this.f24782b = hostingPlatform;
        this.f24783c = ownershipMethod;
        this.d = ownershipPayload;
    }
}
