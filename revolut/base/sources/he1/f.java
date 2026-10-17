package he1;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f151513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f151514b;

    public f(Data catalogue, Set expandedCategories) {
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(expandedCategories, "expandedCategories");
        this.f151513a = catalogue;
        this.f151514b = expandedCategories;
    }

    public static f a(f fVar, Data catalogue, Set expandedCategories, int i) {
        fVar.getClass();
        if ((i & 2) != 0) {
            catalogue = fVar.f151513a;
        }
        if ((i & 4) != 0) {
            expandedCategories = fVar.f151514b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(expandedCategories, "expandedCategories");
        return new f(catalogue, expandedCategories);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f151513a, fVar.f151513a) && Intrinsics.f(this.f151514b, fVar.f151514b);
    }

    public final int hashCode() {
        return this.f151514b.hashCode() + kii.e.c(this.f151513a, Boolean.hashCode(true) * 31, 31);
    }
}
