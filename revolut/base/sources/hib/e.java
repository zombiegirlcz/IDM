package hib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f152577b;

    public e() {
        this(null, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f152576a, eVar.f152576a) && this.f152577b == eVar.f152577b;
    }

    public final int hashCode() {
        String str = this.f152576a;
        return Boolean.hashCode(this.f152577b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public e(String str, boolean z) {
        this.f152576a = str;
        this.f152577b = z;
    }
}
