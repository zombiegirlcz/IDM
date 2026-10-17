package iz0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f169809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d01.e f169810c;

    public c(d01.e layoutStyle, String str, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
        this.f169808a = str;
        this.f169809b = items;
        this.f169810c = layoutStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f169808a, cVar.f169808a) && Intrinsics.f(this.f169809b, cVar.f169809b) && this.f169810c == cVar.f169810c;
    }

    public final int hashCode() {
        String str = this.f169808a;
        return this.f169810c.hashCode() + p.a.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f169809b);
    }

    public /* synthetic */ c(f0 f0Var) {
        this(d01.e.DEFAULT, null, f0Var);
    }
}
