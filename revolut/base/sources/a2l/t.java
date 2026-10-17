package a2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f927c;

    public t(c icon, String title, boolean z) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f925a = icon;
        this.f926b = title;
        this.f927c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f925a, tVar.f925a) && Intrinsics.f(this.f926b, tVar.f926b) && this.f927c == tVar.f927c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f927c) + p.a.c(this.f925a.f896a.hashCode() * 31, 31, this.f926b);
    }
}
