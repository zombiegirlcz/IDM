package gs7;

import gr2.j0;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();
    public static final Lazy[] e = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new j0(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146340c;
    public final d d;

    public /* synthetic */ l(int i, String str, String str2, String str3, d dVar) {
        if (15 != (i & 15)) {
            j1.f(c.f146331a.getDescriptor(), i, 15);
            throw null;
        }
        this.f146338a = str;
        this.f146339b = str2;
        this.f146340c = str3;
        this.d = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f146338a, lVar.f146338a) && Intrinsics.f(this.f146339b, lVar.f146339b) && Intrinsics.f(this.f146340c, lVar.f146340c) && Intrinsics.f(this.d, lVar.d);
    }

    public final int hashCode() {
        String str = this.f146338a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f146339b);
        String str2 = this.f146340c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.d;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public l(String str, String title, String str2, d dVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f146338a = str;
        this.f146339b = title;
        this.f146340c = str2;
        this.d = dVar;
    }
}
