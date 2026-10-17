package hjb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class m implements t {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f152688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f152689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f152690c;
    public final String d;
    public final String e;

    public /* synthetic */ m(int i, boolean z, w wVar, w wVar2, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(k.f152687a.getDescriptor(), i, 3);
            throw null;
        }
        this.f152688a = z;
        this.f152689b = wVar;
        if ((i & 4) == 0) {
            this.f152690c = null;
        } else {
            this.f152690c = wVar2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f152688a == mVar.f152688a && Intrinsics.f(this.f152689b, mVar.f152689b) && Intrinsics.f(this.f152690c, mVar.f152690c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f152689b.hashCode() + (Boolean.hashCode(this.f152688a) * 31)) * 31;
        w wVar = this.f152690c;
        int iHashCode2 = (iHashCode + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str = this.d;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public m(boolean z, w primaryRateInfo, w wVar, String str, String str2) {
        Intrinsics.checkNotNullParameter(primaryRateInfo, "primaryRateInfo");
        this.f152688a = z;
        this.f152689b = primaryRateInfo;
        this.f152690c = wVar;
        this.d = str;
        this.e = str2;
    }
}
