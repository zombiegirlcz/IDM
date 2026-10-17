package vm4;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f290530b;

    public a(String title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290529a = title;
        this.f290530b = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f290529a, aVar.f290529a) && this.f290530b.equals(aVar.f290530b);
    }

    public final int hashCode() {
        return this.f290530b.hashCode() + (this.f290529a.hashCode() * 31);
    }
}
