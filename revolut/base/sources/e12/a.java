package e12;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f121847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f121848b;

    public a(c inputData, b extension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(extension, "extension");
        this.f121847a = inputData;
        this.f121848b = extension;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f121847a, aVar.f121847a) && Intrinsics.f(this.f121848b, aVar.f121848b);
    }

    public final int hashCode() {
        return this.f121848b.hashCode() + (this.f121847a.f121849a.hashCode() * 31);
    }
}
