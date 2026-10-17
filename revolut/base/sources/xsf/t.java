package xsf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308482a;

    public t() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f308482a, ((t) obj2).f308482a);
    }

    public final int hashCode() {
        String str = this.f308482a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public t(String str) {
        this.f308482a = str;
    }
}
