package xu3;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f308880b;

    public b(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308879a = title;
        this.f308880b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f308879a, bVar.f308879a) && this.f308880b.equals(bVar.f308880b);
    }

    public final int hashCode() {
        return this.f308880b.hashCode() + (this.f308879a.hashCode() * 31);
    }
}
