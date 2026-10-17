package y63;

import com.revolut.core.ui_kit_resources.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f311141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f311142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f311143c;
    public final int d;
    public final int e;

    public t(String listId, int i, int i2, int i3) {
        int i5 = R$drawable.uikit_icn_24_users_search;
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f311141a = listId;
        this.f311142b = i;
        this.f311143c = i2;
        this.d = i3;
        this.e = i5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f311141a, tVar.f311141a) && this.f311142b == tVar.f311142b && this.f311143c == tVar.f311143c && this.d == tVar.d && this.e == tVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + j6.a.b(this.d, j6.a.b(this.f311143c, j6.a.b(this.f311142b, this.f311141a.hashCode() * 31, 31), 31), 31);
    }
}
