package bka;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();
    public static final Lazy[] f = {null, null, yhm.j.c(yhm.k.PUBLICATION, new bi2.g(23)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f16331c;
    public final boolean d;
    public final String e;

    public /* synthetic */ p(int i, String str, String str2, q qVar, boolean z, String str3) {
        if (31 != (i & 31)) {
            j1.f(n.f16327a.getDescriptor(), i, 31);
            throw null;
        }
        this.f16329a = str;
        this.f16330b = str2;
        this.f16331c = qVar;
        this.d = z;
        this.e = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f16329a, pVar.f16329a) && Intrinsics.f(this.f16330b, pVar.f16330b) && this.f16331c == pVar.f16331c && this.d == pVar.d && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        String str = this.f16329a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16330b;
        return this.e.hashCode() + j6.a.c((this.f16331c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.d);
    }

    public p(String str, String str2, q layout, boolean z, String asset) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f16329a = str;
        this.f16330b = str2;
        this.f16331c = layout;
        this.d = z;
        this.e = asset;
    }
}
