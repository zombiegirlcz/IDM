package fb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f133523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f133524c;

    public /* synthetic */ r(int i, String str, int i2, n nVar) {
        if (7 != (i & 7)) {
            j1.f(j.f133514a.getDescriptor(), i, 7);
            throw null;
        }
        this.f133522a = str;
        this.f133523b = i2;
        this.f133524c = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f133522a, rVar.f133522a) && this.f133523b == rVar.f133523b && Intrinsics.f(this.f133524c, rVar.f133524c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f133523b, this.f133522a.hashCode() * 31, 31);
        n nVar = this.f133524c;
        return iB + (nVar == null ? 0 : nVar.hashCode());
    }

    public r(String juniorId, int i, n nVar) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f133522a = juniorId;
        this.f133523b = i;
        this.f133524c = nVar;
    }
}
