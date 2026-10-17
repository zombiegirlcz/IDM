package iu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f168497c;
    public final String d;

    public p(String title, String description, String userId, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f168495a = title;
        this.f168496b = description;
        this.f168497c = userId;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f168495a, pVar.f168495a) && Intrinsics.f(this.f168496b, pVar.f168496b) && Intrinsics.f(this.f168497c, pVar.f168497c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f168495a.hashCode() * 31, 31, this.f168496b), 31, this.f168497c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
