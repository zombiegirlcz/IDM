package n61;

import f5j.t;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f212685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f212686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f212687c;

    public i(ArrayList bankFields, t tVar, boolean z) {
        Intrinsics.checkNotNullParameter(bankFields, "bankFields");
        this.f212685a = bankFields;
        this.f212686b = tVar;
        this.f212687c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f212685a.equals(iVar.f212685a) && this.f212686b == iVar.f212686b && this.f212687c == iVar.f212687c;
    }

    public final int hashCode() {
        int iHashCode = this.f212685a.hashCode() * 31;
        t tVar = this.f212686b;
        return Boolean.hashCode(this.f212687c) + ((iHashCode + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }
}
