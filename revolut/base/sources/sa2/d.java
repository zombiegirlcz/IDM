package sa2;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f261268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f261269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f261270c;
    public final String d;

    public d(Alias alias, long j2, String verificationCode, String str) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
        this.f261268a = alias;
        this.f261269b = j2;
        this.f261270c = verificationCode;
        this.d = str;
    }

    public static d a(d dVar, long j2, String verificationCode, String str, int i) {
        long j3 = j2;
        Alias alias = dVar.f261268a;
        if ((i & 2) != 0) {
            j3 = dVar.f261269b;
        }
        if ((i & 4) != 0) {
            verificationCode = dVar.f261270c;
        }
        if ((i & 8) != 0) {
            str = dVar.d;
        }
        String str2 = str;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
        return new d(alias, j3, verificationCode, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f261268a, dVar.f261268a) && this.f261269b == dVar.f261269b && Intrinsics.f(this.f261270c, dVar.f261270c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(this.f261268a.hashCode() * 31, 31, this.f261269b), 31, this.f261270c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
