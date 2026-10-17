package i8e;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159515a;

    public a(String newName) {
        Intrinsics.checkNotNullParameter(newName, "newName");
        this.f159515a = newName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f159515a, ((a) obj2).f159515a);
    }

    public final int hashCode() {
        return this.f159515a.hashCode();
    }
}
