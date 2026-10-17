package yxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f317669c;
    public final ste.d d;

    public f(String originalAccountName, String originalLabel, String label, ste.d flowRegion) {
        Intrinsics.checkNotNullParameter(originalAccountName, "originalAccountName");
        Intrinsics.checkNotNullParameter(originalLabel, "originalLabel");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(flowRegion, "flowRegion");
        this.f317667a = originalAccountName;
        this.f317668b = originalLabel;
        this.f317669c = label;
        this.d = flowRegion;
    }

    public static f a(f fVar, String label) {
        String originalAccountName = fVar.f317667a;
        String originalLabel = fVar.f317668b;
        ste.d flowRegion = fVar.d;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(originalAccountName, "originalAccountName");
        Intrinsics.checkNotNullParameter(originalLabel, "originalLabel");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(flowRegion, "flowRegion");
        return new f(originalAccountName, originalLabel, label, flowRegion);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f317667a, fVar.f317667a) && Intrinsics.f(this.f317668b, fVar.f317668b) && Intrinsics.f(this.f317669c, fVar.f317669c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f317667a.hashCode() * 31, 31, this.f317668b), 31, this.f317669c);
    }
}
