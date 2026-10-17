package xck;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f304153b;

    public g(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f304152a = title;
        this.f304153b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f304152a, gVar.f304152a) && this.f304153b.equals(gVar.f304153b);
    }

    public final int hashCode() {
        return this.f304153b.hashCode() + (this.f304152a.hashCode() * 31);
    }
}
