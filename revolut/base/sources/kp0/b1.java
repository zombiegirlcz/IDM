package kp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187975c;
    public final int d;
    public final Object e;

    public b1(String listId, String selectedText, boolean z, int i, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectedText, "selectedText");
        this.f187973a = listId;
        this.f187974b = selectedText;
        this.f187975c = z;
        this.d = i;
        this.e = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj2;
        return Intrinsics.f(this.f187973a, b1Var.f187973a) && Intrinsics.f(this.f187974b, b1Var.f187974b) && this.f187975c == b1Var.f187975c && this.d == b1Var.d && Intrinsics.f(this.e, b1Var.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, j6.a.c(p.a.c(this.f187973a.hashCode() * 31, 31, this.f187974b), 31, this.f187975c), 31);
        Object obj2 = this.e;
        return iB + (obj2 == null ? 0 : obj2.hashCode());
    }
}
