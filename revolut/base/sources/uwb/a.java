package uwb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f283600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f283601c;
    public final int d;
    public final List e;

    public a(String str, int i, int i2, int i3) {
        this(f0.f322471a, str, i, i2, i3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f283599a, aVar.f283599a) && this.f283600b == aVar.f283600b && this.f283601c == aVar.f283601c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.b(this.d, j6.a.b(this.f283601c, j6.a.b(this.f283600b, this.f283599a.hashCode() * 31, 31), 31), 31);
    }

    public a(List subtitleArguments, String itemId, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(subtitleArguments, "subtitleArguments");
        this.f283599a = itemId;
        this.f283600b = i;
        this.f283601c = i2;
        this.d = i3;
        this.e = subtitleArguments;
    }
}
