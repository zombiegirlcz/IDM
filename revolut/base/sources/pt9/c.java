package pt9;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f239634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f239635b;

    public c(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f239634a = items;
        this.f239635b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f239634a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f239634a, cVar.f239634a) && this.f239635b == cVar.f239635b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f239635b) + (this.f239634a.hashCode() * 31);
    }
}
