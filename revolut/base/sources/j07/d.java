package j07;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169982a;

    public d(String str) {
        this.f169982a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f169982a, ((d) obj2).f169982a);
    }

    public final int hashCode() {
        String str = this.f169982a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
