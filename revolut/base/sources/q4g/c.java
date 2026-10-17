package q4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f242140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f242141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242142c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f242143g;

    public c(String subheaderItemId, String bookingContactItemId, String str, int i, int i2, int i3, Integer num) {
        Intrinsics.checkNotNullParameter(subheaderItemId, "subheaderItemId");
        Intrinsics.checkNotNullParameter(bookingContactItemId, "bookingContactItemId");
        this.f242140a = subheaderItemId;
        this.f242141b = bookingContactItemId;
        this.f242142c = str;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f242143g = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f242140a, cVar.f242140a) && Intrinsics.f(this.f242141b, cVar.f242141b) && Intrinsics.f(this.f242142c, cVar.f242142c) && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && Intrinsics.f(this.f242143g, cVar.f242143g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f242140a.hashCode() * 31, 31, this.f242141b);
        String str = this.f242142c;
        int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        Integer num = this.f242143g;
        return iB + (num != null ? num.hashCode() : 0);
    }
}
