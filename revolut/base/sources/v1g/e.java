package v1g;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f285309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f285310b;

    public e(Data allCategories, Set selectedCategories) {
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        this.f285309a = selectedCategories;
        this.f285310b = allCategories;
    }

    public static e a(e eVar, Set selectedCategories, Data allCategories, int i) {
        if ((i & 1) != 0) {
            selectedCategories = eVar.f285309a;
        }
        if ((i & 2) != 0) {
            allCategories = eVar.f285310b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        return new e(allCategories, selectedCategories);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f285309a, eVar.f285309a) && Intrinsics.f(this.f285310b, eVar.f285310b);
    }

    public final int hashCode() {
        return this.f285310b.hashCode() + (this.f285309a.hashCode() * 31);
    }
}
