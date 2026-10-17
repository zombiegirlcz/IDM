package uyd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f284161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f284162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284163c;
    public final Boolean d;
    public final io3.l e;

    public a(boolean z, ArrayList arrayList, String str, Boolean bool, io3.l lVar) {
        this.f284161a = z;
        this.f284162b = arrayList;
        this.f284163c = str;
        this.d = bool;
        this.e = lVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f284161a == aVar.f284161a && Intrinsics.f(this.f284162b, aVar.f284162b) && Intrinsics.f(this.f284163c, aVar.f284163c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f284161a) * 31;
        List list = this.f284162b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f284163c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        io3.l lVar = this.e;
        return iHashCode4 + (lVar != null ? lVar.hashCode() : 0);
    }
}
