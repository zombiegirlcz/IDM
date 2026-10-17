package iaf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f160007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f160008b;

    public n(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f160007a = z;
        this.f160008b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f160008b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f160007a == nVar.f160007a && this.f160008b.equals(nVar.f160008b);
    }

    public final int hashCode() {
        return this.f160008b.hashCode() + (Boolean.hashCode(this.f160007a) * 31);
    }
}
