package xck;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f304164b;

    public k(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f304163a = title;
        this.f304164b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f304163a, kVar.f304163a) && this.f304164b.equals(kVar.f304164b);
    }

    public final int hashCode() {
        return this.f304164b.hashCode() + (this.f304163a.hashCode() * 31);
    }
}
