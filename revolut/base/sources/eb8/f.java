package eb8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f124303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f124304c;

    public /* synthetic */ f(int i, String str, int i2, e eVar) {
        if (7 != (i & 7)) {
            j1.f(a.f124297a.getDescriptor(), i, 7);
            throw null;
        }
        this.f124302a = str;
        this.f124303b = i2;
        this.f124304c = eVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f124302a, fVar.f124302a) && this.f124303b == fVar.f124303b && Intrinsics.f(this.f124304c, fVar.f124304c);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f124303b, this.f124302a.hashCode() * 31, 31);
        e eVar = this.f124304c;
        return iB + (eVar == null ? 0 : eVar.hashCode());
    }

    public f(String juniorId, int i, e eVar) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.f124302a = juniorId;
        this.f124303b = i;
        this.f124304c = eVar;
    }
}
