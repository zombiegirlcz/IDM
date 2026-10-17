package nhl;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f215572c;
    public final List d;
    public final k e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, yhm.j.c(kVar, new n85.b(29)), yhm.j.c(kVar, new s(0)), null};
    }

    public /* synthetic */ v(int i, String str, String str2, List list, List list2, k kVar) {
        if (31 != (i & 31)) {
            j1.f(t.f215565a.getDescriptor(), i, 31);
            throw null;
        }
        this.f215570a = str;
        this.f215571b = str2;
        this.f215572c = list;
        this.d = list2;
        this.e = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f215570a, vVar.f215570a) && Intrinsics.f(this.f215571b, vVar.f215571b) && Intrinsics.f(this.f215572c, vVar.f215572c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f215570a.hashCode() * 31, 31, this.f215571b);
        List list = this.f215572c;
        int iD = p.a.d((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.d);
        k kVar = this.e;
        return iD + (kVar != null ? kVar.hashCode() : 0);
    }

    public v(String name, String icon, ArrayList arrayList, ArrayList instrumentTypes, k kVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(instrumentTypes, "instrumentTypes");
        this.f215570a = name;
        this.f215571b = icon;
        this.f215572c = arrayList;
        this.d = instrumentTypes;
        this.e = kVar;
    }
}
