package fo2;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f136788b;

    public k(String str, ArrayList fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f136787a = str;
        this.f136788b = fields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f136787a, kVar.f136787a) && this.f136788b.equals(kVar.f136788b);
    }

    public final int hashCode() {
        String str = this.f136787a;
        return this.f136788b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
