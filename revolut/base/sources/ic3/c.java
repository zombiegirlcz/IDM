package ic3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160206a;

    public c(String str) {
        this.f160206a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f160206a, ((c) obj2).f160206a);
    }

    public final int hashCode() {
        String str = this.f160206a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
