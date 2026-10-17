package bdg;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f14598a;

    public a(Integer num) {
        this.f14598a = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f14598a, ((a) obj2).f14598a);
    }

    public final int hashCode() {
        Integer num = this.f14598a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }
}
