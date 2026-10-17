package cv3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109262c;
    public final bv3.e d;
    public final List e;
    public final w f;

    public o(String title, String str, String str2, bv3.e subtitleImage, ArrayList arrayList, w wVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleImage, "subtitleImage");
        this.f109260a = title;
        this.f109261b = str;
        this.f109262c = str2;
        this.d = subtitleImage;
        this.e = arrayList;
        this.f = wVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f109260a, oVar.f109260a) && Intrinsics.f(this.f109261b, oVar.f109261b) && Intrinsics.f(this.f109262c, oVar.f109262c) && this.d == oVar.d && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f109260a.hashCode() * 31;
        String str = this.f109261b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f109262c;
        int iHashCode3 = (this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        List list = this.e;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        w wVar = this.f;
        return iHashCode4 + (wVar != null ? wVar.hashCode() : 0);
    }
}
