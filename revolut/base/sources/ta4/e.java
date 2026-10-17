package ta4;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f269089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f269090b;

    public e() {
        this(0);
    }

    public static e a(e eVar, String unverifiedEmail, boolean z, int i) {
        if ((i & 1) != 0) {
            unverifiedEmail = eVar.f269089a;
        }
        if ((i & 2) != 0) {
            z = eVar.f269090b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(unverifiedEmail, "unverifiedEmail");
        return new e(unverifiedEmail, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f269089a, eVar.f269089a) && this.f269090b == eVar.f269090b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f269090b) + (this.f269089a.hashCode() * 31);
    }

    public e(String unverifiedEmail, boolean z) {
        Intrinsics.checkNotNullParameter(unverifiedEmail, "unverifiedEmail");
        this.f269089a = unverifiedEmail;
        this.f269090b = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i) {
        this("", false);
        m70.a.c(t0.f186434a);
    }
}
