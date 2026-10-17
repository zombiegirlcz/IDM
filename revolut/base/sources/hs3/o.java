package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154923b;

    public o(String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f154922a = title;
        this.f154923b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f154922a, oVar.f154922a) && Intrinsics.f(this.f154923b, oVar.f154923b);
    }

    public final int hashCode() {
        int iHashCode = this.f154922a.hashCode() * 31;
        String str = this.f154923b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
