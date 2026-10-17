package npg;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f218209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f218210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218211c;

    public e(c name, d status, String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f218209a = name;
        this.f218210b = status;
        this.f218211c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f218209a == eVar.f218209a && this.f218210b == eVar.f218210b && Intrinsics.f(this.f218211c, eVar.f218211c);
    }

    public final int hashCode() {
        int iHashCode = (this.f218210b.hashCode() + (this.f218209a.hashCode() * 31)) * 31;
        String str = this.f218211c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
