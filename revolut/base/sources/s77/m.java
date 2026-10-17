package s77;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f260548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f260549c;
    public final String d;
    public final String e;

    public /* synthetic */ m(int i, String str, String str2, String str3, String str4, String str5) {
        if (27 != (i & 27)) {
            j1.f(k.f260546a.getDescriptor(), i, 27);
            throw null;
        }
        this.f260547a = str;
        this.f260548b = str2;
        if ((i & 4) == 0) {
            this.f260549c = null;
        } else {
            this.f260549c = str3;
        }
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f260547a, mVar.f260547a) && Intrinsics.f(this.f260548b, mVar.f260548b) && Intrinsics.f(this.f260549c, mVar.f260549c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f260547a.hashCode() * 31, 31, this.f260548b);
        String str = this.f260549c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
