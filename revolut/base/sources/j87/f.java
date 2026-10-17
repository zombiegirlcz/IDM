package j87;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h87.f f172139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f172140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f172141c;

    public f(h87.f key, e globeState, Data collection) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(globeState, "globeState");
        Intrinsics.checkNotNullParameter(collection, "collection");
        this.f172139a = key;
        this.f172140b = globeState;
        this.f172141c = collection;
    }

    public static f a(f fVar, e globeState, Data collection, int i) {
        h87.f key = fVar.f172139a;
        if ((i & 4) != 0) {
            collection = fVar.f172141c;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(globeState, "globeState");
        Intrinsics.checkNotNullParameter(collection, "collection");
        return new f(key, globeState, collection);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f172139a == fVar.f172139a && Intrinsics.f(this.f172140b, fVar.f172140b) && Intrinsics.f(this.f172141c, fVar.f172141c);
    }

    public final int hashCode() {
        return this.f172141c.hashCode() + ((this.f172140b.hashCode() + (this.f172139a.hashCode() * 31)) * 31);
    }
}
