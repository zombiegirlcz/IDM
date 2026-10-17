package ygc;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import yfe.b2;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new b2(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f313598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f313599c;
    public final String d;

    public /* synthetic */ c(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            j1.f(a.f313594a.getDescriptor(), i, 15);
            throw null;
        }
        this.f313597a = str;
        this.f313598b = str2;
        this.f313599c = list;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f313597a, cVar.f313597a) && Intrinsics.f(this.f313598b, cVar.f313598b) && Intrinsics.f(this.f313599c, cVar.f313599c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f313597a.hashCode() * 31;
        String str = this.f313598b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f313599c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public c(String title, String str, String str2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f313597a = title;
        this.f313598b = str;
        this.f313599c = arrayList;
        this.d = str2;
    }
}
