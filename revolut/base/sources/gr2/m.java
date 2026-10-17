package gr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145848c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ m(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        if (3 != (i & 3)) {
            j1.f(k.f145844a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145846a = str;
        this.f145847b = str2;
        if ((i & 4) == 0) {
            this.f145848c = null;
        } else {
            this.f145848c = str3;
        }
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
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str6;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f145846a, mVar.f145846a) && Intrinsics.f(this.f145847b, mVar.f145847b) && Intrinsics.f(this.f145848c, mVar.f145848c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f145846a.hashCode() * 31, 31, this.f145847b);
        String str = this.f145848c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
