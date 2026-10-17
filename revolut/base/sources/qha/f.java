package qha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f246586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f246587c;

    public f(String title, String description, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f246585a = title;
        this.f246586b = description;
        this.f246587c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f246585a, fVar.f246585a) && Intrinsics.f(this.f246586b, fVar.f246586b) && Intrinsics.f(this.f246587c, fVar.f246587c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f246585a.hashCode() * 31, 31, this.f246586b);
        String str = this.f246587c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
