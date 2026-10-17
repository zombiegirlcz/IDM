package j19;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f170241c;
    public final k19.c d;
    public final String e;

    public /* synthetic */ r(int i, String str, String str2, String str3, k19.c cVar, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(p.f170232a.getDescriptor(), i, 15);
            throw null;
        }
        this.f170239a = str;
        this.f170240b = str2;
        this.f170241c = str3;
        this.d = cVar;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f170239a, rVar.f170239a) && Intrinsics.f(this.f170240b, rVar.f170240b) && Intrinsics.f(this.f170241c, rVar.f170241c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f170239a.hashCode() * 31, 31, this.f170240b), 31, this.f170241c)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
