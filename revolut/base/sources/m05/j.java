package m05;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f201063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f201065c;

    public j(int i, String str, Integer num) {
        this.f201063a = i;
        this.f201064b = str;
        this.f201065c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f201063a == jVar.f201063a && Intrinsics.f(this.f201064b, jVar.f201064b) && Intrinsics.f(this.f201065c, jVar.f201065c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f201063a) * 31;
        String str = this.f201064b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f201065c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public /* synthetic */ j(String str, int i, int i2, Integer num) {
        if (7 != (i & 7)) {
            j1.f(h.f201062a.getDescriptor(), i, 7);
            throw null;
        }
        this.f201063a = i2;
        this.f201064b = str;
        this.f201065c = num;
    }
}
