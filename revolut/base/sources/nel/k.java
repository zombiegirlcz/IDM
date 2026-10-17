package nel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f214582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f214583c;
    public final String d;

    public k(String title, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f214581a = title;
        this.f214582b = z;
        this.f214583c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f214581a, kVar.f214581a) && this.f214582b == kVar.f214582b && Intrinsics.f(this.f214583c, kVar.f214583c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f214581a.hashCode() * 31, 31, this.f214582b);
        String str = this.f214583c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
