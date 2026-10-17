package xu3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f308950c;
    public final String d;
    public final ArrayList e;

    public x(String title, String str, w wVar, String str2, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308948a = title;
        this.f308949b = str;
        this.f308950c = wVar;
        this.d = str2;
        this.e = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f308948a, xVar.f308948a) && Intrinsics.f(this.f308949b, xVar.f308949b) && Intrinsics.f(this.f308950c, xVar.f308950c) && Intrinsics.f(this.d, xVar.d) && this.e.equals(xVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f308948a.hashCode() * 31;
        String str = this.f308949b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        w wVar = this.f308950c;
        int iHashCode3 = (iHashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
