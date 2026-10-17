package kse;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends av1.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f189446c;

    public g(String str) {
        super(str, 4);
        this.f189446c = str;
    }

    @Override // av1.c
    public final String b() {
        return this.f189446c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f189446c, ((g) obj2).f189446c);
    }

    public final int hashCode() {
        String str = this.f189446c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
