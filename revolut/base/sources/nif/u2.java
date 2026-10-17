package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class u2 {

    @NotNull
    public static final t2 Companion = new t2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f216047c;
    public final String d;
    public final dj0.d e;

    public /* synthetic */ u2(int i, String str, String str2, String str3, String str4, dj0.d dVar) {
        if (31 != (i & 31)) {
            qlm.j1.f(s2.f216034a.getDescriptor(), i, 31);
            throw null;
        }
        this.f216045a = str;
        this.f216046b = str2;
        this.f216047c = str3;
        this.d = str4;
        this.e = dVar;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.f216047c;
    }

    public final String c() {
        return this.f216046b;
    }

    public final String d() {
        return this.f216045a;
    }

    public final dj0.d e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj2;
        return Intrinsics.f(this.f216045a, u2Var.f216045a) && Intrinsics.f(this.f216046b, u2Var.f216046b) && Intrinsics.f(this.f216047c, u2Var.f216047c) && Intrinsics.f(this.d, u2Var.d) && Intrinsics.f(this.e, u2Var.e);
    }

    public final int hashCode() {
        String str = this.f216045a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f216046b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f216047c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public u2(dj0.d value, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f216045a = str;
        this.f216046b = str2;
        this.f216047c = str3;
        this.d = str4;
        this.e = value;
    }
}
