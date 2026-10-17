package bz3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f19911b;

    public b(a1 icon, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f19910a = text;
        this.f19911b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f19910a, bVar.f19910a) && this.f19911b == bVar.f19911b;
    }

    public final int hashCode() {
        return this.f19911b.hashCode() + (this.f19910a.hashCode() * 31);
    }
}
