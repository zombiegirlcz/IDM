package dp8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f116844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f116845c;
    public final dj0.d d;

    public g(dj0.d dVar, String taskId, String str, String str2) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        this.f116843a = taskId;
        this.f116844b = str;
        this.f116845c = str2;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f116843a, gVar.f116843a) && Intrinsics.f(this.f116844b, gVar.f116844b) && Intrinsics.f(this.f116845c, gVar.f116845c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f116843a.hashCode() * 31;
        String str = this.f116844b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f116845c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        dj0.d dVar = this.d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }
}
