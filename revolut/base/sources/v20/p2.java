package v20;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f285523b;

    public p2(String supportLanguage, boolean z) {
        Intrinsics.checkNotNullParameter(supportLanguage, "supportLanguage");
        this.f285522a = supportLanguage;
        this.f285523b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj2;
        return Intrinsics.f(this.f285522a, p2Var.f285522a) && this.f285523b == p2Var.f285523b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285523b) + (this.f285522a.hashCode() * 31);
    }
}
