package dda;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113208c;
    public final List d;

    public y(String value, String icon, String str, List highlights) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(highlights, "highlights");
        this.f113206a = value;
        this.f113207b = icon;
        this.f113208c = str;
        this.d = highlights;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f113206a, yVar.f113206a) && Intrinsics.f(this.f113207b, yVar.f113207b) && Intrinsics.f(this.f113208c, yVar.f113208c) && Intrinsics.f(this.d, yVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f113206a.hashCode() * 31, 31, this.f113207b);
        String str = this.f113208c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }
}
