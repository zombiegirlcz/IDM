package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f308888b;

    public e(String title, String cantFindBankCellTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cantFindBankCellTitle, "cantFindBankCellTitle");
        this.f308887a = title;
        this.f308888b = cantFindBankCellTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f308887a, eVar.f308887a) && Intrinsics.f(this.f308888b, eVar.f308888b);
    }

    public final int hashCode() {
        return this.f308888b.hashCode() + (this.f308887a.hashCode() * 31);
    }
}
