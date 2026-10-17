package fmg;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class k {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f136434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f136436c;

    public /* synthetic */ k(int i, j jVar, String str, String str2) {
        if (7 != (i & 7)) {
            j1.f(f.f136420a.getDescriptor(), i, 7);
            throw null;
        }
        this.f136434a = jVar;
        this.f136435b = str;
        this.f136436c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f136434a, kVar.f136434a) && Intrinsics.f(this.f136435b, kVar.f136435b) && Intrinsics.f(this.f136436c, kVar.f136436c);
    }

    public final int hashCode() {
        return this.f136436c.hashCode() + p.a.c(this.f136434a.hashCode() * 31, 31, this.f136435b);
    }
}
