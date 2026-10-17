package qcc;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f244690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f244691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244692c;
    public final boolean d;

    public e(Data categories, Map merchantsByCategory, String selectedCategoryKey, boolean z) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(merchantsByCategory, "merchantsByCategory");
        Intrinsics.checkNotNullParameter(selectedCategoryKey, "selectedCategoryKey");
        this.f244690a = categories;
        this.f244691b = merchantsByCategory;
        this.f244692c = selectedCategoryKey;
        this.d = z;
    }

    public static e a(e eVar, Data categories, Map merchantsByCategory, String selectedCategoryKey, boolean z, int i) {
        if ((i & 1) != 0) {
            categories = eVar.f244690a;
        }
        if ((i & 2) != 0) {
            merchantsByCategory = eVar.f244691b;
        }
        if ((i & 4) != 0) {
            selectedCategoryKey = eVar.f244692c;
        }
        if ((i & 8) != 0) {
            z = eVar.d;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(merchantsByCategory, "merchantsByCategory");
        Intrinsics.checkNotNullParameter(selectedCategoryKey, "selectedCategoryKey");
        return new e(categories, merchantsByCategory, selectedCategoryKey, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f244690a, eVar.f244690a) && Intrinsics.f(this.f244691b, eVar.f244691b) && Intrinsics.f(this.f244692c, eVar.f244692c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.e(this.f244690a.hashCode() * 31, 31, this.f244691b), 31, this.f244692c);
    }
}
