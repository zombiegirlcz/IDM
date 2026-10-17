package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f308878c;

    public a0(String title, String str, z status) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f308876a = title;
        this.f308877b = str;
        this.f308878c = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f308876a, a0Var.f308876a) && Intrinsics.f(this.f308877b, a0Var.f308877b) && this.f308878c == a0Var.f308878c;
    }

    public final int hashCode() {
        int iHashCode = this.f308876a.hashCode() * 31;
        String str = this.f308877b;
        return this.f308878c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
