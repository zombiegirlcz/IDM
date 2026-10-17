package xck;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f304151b;

    public f(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f304150a = title;
        this.f304151b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f304150a, fVar.f304150a) && this.f304151b.equals(fVar.f304151b);
    }

    public final int hashCode() {
        return this.f304151b.hashCode() + (this.f304150a.hashCode() * 31);
    }
}
