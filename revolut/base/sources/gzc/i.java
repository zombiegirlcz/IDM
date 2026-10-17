package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f148005c;
    public final String d;
    public final String e;

    public /* synthetic */ i(String str, String str2, String str3, String str4, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (String) null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f148003a, iVar.f148003a) && Intrinsics.f(this.f148004b, iVar.f148004b) && Intrinsics.f(this.f148005c, iVar.f148005c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f148003a.hashCode() * 31, 31, this.f148004b), 31, this.f148005c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public i(String type, String title, String description, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f148003a = type;
        this.f148004b = title;
        this.f148005c = description;
        this.d = str;
        this.e = str2;
    }
}
