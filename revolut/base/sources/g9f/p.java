package g9f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f141568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f141569c;
    public final String d;
    public final String e;
    public final jo3.a f;

    public /* synthetic */ p(int i, String str, String str2, String str3, String str4, String str5, jo3.a aVar) {
        if (15 != (i & 15)) {
            j1.f(n.f141566a.getDescriptor(), i, 15);
            throw null;
        }
        this.f141567a = str;
        this.f141568b = str2;
        this.f141569c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = aVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f141567a, pVar.f141567a) && Intrinsics.f(this.f141568b, pVar.f141568b) && Intrinsics.f(this.f141569c, pVar.f141569c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(this.f141567a.hashCode() * 31, 31, this.f141568b), 31, this.f141569c), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        jo3.a aVar = this.f;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
