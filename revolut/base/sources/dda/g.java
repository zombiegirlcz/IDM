package dda;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f113177b;

    public g(String title, ArrayList content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f113176a = title;
        this.f113177b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f113176a, gVar.f113176a) && this.f113177b.equals(gVar.f113177b);
    }

    public final int hashCode() {
        return this.f113177b.hashCode() + (this.f113176a.hashCode() * 31);
    }
}
