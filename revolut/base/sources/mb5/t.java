package mb5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f204157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f204159c;

    public t(String str, String str2, j jVar) {
        this.f204157a = str;
        this.f204158b = str2;
        this.f204159c = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f204157a, tVar.f204157a) && Intrinsics.f(this.f204158b, tVar.f204158b) && this.f204159c == tVar.f204159c;
    }

    public final int hashCode() {
        String str = this.f204157a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f204158b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        j jVar = this.f204159c;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }
}
