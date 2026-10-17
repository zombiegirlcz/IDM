package yy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f317793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f317794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f317795c;

    public r(String title, String description, o oVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f317793a = title;
        this.f317794b = description;
        this.f317795c = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f317793a, rVar.f317793a) && Intrinsics.f(this.f317794b, rVar.f317794b) && Intrinsics.f(this.f317795c, rVar.f317795c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f317793a.hashCode() * 31, 31, this.f317794b);
        o oVar = this.f317795c;
        return iC + (oVar == null ? 0 : oVar.hashCode());
    }
}
