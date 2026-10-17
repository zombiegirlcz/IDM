package rd6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253357a;

    public i() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f253357a, ((i) obj2).f253357a);
    }

    public final int hashCode() {
        String str = this.f253357a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public i(String str) {
        this.f253357a = str;
    }
}
