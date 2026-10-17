package rwg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class i {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f257927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f257928c;

    public /* synthetic */ i(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(g.f257922a.getDescriptor(), i, 7);
            throw null;
        }
        this.f257926a = str;
        this.f257927b = str2;
        this.f257928c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f257926a, iVar.f257926a) && Intrinsics.f(this.f257927b, iVar.f257927b) && Intrinsics.f(this.f257928c, iVar.f257928c);
    }

    public final int hashCode() {
        return this.f257928c.hashCode() + p.a.c(this.f257926a.hashCode() * 31, 31, this.f257927b);
    }
}
