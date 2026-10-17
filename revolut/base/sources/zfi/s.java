package zfi;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f321997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f321998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f321999c;

    public s(String queryParam, String str, ArrayList options) {
        Intrinsics.checkNotNullParameter(queryParam, "queryParam");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f321997a = queryParam;
        this.f321998b = options;
        this.f321999c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f321997a, sVar.f321997a) && this.f321998b.equals(sVar.f321998b) && Intrinsics.f(this.f321999c, sVar.f321999c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f321998b, this.f321997a.hashCode() * 31, 31);
        String str = this.f321999c;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
