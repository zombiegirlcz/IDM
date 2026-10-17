package hz4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157022a;

    public f(String str) {
        this.f157022a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f157022a, ((f) obj2).f157022a);
    }

    public final int hashCode() {
        String str = this.f157022a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
