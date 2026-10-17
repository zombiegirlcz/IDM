package ti7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f271433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f271434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271435c;
    public final j d;
    public final a e;
    public final String f;

    public f(ArrayList arrayList, List suitabilityStatement, String str, j jVar, a aVar, String str2) {
        Intrinsics.checkNotNullParameter(suitabilityStatement, "suitabilityStatement");
        this.f271433a = arrayList;
        this.f271434b = suitabilityStatement;
        this.f271435c = str;
        this.d = jVar;
        this.e = aVar;
        this.f = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f271433a, fVar.f271433a) && Intrinsics.f(this.f271434b, fVar.f271434b) && Intrinsics.f(this.f271435c, fVar.f271435c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        List list = this.f271433a;
        int iD = p.a.d((list == null ? 0 : list.hashCode()) * 31, 31, this.f271434b);
        String str = this.f271435c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.d;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        a aVar = this.e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }
}
