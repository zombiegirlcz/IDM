package mx0;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f209834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209835b;

    public m5(Typeface typeface, String str) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f209834a = typeface;
        this.f209835b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj2;
        return Intrinsics.f(this.f209834a, m5Var.f209834a) && Intrinsics.f(this.f209835b, m5Var.f209835b);
    }

    public final int hashCode() {
        int iHashCode = this.f209834a.hashCode() * 31;
        String str = this.f209835b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
