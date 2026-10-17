package n2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211585a;

    public c(String str) {
        this.f211585a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f211585a, ((c) obj2).f211585a);
    }

    public final int hashCode() {
        String str = this.f211585a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
