package zm0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f323318a;

    public a(Integer num) {
        this.f323318a = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f323318a, ((a) obj2).f323318a);
    }

    public final int hashCode() {
        Integer num = this.f323318a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
