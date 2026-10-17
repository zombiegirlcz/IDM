package jhb;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f174198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f174199c;
    public final g d;

    public /* synthetic */ i(int i, String str, String str2, String str3, g gVar) {
        if (15 != (i & 15)) {
            j1.f(d.f174193a.getDescriptor(), i, 15);
            throw null;
        }
        this.f174197a = str;
        this.f174198b = str2;
        this.f174199c = str3;
        this.d = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f174197a, iVar.f174197a) && Intrinsics.f(this.f174198b, iVar.f174198b) && Intrinsics.f(this.f174199c, iVar.f174199c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f174197a.hashCode() * 31, 31, this.f174198b), 31, this.f174199c);
    }
}
