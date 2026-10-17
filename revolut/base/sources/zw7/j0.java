package zw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f325800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f325802c;

    public j0(i iVar, String displayText, i0 status) {
        Intrinsics.checkNotNullParameter(displayText, "displayText");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f325800a = iVar;
        this.f325801b = displayText;
        this.f325802c = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return this.f325800a == j0Var.f325800a && Intrinsics.f(this.f325801b, j0Var.f325801b) && this.f325802c == j0Var.f325802c;
    }

    public final int hashCode() {
        i iVar = this.f325800a;
        return this.f325802c.hashCode() + p.a.c((iVar == null ? 0 : iVar.hashCode()) * 31, 31, this.f325801b);
    }
}
