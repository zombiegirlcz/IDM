package nd7;

import com.revolut.core.ui_kit.models.Click;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f214329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f214330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Click f214331c;

    public a(int i, int i2, Click style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f214329a = i;
        this.f214330b = i2;
        this.f214331c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f214329a == aVar.f214329a && this.f214330b == aVar.f214330b && this.f214331c.equals(aVar.f214331c);
    }

    public final int hashCode() {
        return this.f214331c.hashCode() + j6.a.b(this.f214330b, Integer.hashCode(this.f214329a) * 31, 31);
    }
}
