package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284227c;

    public m0(String groupId, String pocketId, String str) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f284225a = groupId;
        this.f284226b = pocketId;
        this.f284227c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f284225a, m0Var.f284225a) && Intrinsics.f(this.f284226b, m0Var.f284226b) && Intrinsics.f(this.f284227c, m0Var.f284227c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f284225a.hashCode() * 31, 31, this.f284226b);
        String str = this.f284227c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
