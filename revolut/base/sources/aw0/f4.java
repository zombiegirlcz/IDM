package aw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10304b;

    public f4(String listId, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f10303a = listId;
        this.f10304b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f4)) {
            return false;
        }
        f4 f4Var = (f4) obj2;
        return Intrinsics.f(this.f10303a, f4Var.f10303a) && this.f10304b == f4Var.f10304b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10304b) + (this.f10303a.hashCode() * 31);
    }
}
