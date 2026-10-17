package a0e;

import kotlin.jvm.internal.Intrinsics;
import wxd.z;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f342b;

    public g(z setting, boolean z) {
        Intrinsics.checkNotNullParameter(setting, "setting");
        this.f341a = setting;
        this.f342b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f341a == gVar.f341a && this.f342b == gVar.f342b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f342b) + (this.f341a.hashCode() * 31);
    }
}
