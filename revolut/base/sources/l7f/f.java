package l7f;

import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f192581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192582b;

    public f(String str, ArrayList tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f192581a = tabs;
        this.f192582b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f192581a.equals(fVar.f192581a) && Intrinsics.f(this.f192582b, fVar.f192582b);
    }

    public final int hashCode() {
        int iHashCode = this.f192581a.hashCode() * 31;
        String str = this.f192582b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
