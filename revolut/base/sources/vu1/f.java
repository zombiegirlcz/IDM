package vu1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f292195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f292196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f292197c;
    public final boolean d;

    public f(List items, boolean z, String title, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f292195a = items;
        this.f292196b = title;
        this.f292197c = str;
        this.d = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f292195a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f292195a, fVar.f292195a) && Intrinsics.f(this.f292196b, fVar.f292196b) && Intrinsics.f(this.f292197c, fVar.f292197c) && this.d == fVar.d;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f292195a.hashCode() * 31, 31, this.f292196b);
        String str = this.f292197c;
        return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
