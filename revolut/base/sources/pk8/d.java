package pk8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f236938a;

    public d(Integer num) {
        this.f236938a = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f236938a, ((d) obj2).f236938a);
    }

    public final int hashCode() {
        Integer num = this.f236938a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
