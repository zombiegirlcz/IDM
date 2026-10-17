package ht3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f155310b;

    public u(String userId, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f155309a = userId;
        this.f155310b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f155309a, uVar.f155309a) && Intrinsics.f(this.f155310b, uVar.f155310b);
    }

    public final int hashCode() {
        int iHashCode = this.f155309a.hashCode() * 31;
        String str = this.f155310b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
