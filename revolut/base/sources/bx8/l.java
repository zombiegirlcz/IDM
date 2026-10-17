package bx8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19520b;

    public l(String consentKey, boolean z) {
        Intrinsics.checkNotNullParameter(consentKey, "consentKey");
        this.f19519a = consentKey;
        this.f19520b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f19519a, lVar.f19519a) && this.f19520b == lVar.f19520b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19520b) + (this.f19519a.hashCode() * 31);
    }
}
