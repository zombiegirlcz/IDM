package i58;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f158784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f158785b;

    public c(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f158784a = items;
        this.f158785b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f158784a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f158784a.equals(cVar.f158784a) && this.f158785b == cVar.f158785b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f158785b) + (this.f158784a.hashCode() * 31);
    }
}
