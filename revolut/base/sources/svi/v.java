package svi;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f266005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f266006c;

    public v(dj0.d refund, String id10, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(refund, "refund");
        this.f266004a = id10;
        this.f266005b = refund;
        this.f266006c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f266004a, vVar.f266004a) && Intrinsics.f(this.f266005b, vVar.f266005b) && Intrinsics.f(this.f266006c, vVar.f266006c);
    }

    public final int hashCode() {
        int iC = v7.c(this.f266004a.hashCode() * 31, 31, this.f266005b);
        String str = this.f266006c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
