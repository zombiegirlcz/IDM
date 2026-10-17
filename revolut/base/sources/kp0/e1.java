package kp0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f187995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f187996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187997c;
    public final int d;
    public final Object e;

    public e1(String listId, String selectedText, boolean z, int i, v20.n nVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(selectedText, "selectedText");
        this.f187995a = listId;
        this.f187996b = selectedText;
        this.f187997c = z;
        this.d = i;
        this.e = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f187995a, e1Var.f187995a) && Intrinsics.f(this.f187996b, e1Var.f187996b) && this.f187997c == e1Var.f187997c && this.d == e1Var.d && Intrinsics.f(this.e, e1Var.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, j6.a.c(p.a.c(this.f187995a.hashCode() * 31, 31, this.f187996b), 31, this.f187997c), 31);
        Object obj2 = this.e;
        return iB + (obj2 == null ? 0 : obj2.hashCode());
    }
}
