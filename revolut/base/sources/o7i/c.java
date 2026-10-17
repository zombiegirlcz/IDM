package o7i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222847a;

    public c(String buttonTag) {
        Intrinsics.checkNotNullParameter(buttonTag, "buttonTag");
        this.f222847a = buttonTag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f222847a, ((c) obj2).f222847a);
    }

    public final int hashCode() {
        return this.f222847a.hashCode();
    }
}
