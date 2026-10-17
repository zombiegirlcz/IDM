package gmj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144863a;

    public e(String str) {
        this.f144863a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f144863a, ((e) obj2).f144863a);
    }

    public final int hashCode() {
        String str = this.f144863a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
