package rrc;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f256800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f256801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f256802c;
    public final Data d;
    public final String e;

    public v(boolean z, boolean z3, List slots, Data accountDetailsData, String str) {
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(accountDetailsData, "accountDetailsData");
        this.f256800a = z;
        this.f256801b = z3;
        this.f256802c = slots;
        this.d = accountDetailsData;
        this.e = str;
    }

    public static v a(v vVar, boolean z, List slots, Data accountDetailsData, String str, int i) {
        boolean z3 = (i & 1) != 0 ? vVar.f256800a : true;
        if ((i & 2) != 0) {
            z = vVar.f256801b;
        }
        if ((i & 4) != 0) {
            slots = vVar.f256802c;
        }
        if ((i & 8) != 0) {
            accountDetailsData = vVar.d;
        }
        if ((i & 16) != 0) {
            str = vVar.e;
        }
        String str2 = str;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(accountDetailsData, "accountDetailsData");
        Data data = accountDetailsData;
        return new v(z3, z, slots, data, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f256800a == vVar.f256800a && this.f256801b == vVar.f256801b && Intrinsics.f(this.f256802c, vVar.f256802c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, p.a.d(j6.a.c(Boolean.hashCode(this.f256800a) * 31, 31, this.f256801b), 31, this.f256802c), 31);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
