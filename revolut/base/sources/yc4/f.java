package yc4;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f312515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f312516c;
    public final Locale d;
    public final boolean e;

    public f(String applicationId, boolean z, boolean z3, Locale locale, boolean z4) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.f312514a = applicationId;
        this.f312515b = z;
        this.f312516c = z3;
        this.d = locale;
        this.e = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f312514a, fVar.f312514a) && this.f312515b == fVar.f312515b && this.f312516c == fVar.f312516c && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + j6.a.c(j6.a.c(this.f312514a.hashCode() * 31, 31, this.f312515b), 31, this.f312516c)) * 31);
    }
}
