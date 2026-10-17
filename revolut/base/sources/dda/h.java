package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113180c;

    public h(String title, String value, String copyableValue) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(copyableValue, "copyableValue");
        this.f113178a = title;
        this.f113179b = value;
        this.f113180c = copyableValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f113178a, hVar.f113178a) && Intrinsics.f(this.f113179b, hVar.f113179b) && Intrinsics.f(this.f113180c, hVar.f113180c);
    }

    public final int hashCode() {
        return this.f113180c.hashCode() + p.a.c(this.f113178a.hashCode() * 31, 31, this.f113179b);
    }
}
