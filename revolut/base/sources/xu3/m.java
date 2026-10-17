package xu3;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f308929c;

    public m(String title, String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308927a = title;
        this.f308928b = str;
        this.f308929c = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f308927a, mVar.f308927a) && Intrinsics.f(this.f308928b, mVar.f308928b) && this.f308929c.equals(mVar.f308929c);
    }

    public final int hashCode() {
        int iHashCode = this.f308927a.hashCode() * 31;
        String str = this.f308928b;
        return this.f308929c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
