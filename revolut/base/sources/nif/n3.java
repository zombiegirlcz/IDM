package nif;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class n3 {

    @NotNull
    public static final m3 Companion = new m3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f215958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215959b;

    public /* synthetic */ n3(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(l3.f215929a.getDescriptor(), i, 3);
            throw null;
        }
        this.f215958a = str;
        this.f215959b = str2;
    }

    public final String a() {
        return this.f215958a;
    }

    public final String b() {
        return this.f215959b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj2;
        return Intrinsics.f(this.f215958a, n3Var.f215958a) && Intrinsics.f(this.f215959b, n3Var.f215959b);
    }

    public final int hashCode() {
        String str = this.f215958a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f215959b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public n3(String str, String str2) {
        this.f215958a = str;
        this.f215959b = str2;
    }
}
