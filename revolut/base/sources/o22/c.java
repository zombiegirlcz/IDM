package o22;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f221421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f221422b;

    public c(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f221421a = items;
        this.f221422b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f221421a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f221421a.equals(cVar.f221421a) && this.f221422b == cVar.f221422b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221422b) + (this.f221421a.hashCode() * 31);
    }
}
