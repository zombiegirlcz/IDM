package ggk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f143755b;

    public n(String text, boolean z) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f143754a = text;
        this.f143755b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f143754a, nVar.f143754a) && this.f143755b == nVar.f143755b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143755b) + (this.f143754a.hashCode() * 31);
    }
}
