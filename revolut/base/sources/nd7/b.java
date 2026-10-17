package nd7;

import com.revolut.core.ui_kit.models.Click;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Click f214333b;

    public b(String text, Click style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f214332a = text;
        this.f214333b = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f214332a, bVar.f214332a) && this.f214333b.equals(bVar.f214333b);
    }

    public final int hashCode() {
        return this.f214333b.hashCode() + (this.f214332a.hashCode() * 31);
    }
}
