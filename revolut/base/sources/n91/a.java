package n91;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f213524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f213525c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f213526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f213527h;
    public final String i;

    public a(long j2, String id10, String name, String currency, String date, String str, String type, String state, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f213523a = id10;
        this.f213524b = name;
        this.f213525c = j2;
        this.d = currency;
        this.e = date;
        this.f = str;
        this.f213526g = type;
        this.f213527h = state;
        this.i = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f213523a, aVar.f213523a) && Intrinsics.f(this.f213524b, aVar.f213524b) && this.f213525c == aVar.f213525c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f213526g, aVar.f213526g) && Intrinsics.f(this.f213527h, aVar.f213527h) && Intrinsics.f(this.i, aVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(a0.d.c(p.a.c(this.f213523a.hashCode() * 31, 31, this.f213524b), 31, this.f213525c), 31, this.d), 31, this.e);
        String str = this.f;
        int iC2 = p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f213526g), 31, this.f213527h);
        String str2 = this.i;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }
}
