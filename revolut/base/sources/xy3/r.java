package xy3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import xy3.a;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f309594c;
    public final String d;
    public final ArrayList e;

    public r(String id10, String title, String str, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309592a = id10;
        this.f309593b = title;
        this.f309594c = str;
        this.d = str2;
        this.e = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f309592a, rVar.f309592a) && Intrinsics.f(this.f309593b, rVar.f309593b) && Intrinsics.f(this.f309594c, rVar.f309594c) && Intrinsics.f(this.d, rVar.d) && this.e.equals(rVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f309592a.hashCode() * 31, 31, this.f309593b);
        String str = this.f309594c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
