package cv3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f109256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f109257c;

    public f(String title, String description, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109255a = title;
        this.f109256b = description;
        this.f109257c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f109255a, fVar.f109255a) && Intrinsics.f(this.f109256b, fVar.f109256b) && this.f109257c.equals(fVar.f109257c);
    }

    public final int hashCode() {
        return this.f109257c.hashCode() + p.a.c(this.f109255a.hashCode() * 31, 31, this.f109256b);
    }
}
