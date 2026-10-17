package gzc;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f148001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f148002b;

    public h(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f148001a = title;
        this.f148002b = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f148001a, hVar.f148001a) && Intrinsics.f(this.f148002b, hVar.f148002b);
    }

    public final int hashCode() {
        return this.f148002b.hashCode() + (this.f148001a.hashCode() * 31);
    }
}
