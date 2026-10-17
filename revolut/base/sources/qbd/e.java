package qbd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f244180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244181c;

    public /* synthetic */ e(int i, String str, String str2, long j2) {
        if (7 != (i & 7)) {
            j1.f(c.f244175a.getDescriptor(), i, 7);
            throw null;
        }
        this.f244179a = str;
        this.f244180b = j2;
        this.f244181c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f244179a, eVar.f244179a) && this.f244180b == eVar.f244180b && Intrinsics.f(this.f244181c, eVar.f244181c);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f244179a.hashCode() * 31, 31, this.f244180b);
        String str = this.f244181c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public e(String challengeId, long j2, String str) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        this.f244179a = challengeId;
        this.f244180b = j2;
        this.f244181c = str;
    }
}
