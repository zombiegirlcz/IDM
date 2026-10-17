package m4l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f202767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f202768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f202769c;

    public j(String str, xi0.b bVar, ArrayList arrayList) {
        this.f202767a = str;
        this.f202768b = bVar;
        this.f202769c = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f202767a, jVar.f202767a) && Intrinsics.f(this.f202768b, jVar.f202768b) && Intrinsics.f(this.f202769c, jVar.f202769c);
    }

    public final int hashCode() {
        String str = this.f202767a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        xi0.b bVar = this.f202768b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.f202769c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
