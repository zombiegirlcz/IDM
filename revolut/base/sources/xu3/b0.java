package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308882b;

    public b0(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f308881a = title;
        this.f308882b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return Intrinsics.f(this.f308881a, b0Var.f308881a) && Intrinsics.f(this.f308882b, b0Var.f308882b);
    }

    public final int hashCode() {
        int iHashCode = this.f308881a.hashCode() * 31;
        String str = this.f308882b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
