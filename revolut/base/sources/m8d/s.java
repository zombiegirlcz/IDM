package m8d;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f203522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f203523b;

    public s(String category, String form) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(form, "form");
        this.f203522a = category;
        this.f203523b = form;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f203522a, sVar.f203522a) && Intrinsics.f(this.f203523b, sVar.f203523b);
    }

    public final int hashCode() {
        return this.f203523b.hashCode() + (this.f203522a.hashCode() * 31);
    }
}
