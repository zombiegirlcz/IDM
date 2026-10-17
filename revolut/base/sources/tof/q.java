package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements Serializable {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f273001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f273002c;
    public final String d;
    public final String e;
    public final String f;

    public q(String firstName, String lastName, String state, String lastFour, String scheme, String str) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.f273000a = firstName;
        this.f273001b = lastName;
        this.f273002c = state;
        this.d = lastFour;
        this.e = scheme;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f273000a, qVar.f273000a) && Intrinsics.f(this.f273001b, qVar.f273001b) && Intrinsics.f(this.f273002c, qVar.f273002c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f273000a.hashCode() * 31, 31, this.f273001b), 31, this.f273002c), 31, this.d), 31, this.e);
        String str = this.f;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
