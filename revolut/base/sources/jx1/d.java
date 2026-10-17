package jx1;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f179042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f179044c;
    public final String d;

    public d(Clause descriptor, String enteredCode, long j2, String str) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(enteredCode, "enteredCode");
        this.f179042a = descriptor;
        this.f179043b = enteredCode;
        this.f179044c = j2;
        this.d = str;
    }

    public static d a(d dVar, String str, long j2, int i) {
        Clause descriptor = dVar.f179042a;
        if ((i & 2) != 0) {
            str = dVar.f179043b;
        }
        String enteredCode = str;
        if ((i & 4) != 0) {
            j2 = dVar.f179044c;
        }
        String str2 = dVar.d;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(enteredCode, "enteredCode");
        return new d(descriptor, enteredCode, j2, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f179042a, dVar.f179042a) && Intrinsics.f(this.f179043b, dVar.f179043b) && this.f179044c == dVar.f179044c && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = a0.d.c(p.a.c(this.f179042a.hashCode() * 31, 31, this.f179043b), 31, this.f179044c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
