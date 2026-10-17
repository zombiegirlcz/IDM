package wxd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f300884b;

    public s(String str, ArrayList products) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.f300883a = str;
        this.f300884b = products;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f300883a, sVar.f300883a) && this.f300884b.equals(sVar.f300884b);
    }

    public final int hashCode() {
        String str = this.f300883a;
        return this.f300884b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
