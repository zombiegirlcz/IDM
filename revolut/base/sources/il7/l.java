package il7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class l {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162115c;
    public final String d;
    public final f e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f162116g;

    public /* synthetic */ l(int i, String str, String str2, String str3, String str4, f fVar, String str5, boolean z) {
        if (63 != (i & 63)) {
            j1.f(j.f162112a.getDescriptor(), i, 63);
            throw null;
        }
        this.f162113a = str;
        this.f162114b = str2;
        this.f162115c = str3;
        this.d = str4;
        this.e = fVar;
        this.f = str5;
        if ((i & 64) == 0) {
            this.f162116g = true;
        } else {
            this.f162116g = z;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f162113a, lVar.f162113a) && Intrinsics.f(this.f162114b, lVar.f162114b) && Intrinsics.f(this.f162115c, lVar.f162115c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && Intrinsics.f(this.f, lVar.f) && this.f162116g == lVar.f162116g;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f162113a.hashCode() * 31, 31, this.f162114b), 31, this.f162115c), 31, this.d);
        f fVar = this.e;
        int iHashCode = (iC + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f;
        return Boolean.hashCode(this.f162116g) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public l(String ref2, String iconKey, String name, String description, f fVar, String str, boolean z) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(iconKey, "iconKey");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f162113a = ref2;
        this.f162114b = iconKey;
        this.f162115c = name;
        this.d = description;
        this.e = fVar;
        this.f = str;
        this.f162116g = z;
    }
}
