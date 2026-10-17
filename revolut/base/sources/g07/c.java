package g07;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139365a;

    public c(String str) {
        this.f139365a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f139365a, ((c) obj2).f139365a);
    }

    public final int hashCode() {
        String str = this.f139365a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
