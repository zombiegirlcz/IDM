package mid;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f205763b;

    public u(String title, ArrayList elements) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f205762a = title;
        this.f205763b = elements;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f205762a, uVar.f205762a) && this.f205763b.equals(uVar.f205763b);
    }

    public final int hashCode() {
        return this.f205763b.hashCode() + (this.f205762a.hashCode() * 31);
    }
}
