package o22;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AliasType f221416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f221417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f221418c;
    public final String d;
    public final boolean e;

    public a(AliasType tab2, Data data, String phone, String email, boolean z) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f221416a = tab2;
        this.f221417b = data;
        this.f221418c = phone;
        this.d = email;
        this.e = z;
    }

    public static a a(a aVar, AliasType aliasType, Data data, String str, String str2, int i) {
        if ((i & 1) != 0) {
            aliasType = aVar.f221416a;
        }
        AliasType tab2 = aliasType;
        if ((i & 2) != 0) {
            data = aVar.f221417b;
        }
        Data data2 = data;
        if ((i & 4) != 0) {
            str = aVar.f221418c;
        }
        String phone = str;
        if ((i & 8) != 0) {
            str2 = aVar.d;
        }
        String email = str2;
        boolean z = aVar.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Intrinsics.checkNotNullParameter(data2, "data");
        Intrinsics.checkNotNullParameter(phone, "phone");
        Intrinsics.checkNotNullParameter(email, "email");
        return new a(tab2, data2, phone, email, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f221416a, aVar.f221416a) && Intrinsics.f(this.f221417b, aVar.f221417b) && Intrinsics.f(this.f221418c, aVar.f221418c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(p.a.c(kii.e.c(this.f221417b, this.f221416a.hashCode() * 31, 31), 31, this.f221418c), 31, this.d);
    }
}
