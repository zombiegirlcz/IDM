package qb7;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f244127c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public d() {
        this(0);
    }

    public static d a(d dVar, String str, String str2, boolean z, boolean z3, boolean z4, boolean z6, int i) {
        if ((i & 1) != 0) {
            str = dVar.f244125a;
        }
        String secretPhrase = str;
        if ((i & 2) != 0) {
            str2 = dVar.f244126b;
        }
        String confirmPhrase = str2;
        if ((i & 4) != 0) {
            z = dVar.f244127c;
        }
        boolean z11 = z;
        if ((i & 8) != 0) {
            z3 = dVar.d;
        }
        boolean z12 = z3;
        if ((i & 16) != 0) {
            z4 = dVar.e;
        }
        boolean z29 = z4;
        if ((i & 32) != 0) {
            z6 = dVar.f;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(secretPhrase, "secretPhrase");
        Intrinsics.checkNotNullParameter(confirmPhrase, "confirmPhrase");
        return new d(z11, z12, z29, z6, secretPhrase, confirmPhrase);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f244125a, dVar.f244125a) && Intrinsics.f(this.f244126b, dVar.f244126b) && this.f244127c == dVar.f244127c && this.d == dVar.d && this.e == dVar.e && this.f == dVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(p.a.c(this.f244125a.hashCode() * 31, 31, this.f244126b), 31, this.f244127c), 31, this.d), 31, this.e);
    }

    public /* synthetic */ d(int i) {
        this(false, false, true, false, "", "");
    }

    public d(boolean z, boolean z3, boolean z4, boolean z6, String secretPhrase, String confirmPhrase) {
        Intrinsics.checkNotNullParameter(secretPhrase, "secretPhrase");
        Intrinsics.checkNotNullParameter(confirmPhrase, "confirmPhrase");
        this.f244125a = secretPhrase;
        this.f244126b = confirmPhrase;
        this.f244127c = z;
        this.d = z3;
        this.e = z4;
        this.f = z6;
    }
}
