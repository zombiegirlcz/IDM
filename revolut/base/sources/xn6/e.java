package xn6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f307316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f307317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f307318c;
    public final oe6.g d;
    public final String e;

    public e(boolean z, Data institutions, String searchQuery, oe6.g institutionPurpose, String str) {
        Intrinsics.checkNotNullParameter(institutions, "institutions");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(institutionPurpose, "institutionPurpose");
        this.f307316a = z;
        this.f307317b = institutions;
        this.f307318c = searchQuery;
        this.d = institutionPurpose;
        this.e = str;
    }

    public static e a(e eVar, boolean z, Data data, String str, int i) {
        if ((i & 1) != 0) {
            z = eVar.f307316a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            data = eVar.f307317b;
        }
        Data institutions = data;
        if ((i & 4) != 0) {
            str = eVar.f307318c;
        }
        String searchQuery = str;
        oe6.g institutionPurpose = eVar.d;
        String str2 = eVar.e;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(institutions, "institutions");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(institutionPurpose, "institutionPurpose");
        return new e(z3, institutions, searchQuery, institutionPurpose, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f307316a == eVar.f307316a && Intrinsics.f(this.f307317b, eVar.f307317b) && Intrinsics.f(this.f307318c, eVar.f307318c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(kii.e.c(this.f307317b, Boolean.hashCode(this.f307316a) * 31, 31), 31, this.f307318c)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
