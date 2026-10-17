package f2e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f131595c;
    public final String d;
    public final String e;

    public /* synthetic */ g(int i, String str, String str2, String str3, String str4, String str5) {
        if (7 != (i & 7)) {
            qlm.j1.f(e.f131573a.getDescriptor(), i, 7);
            throw null;
        }
        this.f131593a = str;
        this.f131594b = str2;
        this.f131595c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f131593a, gVar.f131593a) && Intrinsics.f(this.f131594b, gVar.f131594b) && Intrinsics.f(this.f131595c, gVar.f131595c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f131593a.hashCode() * 31, 31, this.f131594b), 31, this.f131595c);
        String str = this.d;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public g(String id10, String endTime, String currentBid, String str, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(endTime, "endTime");
        Intrinsics.checkNotNullParameter(currentBid, "currentBid");
        this.f131593a = id10;
        this.f131594b = endTime;
        this.f131595c = currentBid;
        this.d = str;
        this.e = str2;
    }
}
