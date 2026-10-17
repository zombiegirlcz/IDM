package lo5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197412a;

    public t() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f197412a, ((t) obj2).f197412a);
    }

    public final int hashCode() {
        String str = this.f197412a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public t(String str) {
        this.f197412a = str;
    }
}
