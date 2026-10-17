package ux6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f283880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f283881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f283882c;
    public final boolean d;
    public final boolean e;

    public j() {
        this(0);
    }

    public static j a(j jVar, Data data, String str, boolean z, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            data = jVar.f283880a;
        }
        Data items = data;
        if ((i & 2) != 0) {
            str = jVar.f283881b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = jVar.f283882c;
        }
        boolean z6 = z;
        if ((i & 8) != 0) {
            z3 = jVar.d;
        }
        boolean z11 = z3;
        if ((i & 16) != 0) {
            z4 = jVar.e;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        return new j(items, str2, z6, z11, z4);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f283880a, jVar.f283880a) && Intrinsics.f(this.f283881b, jVar.f283881b) && this.f283882c == jVar.f283882c && this.d == jVar.d && this.e == jVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f283880a.hashCode() * 31;
        String str = this.f283881b;
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f283882c), 31, this.d);
    }

    public j(Data items, String str, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283880a = items;
        this.f283881b = str;
        this.f283882c = z;
        this.d = z3;
        this.e = z4;
    }

    public /* synthetic */ j(int i) {
        this(new Data(null, null, true, 3, null), null, false, false, false);
    }
}
