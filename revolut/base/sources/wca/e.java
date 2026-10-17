package wca;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f296367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f296368c;

    public e(String str, String userOtpInput, long j2) {
        Intrinsics.checkNotNullParameter(userOtpInput, "userOtpInput");
        this.f296366a = str;
        this.f296367b = userOtpInput;
        this.f296368c = j2;
    }

    public static e a(e eVar, String str, String userOtpInput, long j2, int i) {
        if ((i & 1) != 0) {
            str = eVar.f296366a;
        }
        if ((i & 2) != 0) {
            userOtpInput = eVar.f296367b;
        }
        if ((i & 4) != 0) {
            j2 = eVar.f296368c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(userOtpInput, "userOtpInput");
        return new e(str, userOtpInput, j2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f296366a, eVar.f296366a) && Intrinsics.f(this.f296367b, eVar.f296367b) && kotlin.time.b.d(this.f296368c, eVar.f296368c);
    }

    public final int hashCode() {
        String str = this.f296366a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f296367b);
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f296368c) + iC;
    }
}
