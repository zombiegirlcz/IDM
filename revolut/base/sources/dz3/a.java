package dz3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121227c;
    public final String d;

    public a(String title, String description, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f121225a = title;
        this.f121226b = description;
        this.f121227c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f121225a, aVar.f121225a) && Intrinsics.f(this.f121226b, aVar.f121226b) && Intrinsics.f(this.f121227c, aVar.f121227c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f121225a.hashCode() * 31, 31, this.f121226b);
        String str = this.f121227c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
