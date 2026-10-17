package m1c;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f201335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f201337c;
    public final List d;
    public final a e;

    public b(e eVar, String title, String str, ArrayList arrayList, a action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f201335a = eVar;
        this.f201336b = title;
        this.f201337c = str;
        this.d = arrayList;
        this.e = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f201335a, bVar.f201335a) && Intrinsics.f(this.f201336b, bVar.f201336b) && Intrinsics.f(this.f201337c, bVar.f201337c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
    }

    public final int hashCode() {
        e eVar = this.f201335a;
        int iC = p.a.c((eVar == null ? 0 : eVar.hashCode()) * 31, 31, this.f201336b);
        String str = this.f201337c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.d;
        return this.e.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31);
    }
}
