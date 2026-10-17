package fx0;

import com.revolut.core.ui.models.Color;
import ehe.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color f138716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color f138717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color f138718c;
    public final Color d;
    public final Color e;
    public final Color f;

    public a(Color color1, Color color2, Color color3, Color color4, Color color5, Color color6) {
        Intrinsics.checkNotNullParameter(color1, "color1");
        Intrinsics.checkNotNullParameter(color2, "color2");
        Intrinsics.checkNotNullParameter(color3, "color3");
        Intrinsics.checkNotNullParameter(color4, "color4");
        Intrinsics.checkNotNullParameter(color5, "color5");
        Intrinsics.checkNotNullParameter(color6, "color6");
        this.f138716a = color1;
        this.f138717b = color2;
        this.f138718c = color3;
        this.d = color4;
        this.e = color5;
        this.f = color6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f138716a, aVar.f138716a) && Intrinsics.f(this.f138717b, aVar.f138717b) && Intrinsics.f(this.f138718c, aVar.f138718c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + n.d(this.e, n.d(this.d, n.d(this.f138718c, n.d(this.f138717b, this.f138716a.hashCode() * 31, 31), 31), 31), 31);
    }
}
