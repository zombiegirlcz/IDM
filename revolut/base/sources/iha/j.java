package iha;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f161329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f161331c;
    public final List d;

    public j(String str, String str2, t tVar, ArrayList arrayList) {
        this.f161329a = str;
        this.f161330b = str2;
        this.f161331c = tVar;
        this.d = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f161329a, jVar.f161329a) && Intrinsics.f(this.f161330b, jVar.f161330b) && Intrinsics.f(this.f161331c, jVar.f161331c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        String str = this.f161329a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f161330b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        t tVar = this.f161331c;
        int iHashCode3 = (iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }
}
